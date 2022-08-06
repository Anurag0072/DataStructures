package com.queueImp;

public class Queue {
	static int arr [];
	static int rear;
	static int front;
	static int size=3;
	 public Queue() {
		 arr = new int[size];
		 rear = -1;
		 front=-1;
	 }
	 
	 public boolean isFull() {
		 if (rear == size-1) {
			 return true;
		 }
		 return false;
	 }
	 
	 public boolean isEmpty() {
		 if(front == -1) {
			 return true;
		 }
		 return false;
	 }
	 
	 void Enqueue(int data) {
		 if(!isFull()) {
			 rear++;
			 arr[rear] = data;
			 System.out.println(arr[rear] + " insearted");
			 if(front == -1) {
				 front =0;
			 }
		 }else {
			 System.out.println("System overflow");
		 }
	 }
	 
	 void Dequeue() {
		 if(isEmpty()) {
			 System.out.println("Queue Unnderflow");
		 }else {
			 System.out.println(arr[front] + " deleted");
			 
			 if(rear == front) {
				 front =-1;
				 rear =-1;
			 }else 
				 front++;
			 
		 }
	 }
	 
//	 void print() {
//		 for(int i=0; i<arr.length;i++) {
//			 System.out.print("<-" + arr[i]);
//		 }
//		 System.out.println();
//	 }
	 public static void main(String[] args) {
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Dequeue();
		q.Dequeue();
		q.Enqueue(60);
		q.Enqueue(70);
		q.Dequeue();
		q.Enqueue(90);
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		
	}

}
