
public class Cell {

	public Cell (int key){
		
						
		this.setKey(key);
		this.setNext(null);
		
	}
	
		
	public Cell getNext() {
		return next;
	}
	public void setNext(Cell next) {
		this.next = next;
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	private Cell next;
	private int key;
}
