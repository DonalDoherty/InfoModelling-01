package modelling;

public class Student {
	int studentNumber;
	String name;
	Course enrollsOn;
	
	public Student(int studentNumber, String name, Course enrollsOn){
		this.studentNumber = studentNumber;
		this.name = name;
		this.enrollsOn = enrollsOn;
		
	}
	
	public Course getCourse(){
		return enrollsOn;	
	}

	public String toString(){
		return studentNumber +" "+ name +" "+ "("+enrollsOn+")";
	}
}
