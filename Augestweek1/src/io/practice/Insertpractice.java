package io.practice;

class Node{
	public int nodeData ;
	public Node nextNode;
}

public class Insertpractice {
	
	private Node head;
	
	public void displayll() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.nodeData + "->");
			currentNode = currentNode.nextNode;
		}
		System.out.println("Null");
	}
	
	public void InsertAtFirst(int data) {
		//Node currentNode = head;
		Node newNode = new Node();
		newNode.nodeData = data;
		newNode.nextNode = head;
		//currentNode= currentNode.nextNode;
		head=newNode;
	}
	
	public void InsertAtLast(int data) {
		Node currentNode = head;
		while(currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}
		Node newNode = new Node();
		newNode.nodeData = data;
		currentNode.nextNode = newNode;
	}
	
	public void InsertAtPos(int data, int pos) {
		Node currentNode = head;
		for(int i=0; i< pos-1;i++) {
			currentNode = currentNode.nextNode;
		}
		
		Node tempNode = currentNode;
		currentNode = currentNode.nextNode;
		
		Node newNode = new Node();
		newNode.nodeData = data;
		tempNode.nextNode=newNode;
		newNode.nextNode = currentNode;
	}
	
	public void deleteFirst() {
		head = head.nextNode;
	}
	public void deleteLast() {
		Node currentNode = head;
		if(head.nextNode==null) 
			head = null;
		
		while(currentNode.nextNode.nextNode!=null) {
			currentNode=currentNode.nextNode;
		}
		currentNode.nextNode=null;
		
	}
	public void deletePos(int pos) {
		if(head == null)
			return;
	    Node temp = head.nextNode;
		if(pos ==1) {
			head = temp.nextNode;
			return;
		}
		for(int i=0; temp !=null && i< pos-1;i++) 
			temp = temp.nextNode;
		
		if(temp ==null || temp.nextNode == null) {
			System.out.println("position entered is out of index");
			return;
		}
		
		Node next = temp.nextNode.nextNode;
		temp.nextNode = next;
	}
	
	public static void main(String[] args) {
		Insertpractice ip = new Insertpractice();
		ip.InsertAtFirst(10);
		ip.InsertAtFirst(20);
		ip.InsertAtFirst(30);
		ip.InsertAtLast(50);
		ip.InsertAtPos(70, 2);
		ip.displayll();
		ip.deleteFirst();
		ip.displayll();
		ip.deleteLast();
		ip.displayll();
		ip.deletePos(1);
		ip.displayll();
	}
	
	

}
