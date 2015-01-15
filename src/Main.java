
public class Main {
	
	public static void main (String[] args){
		/*
		Node arbre_post = new Node(7),arbre_inf = new Node (4);
		Node arbre_pre = new Node(1);
				
		arbre_post.addLeftChild(3);
		arbre_post.addRightChild(6);
		arbre_post.getLeftChild().addLeftChild(1);
		arbre_post.getLeftChild().addRightChild(2);
		arbre_post.getRightChild().addLeftChild(4);
		arbre_post.getRightChild().addRightChild(5);
		
		
	
		
		arbre_inf.addLeftChild(2);
		arbre_inf.addRightChild(6);
		arbre_inf.getLeftChild().addLeftChild(1);
		arbre_inf.getLeftChild().addRightChild(3);
		arbre_inf.getRightChild().addLeftChild(5);
		arbre_inf.getRightChild().addRightChild(7);
		
		arbre_pre.addLeftChild(2);
		arbre_pre.addRightChild(5);
		arbre_pre.getLeftChild().addLeftChild(3);
		arbre_pre.getLeftChild().addRightChild(4);
		arbre_pre.getRightChild().addLeftChild(6);
		arbre_pre.getRightChild().addRightChild(7);

		
		
		BinTree.parcours_infx(arbre_inf);
		
		BinTree.parcours_postfx(arbre_post);
		
		BinTree.parcours_prefx(arbre_pre);
		
	
		
		int[] t = {5,98,62,7,6,8,9,1,0,1,89,8,7,5,48,7};
		
		ListC liste = new ListC(t,0);
		
		liste.afficher();
		System.out.println(" le tableau trié bitch :D ! \n");
		liste.sort().afficher();
		
		*/
		
		Node arbre_post = new Node(14);
		
		BinTree.Insert(7, arbre_post);
		
		BinTree.Insert(21, arbre_post);
		
		BinTree.Insert(4, arbre_post);
		
		BinTree.Insert(10, arbre_post);
		
		BinTree.Insert(18, arbre_post);
		
		BinTree.Insert(23, arbre_post);
		
		BinTree.Insert(3, arbre_post);
		
		BinTree.Insert(5, arbre_post);
		
		BinTree.Insert(8, arbre_post);
		
		BinTree.Insert(11, arbre_post);
		
		BinTree.Insert(17, arbre_post);
		
		BinTree.Insert(19, arbre_post);
		
		BinTree.Insert(22, arbre_post);
		
		BinTree.Insert(24, arbre_post);
		
		BinTree.largeur_dab(arbre_post);
		
		
		
		
		/*
		arbre_post.addLeftChild(2);
		arbre_post.addRightChild(3);
		arbre_post.getLeftChild().addLeftChild(4);
		arbre_post.getLeftChild().addRightChild(5);
		arbre_post.getRightChild().addLeftChild(6);
		arbre_post.getRightChild().addRightChild(7);
		
		BinTree.largeur_dab(arbre_post);
		*/
	}
	
	

}
