package btvn;

public class Tree {
	 private Node root;

	    public Tree() {
	        root = null;
	    }

	    // Thêm một sinh viên vào BST
	    public void insert(student student) {
	        root = insertRec(root, student);
	    }

	    private Node insertRec(Node root, student student) {
	        if (root == null) {
	            return new Node(student);
	        }
	        if (student.id < root.data.id) {
	            root.left = insertRec(root.left, student);
	        } else if (student.id > root.data.id) {
	            root.right = insertRec(root.right, student);
	        }
	        return root;
	    }

	    // Duyệt cây theo Pre-order (NLR)
	    public void preOrder() {
	        System.out.println("Pre-order Traversal:");
	        preOrderRec(root);
	        System.out.println();
	    }

	    private void preOrderRec(Node root) {
	        if (root != null) {
	            System.out.println(root.data);
	            preOrderRec(root.left);
	            preOrderRec(root.right);
	        }
	    }

	    // Duyệt cây theo In-order (LNR)
	    public void inOrder() {
	        System.out.println("In-order Traversal:");
	        inOrderRec(root);
	        System.out.println();
	    }

	    private void inOrderRec(Node root) {
	        if (root != null) {
	            inOrderRec(root.left);
	            System.out.println(root.data);
	            inOrderRec(root.right);
	        }
	    }

	    // Duyệt cây theo Post-order (LRN)
	    public void postOrder() {
	        System.out.println("Post-order Traversal:");
	        postOrderRec(root);
	        System.out.println();
	    }

	    private void postOrderRec(Node root) {
	        if (root != null) {
	            postOrderRec(root.left);
	            postOrderRec(root.right);
	            System.out.println(root.data);
	        }
	    }
}
