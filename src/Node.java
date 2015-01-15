
public class Node {

	private int key;
	private Node leftChild = null;
	private Node rightChild = null;
	
	
	public Node ( int key ){
		this.key = key;
	}
	
	public int getKey(){
		return key;
	}
	
	
	public String toString(){
		return "key : " + key;
	}
	
	public void addLeftChild (int key){
		
		setLeftChild(new Node(key));
			
	}
	
	public void addRightChild (int key){
		
		setRightChild(new Node(key));
			
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
}
