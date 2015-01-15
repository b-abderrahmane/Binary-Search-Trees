
public class Heap {

	public Heap(){
		
		
	}
	
	private Node[] heap = new Node[100];
	private int counter=0;
	
	public void empiler( Node key){
		heap[counter]= key;
		counter++;
	}
	
	public Node depiler( ){
		counter --;
		return heap[counter];
	}
	
	public Node tete(){
		
		return heap[counter-1];
		
	}
	
	public boolean vide(){
		
		if (counter==0) return true;
		else return false;
		
		
	}
	
}
