package btvn;

public class Main {
	public static void main(String[] args) {
        Tree bst = new Tree();

        // Thêm các sinh viên vào BST
        bst.insert(new student(3, "An", 3.5));
        bst.insert(new student(1, "Bình", 3.8));
        bst.insert(new student(5, "Cường", 2.9));
        bst.insert(new student(2, "Dũng", 3.2));
        bst.insert(new student(4, "Hà", 3.6));

        // Thực hiện các phương thức duyệt cây
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
    }
}
