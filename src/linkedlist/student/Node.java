package linkedlist.student;


public class Node {
	Student student;
	Node next;
	 
	public Node (Student student,Node next) {
		this.student = student ;
		this.next = next;
	}
	
	public Node (Student s) 
	{
		this.student = s ;
		this.next = null;
	}
	
	
}
