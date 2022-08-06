package io.practice;

class Block{
	public int blockData;
	public Block nextBlock;
}

public class difpra {
	private Block head;
	
	public void displayblock() {
		Block currentBlock = head;
		while(currentBlock != null) {
			System.out.print(currentBlock.blockData + "->");
			currentBlock = currentBlock.nextBlock;
		}
		System.out.println("NULL");	
	}
	
	public void inFirst(int data) {
		Block newBlock = new Block();
		newBlock.blockData = data;
		newBlock.nextBlock = head;
		head=newBlock;
	}
	
	public void inLast(int data) {
		Block currentBlock = head;
		while(currentBlock.nextBlock !=null) {
			currentBlock = currentBlock.nextBlock;
		}
		Block newBlock = new Block();
		newBlock.blockData = data;
		currentBlock.nextBlock = newBlock;
	}
	
	public void inpos(int data, int pos) {
		Block currentBlock = head;
		for(int i=0; i< pos-1; i++) {
			currentBlock = currentBlock.nextBlock;
		}
		Block tempBlock = currentBlock;
		currentBlock = currentBlock.nextBlock;
		
		Block newBlock = new Block();
		newBlock.blockData = data;
		tempBlock.nextBlock = newBlock;
		newBlock.nextBlock = currentBlock;
		
	}
	
	public static void main(String[] args) {
		difpra pra = new difpra();
		pra.inFirst(10);
		pra.inFirst(20);
		pra.inFirst(30);
		pra.inLast(60);
		pra.inpos(50, 3);
		pra.inpos(40, 3);
		pra.displayblock();
	}
	

}
