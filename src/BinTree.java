
public abstract class BinTree {

	public static void parcours_postfx(Node racine){
		System.out.println( "\n\n" + "Parcours postfixé de l'arbre : \n");
		Heap P = new Heap();
		
		Node A = racine;
		
		P.empiler(A);
		
		A = A.getLeftChild();
		
		while ( !P.vide()){
			
			
			while ( A != null ){
				
				P.empiler(A);
				A = A.getLeftChild();
								
			}
			
			A = P.depiler();
			
			System.out.println(A.toString());
			
			while ( !P.vide() && P.tete().getRightChild().getKey() == A.getKey()){
				
				A = P.depiler();
				
				System.out.println(A.toString());
				
				
			}
			
			if ( !P.vide()){
				
				A = P.tete().getRightChild();
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
				
			}
			
			
			
		}
		
	}
	
	public static void parcours_prefx(Node racine){
		
		System.out.println( "\n\n" + "Parcours préfixé de l'arbre : \n");
		
		Heap P = new Heap();
		
		Node A = racine;
		System.out.println(A.toString());
		P.empiler(A);
		
		A = A.getLeftChild();
		
		while ( !P.vide()){
			
			
			while ( A != null ){
				System.out.println(A.toString());
				P.empiler(A);
				A = A.getLeftChild();
								
			}
			
			A = P.depiler();
			
						
			while ( !P.vide() && P.tete().getRightChild().getKey() == A.getKey()){
				
				A = P.depiler();
				
			
				
				
			}
			
			if ( !P.vide()){
				
				A = P.tete().getRightChild();
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
				
			}
					
			
		}
		
	}


	public static void parcours_infx(Node racine){
		System.out.println( "\n\n" + "Parcours inffixé de l'arbre : \n");
		Heap P = new Heap();
		
		Node A = racine;
		
		P.empiler(A);
		
		A = A.getLeftChild();
		
		while ( !P.vide()){
			
			
			while ( A != null ){
				
				P.empiler(A);
				A = A.getLeftChild();
								
			}
			
			A = P.depiler();
			
			System.out.println(A.toString());
			
			while ( !P.vide() && P.tete().getRightChild().getKey() == A.getKey()){
				
				A = P.depiler();
			
				
			}
			
			if ( !P.vide()){
				System.out.println(P.tete().toString());
				
				A = P.tete().getRightChild();
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
				
			}
			
			
			
		}
	
	}
	
	
	
	public static void largeur_dab(Node Racine){
		
		Node A = Racine;
		Queue file = new Queue();
		
		file.enQueue(A);
		
		while ( !file.empty() ){
			
			
			A = file.deQueue();
			System.out.print(A.toString() + "\n");
			
			file.enQueue(A.getLeftChild()); 
			file.enQueue(A.getRightChild());
			
		}
		
	}
	
	
	
	
	public static void Insert (int a,Node R){
		
		if ( a < R.getKey()){
			if ( R.getLeftChild() == null){
				Node T = new Node(a);
				R.setLeftChild(T);
			}
			
			Insert(a,R.getLeftChild());
		}
		if ( a > R.getKey()){
			if ( R.getRightChild() == null){
				Node T = new Node(a);
				R.setRightChild(T);
			}
			Insert(a,R.getRightChild());
		}
	
	}
	
	
	
	
	
	
	
	
}
