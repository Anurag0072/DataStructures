package com.stack;

public class StackString {
	static int pointer;
	static int size = 1000;
	static String [] st = new String[size];
	
	StackString() {
		pointer = -1;
	}
	
	static boolean pushin(String x) {
		if (pointer > size) {
			System.out.println("Stack overflow");
			return false;
		}else {
			st[++pointer] = x;
			return true;
		}
		
	}
	static boolean popin(String x) {
		if(pointer < -1) {
			System.out.println("Stack underflow");
			return false;
		}else {
			x= st[pointer--];
			return true;
		}
		
	}
	void showStack() {
		for(int i = pointer; i>-1; i--) {
			System.out.print("->"+st[i]);
		}
	}
	
	public static void main(String[] args) {
		StackString ss = new StackString();
		ss.pushin("Stack");
		ss.pushin(" cool");
		ss.pushin("do");
		ss.pushin("you");
		ss.pushin("love");
		ss.pushin("it");
		ss.showStack();
	}

}
