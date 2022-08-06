package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class IntoPostmyway {
	
	static int predec(char op) {
		switch(op) {
		case '-':
			return 1;
		case '+':
			return 2;
		case '/':
		    return 3;
		case '*':
			return 4;
		}
		return -1;
	}
	
	static String intoPostconv(String in) {
		String post=" ";
		Stack<Character> Stackop = new Stack<>();
		for(int i=0 ;i<in.length();i++)
		{
			char ch = in.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				post +=ch;
			}else if (ch == '(') {
				Stackop.push(ch);
			}else if (ch == ')') {
				while(!Stackop.isEmpty() && Stackop.peek() != '(') 
					post += Stackop.pop();
			    Stackop.pop();
			}else {
				while(!Stackop.isEmpty() && predec(ch) > Stackop.peek()) {
					post += Stackop.pop();
				}
				Stackop.push(ch);
			}
			
		}
		while(!Stackop.isEmpty()) {
			post += Stackop.pop();
		}
		return post;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String post = intoPostconv(in);
		System.out.println(post);
	}

}
