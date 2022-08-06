package com.stack;

import java.util.Stack;

public class Bractes {
	static String isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '(' || s.charAt(i)=='{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}else {
				if(stack.isEmpty()) {
					return "No";
				}else {
					char pop_val = stack.pop();
					if(s.charAt(i)==')' && pop_val != '(') {
						return "No";
					}else if (s.charAt(i)=='}' && pop_val != '{') {
						return "No";
					}else if (s.charAt(i)==']' && pop_val != '[') {
						return "No";
					}	
				}
			}
		}
		if(stack.isEmpty()) {
			return "yes";
		}else {
			return "No";
		}
	}
	
	public static void main(String[] args) {
		String s = "{[()]}";
		System.out.println(isBalanced(s));
		
		String si = "{[(])}";
		System.out.println(isBalanced(si));
		
		String se = "{{[[(())]]}}";
		System.out.println(isBalanced(se));
		
	}
}
