package com.stackUsingLL;
class Node{
	int nodeData;
	public Node NextNode;
}

public class StackUsingLL {
	private Node head;
	
	void Insert(int data) {
		
		Node temp = new Node();
		temp.nodeData = data;
		temp.NextNode = head;
		head = temp;
	}
	void delete(int data) {
		head = head.NextNode;
	}
	
	void display() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.nodeData + "->" );
			currentNode = currentNode.NextNode;
		}
		//System.out.println("Null");
	}
	
	public static void main(String[] args) {
		StackUsingLL no = new StackUsingLL();
		no.Insert(10);
		no.Insert(20);
		no.Insert(30);
		no.Insert(40);
		no.Insert(50);
		//no.display();
		no.delete(2);
		no.display();
		
	}

}
