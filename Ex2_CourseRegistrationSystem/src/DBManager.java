import java.util.ArrayList;
import java.util.Scanner;

//This class is simulating a database for our
//program
public class DBManager {
	
	private ArrayList <Course> courseList;
	private ArrayList <Student> studentList;
	private CourseCatalogue cat;

	public DBManager () {
		courseList = new ArrayList<Course>();
		studentList = new ArrayList<Student>();
		cat = new CourseCatalogue();
		readCoursesFromDataBase();
		readStudentsFromDatabase();
	}

	public CourseCatalogue readCoursesFromDataBase() {
		// TODO Auto-generated method stub
		courseList.add(new Course ("ENGG", 233));
		courseList.add(new Course ("ENSF", 409));
		courseList.add(new Course ("PHYS", 259));
		
		cat.setCourseList(courseList);
		cat.createCourseOffering(courseList.get(0), 1, 100);
		cat.createCourseOffering(courseList.get(0), 2, 200);
		cat.createCourseOffering(courseList.get(1), 1, 100);
		cat.createCourseOffering(courseList.get(2), 1, 100);
		return cat;
	}
	
	public ArrayList<Student> readStudentsFromDatabase()
	{

		studentList.add(new Student ("Sara", 1));
		studentList.add(new Student ("Grace", 2));
		studentList.add(new Student ("Matt", 3));
		studentList.add(new Student ("Will", 4));
		


		return studentList;
	}
	
	public Student UserSearchCourseList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID: ");
		int input = Integer.parseInt(sc.nextLine());
		for(Student student : studentList)
		{
			if(input == student.getStudentId())
			{
				return student;
			}
		}
		return null;
	}
	
	public CourseCatalogue getCourseCatalogue()
	{
		return cat;
	}

}
