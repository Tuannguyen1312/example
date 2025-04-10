package btvn;

public class student {
	  int id;
	    String name;
	    double gpa;

	    public student(int id, String name, double gpa) {
	        this.id = id;
	        this.name = name;
	        this.gpa = gpa;
	    }
	    
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
	    }
}
