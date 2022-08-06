package com.stack;

public class Stackchar {
	static int currentPointer;
	//static String data;
	static int size = 100;
	static char ba;
	static char a [] = new char[size];
	
    
	Stackchar(){
		currentPointer = -1;
	}
	
	static boolean pushing(char x) {
		if(currentPointer > size) {
			System.out.println("Stack overflow");
			return false;
		}
		a[++currentPointer] = x;
		System.out.println(x+" character been pushed ");
		return true;
	}
	
	static boolean popping(char x) {
		if(currentPointer > -1) {
			System.out.println("Stack underflow");
			return false;
		}
		x = a[currentPointer--];
		System.out.println(x + " been pooped");
		return true;
	}
	
	void print() {
		for(int i = currentPointer;i>-1; --i) {
			System.out.print("->" + a[i]);
		}
	}
	
	public static void main(String[] args) {
		Stackchar cs = new Stackchar();
		cs.pushing('a');
		cs.pushing('n');
		cs.pushing('u');
		cs.pushing('r');
		cs.pushing('a');
		cs.pushing('g');
		cs.print();
				
	}
}
