package tree;

public class myTree {
	Node root;
	public myTree() {
		root = null;
		
	}
	
	// chèn root vào tree
	void insert(int key) {
		root = insertAt( root , key);
		
	}
	
	Node insertAt(Node root , int key) {
		
		if (root==null) {
			root = new Node(key);
			return root;
		}else {
			if(key<root.key) {
				root.left = insertAt(root.left,key);
				
			}
			else {
				root.right = insertAt(root.right,key);
			}
			
			return root;
		}
		
	}
	
	public void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.println(root.key +" ");
			inorderTraversal(root.right);
		}
	}
	
	public void preorderTraversal(Node root) {
		if(root != null) {
			System.out.println(root.key +" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	public void postorderTraversal(Node root) {
		if(root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.key +" ");
		}
	}
	
}
