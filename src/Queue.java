
public class Queue {

	public Queue(){
		
	}
	
	public boolean enQueue(Node n){
		
		if ( n == null ){return false;}
		Queue[first_free] = n;
		first_free++;
		return true;
	}
	
	public Node deQueue(){
		
		Node t = Queue[0];
		for ( int i = 1 ; i < first_free ; i ++ ){
			
			Queue[i-1] = Queue[i];
		}
		
		first_free--;
		return t;
		
	}
	
	public boolean empty(){
		
		if ( first_free == 0){return true;}
		else { return false;}
		
		
	}
	
	
	private Node[] Queue = new Node[100];
	private int first_free = 0;
	
}
