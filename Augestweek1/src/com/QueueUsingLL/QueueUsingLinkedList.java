package com.QueueUsingLL;

class Node{
	public int nodeData;
	public Node nextNode;
	public Node prevNode;
}
public class QueueUsingLinkedList {
	private Node head;
	private Node tail;
	 void Enqueue(int data) {
		Node temp = new Node();
		temp.nodeData = data;
		if(head == null) {
			head = temp;
			return;
		}
		
		Node temp1 = head;
		while(temp1.nextNode != null) {
			temp1 = temp1.nextNode;
		}
		
		temp1.nextNode = temp;
		temp.prevNode = temp1;
		
	 }
	 void DeQueue() {
		 head = head.nextNode;
	 }
	 
	 void display() {
		 
		 Node currentNode = head;
		 while(currentNode != null) {
			 System.out.print(currentNode.nodeData + "<-");
			 currentNode = currentNode.nextNode;
		 }
		 System.out.println();
	 }
	 
	 public static void main(String[] args) {
		
		 QueueUsingLinkedList queue = new QueueUsingLinkedList();
		 queue.Enqueue(10);
		 queue.Enqueue(20);
		 queue.Enqueue(30);
		 queue.Enqueue(40);
		 queue.Enqueue(50);
		 queue.display();
		 queue.DeQueue();
		 queue.display();
		 queue.DeQueue();
		 queue.display();
		 queue.Enqueue(60);
		 queue.display();
	}

}
