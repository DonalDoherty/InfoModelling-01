package modelling;
import java.util.ArrayList;


public class Associations {
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Student> appClassMembers = new ArrayList<Student>();
	static ArrayList<Student> iotClassMembers = new ArrayList<Student>();
	static Course applied = new Course("Applied Computing", appClassMembers);
	static Course iot = new Course("Internet of Things", iotClassMembers);
	 
	
	public static void main(String[] args){
		 buildStudents();
		 buildCourses();
		 System.out.print("STUDENTS: ");
		 System.out.println(students);
		 System.out.println("----------");
		 System.out.print("COURSES: ");
		 System.out.println(courses);
		 printCourseMembers();
	 }
	
	 public static void buildStudents(){
		 students.add(new Student(1, "John", applied));
		 students.add(new Student(2, "Jack", iot));
		 students.add(new Student(3, "Mary", iot));
		 students.add(new Student(4, "Susan", applied));
	 }
	 
	 public static void buildCourses(){
		 courses.add(applied);
		 for (int i = 0; i<students.size(); i++)
			 if(students.get(i).getCourse() == applied)
				 appClassMembers.add(students.get(i));
		 
		 courses.add(iot);
		 for (int i = 0; i<students.size(); i++)
			 if(students.get(i).getCourse() == iot)
				 iotClassMembers.add(students.get(i));
	 }
	 
	 public static void printCourseMembers(){
		 System.out.println("Applied Computing");
		 for (int i = 0; i<appClassMembers.size(); i++)
			 System.out.println(appClassMembers.get(i).studentNumber +" "+ appClassMembers.get(i).name);
		 
		 System.out.println("Internet Of Things");
		 for (int i = 0; i<iotClassMembers.size(); i++)
			 System.out.println(iotClassMembers.get(i).studentNumber +" "+ iotClassMembers.get(i).name);
	 }
	 
}
