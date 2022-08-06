package com.queueusingStack;

import java.util.Stack;

public class QueueStack {
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	static void Enqueue(int x) {
//		Stack<Integer> stack1 = new Stack<>();
//		Stack<Integer> stack2 = new Stack<>();
//		
		while(!stack1.isEmpty()) 
			stack2.push(stack1.pop());
		//stack1.pop();
		
		stack1.push(x);
		while(!stack2.isEmpty()) 
		 stack1.push(stack2.pop());
		//stack2.pop();
		
		//System.out.println(stack1);
		System.out.println("Enqueue is successfull");
	}
	
	static void Dequeue() {
		
		if(stack1.isEmpty()) {
			System.out.println("Stack underflow");
		}
		stack1.pop();
		System.out.println("Dequeue is successfull");
	}
	
	void print() {
	   System.out.println(stack1);
	}
	public static void main(String[] args) {
		QueueStack sq = new QueueStack();
		sq.Enqueue(10);
		sq.Enqueue(20);
		sq.Enqueue(30);
		sq.Enqueue(40);
		sq.print();
		sq.Dequeue();
		sq.print();
		sq.Dequeue();
		sq.print();
		sq.Enqueue(60);
		sq.print();
	}

}
