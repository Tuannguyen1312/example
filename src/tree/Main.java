package tree;

public class Main {
	
	
	
	public static void main(String[] args) {
		myTree mt = new myTree();
		mt.insert(27);
		mt.insert(19);
		mt.insert(10);
		mt.insert(21);
		mt.insert(25);
		mt.insert(35);
		mt.insert(41);
		mt.insert(12);
		mt.insert(46); 
		mt.insert(7);
		System.out.print("inorder: ");
		mt.inorderTraversal(mt.root);
		System.out.print("preorder: ");
		mt.preorderTraversal(mt.root);
		System.out.print("postorder: ");
		mt.postorderTraversal(mt.root);
	}
	
}
