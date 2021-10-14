package Singleton;

import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentList {
	static private List<Student> studentlist = new ArrayList<Student>();
	
	private StudentList(){
	}
	
	public List<Student> getInstance() {
		return studentlist;
	}
	
	static public boolean addStudentList(Student student) {
		studentlist.add(student);
		return true;
	}
	
	static public boolean isValid(int id) {
		for (Student i : studentlist) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
		static public Student getStudent(int id) {
			for (Student i : studentlist) {
				if(i.getId() == id) {
					return i;
				}
			}
			return null;
		}
}
