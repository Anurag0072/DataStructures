package com.doublyLL;

class Node{
	int key;
	Node nextNode;
	Node prevNode;
	
	
	Node(int key){
		this.key = key;
		nextNode = null;
		prevNode = null;
	}
}

class DoublyLinkedList{
	Node listHead;
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertBeg(10);
		dll.insertBeg(20);
		dll.insertBeg(30);
		dll.insertEnd(40);
		dll.insertBeg(50);
		dll.insertEnd(60);
		dll.delete(20);
		dll.display();
		
		//dll.display();
		
	}
	
	void insertBeg(int key) {
		Node temp = new Node(key);
		if(listHead == null) {
			listHead = temp;
			return;
		}
		temp.nextNode = listHead;
		listHead.prevNode = listHead;
		listHead = temp;
		
	}
	
	void insertEnd(int key) {
		Node temp = new Node(key);
		if(listHead == null) {
			listHead = temp;
			return;
		}
		Node temp1 = listHead;
		while(temp1.nextNode != null) {
			temp1 = temp1.nextNode;
		}
		temp1.nextNode = temp;
		temp.prevNode = temp1;
	}
	
	Node find(int key) {
		Node temp = listHead;
		while(temp!=null) {
			if(temp.key == key)
				return temp;
			temp = temp.nextNode;
		}
		return null;
	}
	
	void delete(int key) {
		if(listHead == null) {
			System.out.println("no element to be deleted");
			return;
		}
		Node temp = find(key);
		if(temp == null) {
			System.out.println("Element not found");
			return;
		}
		if(temp == listHead) {
			listHead = listHead.nextNode;
			return;
		}
		temp.prevNode.nextNode = temp.nextNode;
		if(temp.nextNode != null)
			temp.nextNode.prevNode = temp.prevNode;
		
	}
	
	void display() {
		if(listHead == null)
			return;
		Node temp = listHead;
		while(temp != null) {
			System.out.print(temp.key + " ");
			temp = temp.nextNode;
		}
	}
}

