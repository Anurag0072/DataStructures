package com.ciecularLL;

public class CirLL {
	class Node{
		int data;
		Node nextNode;
		Node prevNode;
		
		Node(int data){
			this.data = data;
			nextNode = null;
			prevNode = null;
		}
	}
	Node head;
	Node tail;
	void Insert(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}
		if(tail == null) {
			tail = temp;
		}else {
			tail.nextNode = temp;
			tail = temp;
		}
		tail.nextNode = head;
	}
	void Display() {
		if (head == null) {
			return;
		}
		Node temp = head;
		System.out.print(temp.data + "->");
		temp = temp.nextNode;
		while(temp != head) {
			System.out.print(temp.data + "->");
			temp = temp.nextNode;
		}
		
	}
	
	void delete(int data) {
		Node temp = find(data);
		
		if(temp == null) {
			System.out.println("Element not found");
			return;
		}
		if(temp == head && temp.data == data) {
			if(head == tail)
				head = tail = null;
			else {
				head = head.nextNode;
				tail.nextNode = head;
			}
		}else {
			if(temp.nextNode == head)
				tail = temp;
			temp.nextNode = temp.nextNode.nextNode;
		}
	}
	
	Node find(int data) {
		if(head == null)
			return null;
		Node temp = head;
		if(temp.data == data) 
			return temp;
		while(temp.nextNode!= head) {
			if(temp.nextNode.data == data)
				return temp;
			temp = temp.nextNode;
		}
		return null;
	}
	public static void main(String[] args) {
		CirLL nod = new CirLL();
		nod.Insert(10);
		nod.Insert(20);
		nod.Insert(30);
		nod.Insert(40);
		nod.Insert(50);
		nod.delete(50);
		nod.Display();
		
		
	}

}
