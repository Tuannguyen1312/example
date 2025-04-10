package linkedlist.student;


public class Student {
	private	int id ;
	private String name;
	private double marks;
	
	
	
	public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
     }
	
	
     public String getRank(double marks) {
    	 if(marks < 5.0) return "fail";
    	 else if(marks < 6.5) return "Medium";
    	 else if(marks < 7.5) return "Good";
    	 else if(marks < 9.0) return "Very Good";
    	 else return "Excellent";
     
    }
	public String toString() {
		return "Student{" + "id=" + id + ", name= " + name +",mark=" + marks + ", Rank=" + getRank(marks) + '}';
				
	}
	public double getScore() {
        return marks;
    }
	
    
	
}
