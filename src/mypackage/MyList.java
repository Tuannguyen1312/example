package mypackage;

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
	public void add(int x) 
	{
		Node q = new Node(x);
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
			System.out.println(p.info);
			p = p.next;
		}
	}
	
	
}
