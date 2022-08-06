package com.queueImp;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueue {
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	
	void push(int data) {
		q2.add(data);
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		System.out.println(data + " been inserted");
		
		Queue<Integer>q = q1;
		q1 = q2;
		q2 = q;
		System.out.println(q1);
		}
	
	void pop() {
//		q1.remove();
		q1.remove();
		System.out.println("popping successful");
		System.out.println(q1);
	}
	
	void print() {
		System.out.println(q1.peek()+ " is the peak");
		System.out.println(q1.size() +" is the size");
		
	}
	public static void main(String[] args) {
		StackusingQueue suq = new StackusingQueue();
		suq.push(10);
		suq.push(20);
		suq.push(30);
		suq.push(40);
		
		
		suq.print();
		suq.pop();
		suq.print();
		suq.pop();
		suq.print();
	}
		
	
	
}
