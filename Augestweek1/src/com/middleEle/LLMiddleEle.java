package com.middleEle;
import java.util.LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next= null;
	}
	
	
}

public class LLMiddleEle {
	Node head;
	void printMiddle() {
		Node firstPointer = head;
		Node secondPointer = head;
		
		while(firstPointer !=null && firstPointer.next != null) {
			firstPointer = firstPointer.next.next;
			secondPointer = secondPointer.next;
			
		}
		System.out.println("The Middle element is [" + secondPointer.data + "]/n");
		
	}
	
	void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	void display() {
		Node  currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LLMiddleEle bro = new LLMiddleEle();
		//LinkedList<String> ll = new LinkedList<String>();
		
		for(int i=5;i>0;--i) {
			bro.push(i);
			bro.display();
			bro.printMiddle();
		}
			
	}

}
