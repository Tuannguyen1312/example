package linkedlist.student;



public class MyList {
	Node head,tail;
	
	public MyList() 
	{
		head = tail = null;
	}
	public boolean isEmpty () 
	{
		return (head == null);
	}
	public void add(Student s) 
	{
		Node q = new Node(s);
		if(isEmpty()) {
			head = tail = q;
		}else {
			tail.next = q;
			tail = q;
		}
	}
	
	// ham duyet danh sach lien ket 
	
	public void traverse() {
		Node p = head;
		while(p!=null){
			System.out.println(p.student.toString());
			p = p.next;
		}
	}
}
