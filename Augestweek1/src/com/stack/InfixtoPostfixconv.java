package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixtoPostfixconv {
	
	static int predesence(char op) {
		switch(op) {
		case '/':
			return 1;
			
		case '*':
			return 3;
			
		case '-':
			return 2;
		
		case '+':
			return 4;
		}
		return -1;
	}
	
	public static String infixToPostfix(String infix) {
		String postfix = " ";
		Stack<Character> opStack = new Stack<>();
		for(int i=0 ; i< infix.length();i++) {
			char ch = infix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				postfix += ch;
			}else if (ch == '(') {
				opStack.push(ch);
			}else if (ch == ')') {
				while(!opStack.isEmpty() && opStack.peek() != '(') 
					postfix += opStack.pop();
				opStack.pop();
			}else {
				while(!opStack.isEmpty() && predesence(ch)> opStack.peek()) 
			
				postfix += opStack.pop();
			opStack.push(ch);
			}
		}
		while(!opStack.isEmpty()) {
			postfix += opStack.pop();
		}
		return postfix;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String infix = sc.nextLine();
		String postfix =infixToPostfix(infix);
		System.out.println(postfix);
	}

}
