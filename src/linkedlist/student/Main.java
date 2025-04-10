package linkedlist.student;

//import  linkedlist.student.Student;

public class Main {
	
	
	
	public static void bubbleSort(double []a ) {
		int i,j;
		int n = a.length;
    
		
		for(i=0; i< n-1; i++) {
			for( j= n-1 ; j>i ; j--) {
				if(a[j]<a[j-1]) {
					double temp = a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				
					 
				}
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student (1,"Tran thi Trang ",8.0);
		Student s2 = new Student (2,"Nguyen Viet Chinh ",8.5);
		Student s3 = new Student (3,"Doan Van Toan ",9.0);
		
		MyList ml = new MyList();
		
		// thêm các phần tử vào list và in ra 
		ml.add(s1);
		ml.add(s2);
		ml.add(s3);
		ml.traverse();
		
		System.out.println();
		
	/*	double[] marks = new double[students.length];
        for (int i = 0; i < students.length; i++) {
        	marks[i] = students[i].getScore();
        }

		
		
		bubbleSort(marks);
        
        // In điểm sau khi sắp xếp
        System.out.println("Điểm sinh viên sau khi sắp xếp: ");
        for (int score : marks) {
            System.out.print(score + " ");
        }*/
		
}
}
