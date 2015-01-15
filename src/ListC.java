
public class ListC {

	
	public ListC(int[] table,int a){
		
		racine = new Cell(table[0]);
		
		Cell B,A = racine;
		
		
		for ( int i = 1; i < table.length ; i ++ ){
			
			B = new Cell(table[i]);
			A.setNext(B);
			A = A.getNext();
		
		}
		
	}
	
	public ListC(Cell racine){
		
		this.racine = racine;
		
	}
	
	public ListC sort(){
		
		Cell lt,l,t,a,b=null;
		l = racine;
		lt = l;
		l = l.getNext();
		lt.setNext(null);
		
		while ( l != null){
			
			t = l;
			l = l.getNext();
			t.setNext(null);
			boolean middle = false,added = false;
			a = lt;
			
			if ( t.getKey() <= lt.getKey()){
			
				t.setNext(lt);
				lt = t;
				added = true;
								
			}
			
			
			
			while (a != null && t.getKey() > a.getKey()  && !added){
				b = a;
				a = a.getNext();
								
			}
			
			if ( !added && a != null){
				
				b.setNext(t);
				t.setNext(a);
				added = true;
								
			}
			
			else if ( !added && a == null ){
				
				b.setNext(t);
				added = true;
			}
			
		
			
			
		}
		ListC sorted = new ListC(lt);
		return sorted;
		
	}
	
	public void afficher(){
		
		Cell A = racine;
		while( A != null){
			
			System.out.print( " ** " +A.getKey()+"\n");
			A=A.getNext();			
		}
				
	}
	
	private Cell racine;
}
