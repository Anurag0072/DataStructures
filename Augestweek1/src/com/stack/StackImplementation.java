package com.stack;

public class StackImplementation {
	
	static int currentPointer;
	static int size = 100;
	static int arr[]= new int[size];

	StackImplementation() {
		currentPointer = -1;
	}
	
	static boolean push(int x) {
		if (currentPointer > size) {
			System.out.println("Stack overflow");
			return false;
		}else {
			arr[++currentPointer] = x;
			System.out.println(x + " been pushed in stack");
			return true;
		}
	}
	
	static int pop() {
		if(currentPointer < -1) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x=arr[currentPointer--];
			System.out.println();
			System.out.println("Stack been pooped");
			return x;
			
		}
		
	}
	void display() {
		for(int i = currentPointer; i> -1; i--) {
			System.out.print("->"+ arr[i]);
		}
	}
	
	public static void main(String[] args) {
		StackImplementation st =  new StackImplementation();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.display();
		st.pop();
		st.display();
		st.pop();
	    st.pop();
	    st.display();
	    
	}
}

