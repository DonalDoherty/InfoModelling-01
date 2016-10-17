package modelling;

import java.util.ArrayList;

public class Course {
	ArrayList<Student> classMembers = new ArrayList<Student>();
	String courseName;
	
	public Course(String courseName, ArrayList classMembers){
		this.courseName = courseName;
		this.classMembers = classMembers;
	}
	
	public ArrayList<Student> getStudents(){
		return classMembers;
	}
	public String toString(){
		return courseName;
	}

}
