package com.linkedList;

import java.util.Scanner;

class Node{
	public int nodeData;
	public Node nextNode;
}

public class Insert {
	private Node head ;
	public void  displayLinkedList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.nodeData + " -> ");
			currentNode = currentNode.nextNode;
		}
		System.out.println("Null");
	}
	
	public void InsertFirst(int data) {
		Node newNode = new Node();
		newNode.nodeData = data;
		newNode.nextNode = head;
		head = newNode;
	}
	
	public void InsertLast(int data) {
		Node currentNode = head;
		while(currentNode.nextNode != null) {
			currentNode= currentNode.nextNode;
		}
		Node newNode = new Node();
		newNode.nodeData =data;
		currentNode.nextNode = newNode;
	}
	
	public void Insertpos(int data, int pos) {
		Node currentNode = head;
		for(int i=0; i< pos-1; i++) {
			currentNode = currentNode.nextNode;
		}
		Node tempNode = currentNode;
		currentNode = currentNode.nextNode;
		
		Node newNode = new Node();
		newNode.nodeData = data;
		
		tempNode.nextNode = newNode;
		newNode.nextNode = currentNode;
	}
	
	public void deleteAtFront() {
		head = head.nextNode;
	}
	
	public void deleteAtLast() {
		Node currentNode =head;
		
		if(head.nextNode == null) {
			head = null;
		}else {
			while(currentNode.nextNode.nextNode!=null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = null;
		}
	}
	
	public void deleteAtPos(int position) {
		if(head == null) 
			return;
		Node temp = head;
		
		if(position ==1) {
			head = head.nextNode;
			return;
		}
		
		//find the previous node that has to be deleted
		
		for(int i=0; temp!=null && i< position-1; i++)
			temp = temp.nextNode;
		
		if(temp == null || temp.nextNode == null) {
			System.out.println("Position entered is more than the number present in the list");
			return;
		}
		Node next = temp.nextNode.nextNode;
		temp.nextNode = next;
	}
	
	public void serch(int c) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value to be found: ");
//		c = sc.nextInt();
		Node currentNode = head;
		if(currentNode.nextNode != null) {
			if(currentNode.nodeData== c) {
				System.out.println("Node Found");
				
			}else {
				currentNode = currentNode.nextNode;
			}
		}else {
			System.out.println("Key does not exist");
		}
		
				
			
			
	}
	public void reverseIterator() {
		if(head == null || head.nextNode == null)
			return;
		
		Node prevNode = head;
		Node currentNode = head.nextNode;
		
		while(currentNode != null) {
			Node nextNode = currentNode.nextNode;
			currentNode.nextNode = prevNode;
			
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head.nextNode = null;
		head = prevNode;
	}
		
	
	
	public static void main(String[] args) {
		Insert ll = new Insert();
		ll.InsertFirst(10);
		ll.InsertFirst(9);
		ll.InsertFirst(40);
		ll.InsertLast(10);
		ll.Insertpos(30, 2);
		ll.displayLinkedList();
		//ll.deleteAtFront();
		//ll.displayLinkedList();
		//ll.deleteAtLast();
		//ll.displayLinkedList();
		//ll.deleteAtPos(2);
		//ll.displayLinkedList();
		ll.serch(50);
		ll.reverseIterator();
		ll.displayLinkedList();
	}

}
