package com.polynomialLL;

class Node{
	
	int pow;
	int coeff;
	Node nextNode;
	
	Node(int coeff, int pow){
		this.coeff = coeff;
		this.pow = pow;
	}
}

class LinkedList {
	Node head;
	Node tail;
	
	void Insert(int  data, int pow) {
		Node temp = new Node(data, pow);
		if(head == null) {
			head = tail = temp;
			return;
		}
		tail.nextNode = temp;
		tail = temp;
	}
	
	void display() {
		if(head == null)
			return;
		
		Node temp = head;
		while(temp.nextNode != null) {
			System.out.print("("+ temp.coeff+"x^"+temp.pow+")+");
			temp = temp.nextNode;
		}
		System.out.println("("+temp.coeff+"x^"+temp.pow+")");
	}
	
	

}

public class  polyLL{
	static LinkedList add(LinkedList exp1, LinkedList exp2) {
		if(exp1.head == null)
			return exp2;
		if(exp2.head == null)
			return exp1;
		
		LinkedList sum = new LinkedList();
		Node temp1 = exp1.head;
		Node temp2 = exp2.head;
		
		while(temp1 !=null && temp2 != null) {
			if(temp1.pow > temp2.pow) {
				sum.Insert(temp1.coeff, temp1.pow);
				temp1 = temp1.nextNode;
			}else if(temp2.pow>temp2.pow) {
				sum.Insert(temp2.coeff, temp2.pow);
				temp2 = temp2.nextNode;
			}else {
				sum.Insert(temp1.coeff+ temp2.coeff, temp1.pow);
				temp1 = temp1.nextNode;
				temp2 = temp2.nextNode;
			}
			
		}
		
		while(temp1 != null) {
			sum.Insert(temp1.coeff, temp1.pow);
			temp1 = temp1.nextNode;
		}
		while(temp2 != null) {
			sum.Insert(temp2.coeff, temp2.pow);
			temp2 = temp2.nextNode;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int []coeff1 = {2,-5,7};
		int []pow1 = {2,1,0};
		
		int [] coeff2 = {3,7};
		int [] pow2 = {1,0};
		
		LinkedList exp1 = new LinkedList();
		LinkedList exp2 = new LinkedList();
		
		for(int i=0; i<coeff1.length; i++) {
			exp1.Insert(coeff1[i], pow1[i]);
		}
		for(int i=0; i< coeff2.length; i++) {
			exp2.Insert(coeff2[i], pow2[i]);
		}
		
		LinkedList sum = add(exp1, exp2);
		sum.display();
		}
	
}
