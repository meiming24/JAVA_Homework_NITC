package Control.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.Teacher;

public class TeacherList {
	static private List <Teacher> teacherlist = new ArrayList<Teacher>();
	
	private TeacherList(){
	}
	
	public List<Teacher> getInstance() {
		return teacherlist;
	}
	
	static public boolean addTeacherList(Teacher teacher) {
		teacherlist.add(teacher);
		return true;
	}
	
	static public boolean isValid(int id) {
		for (Teacher i : teacherlist) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public Teacher getTeacher(int id) {
		for (Teacher i : teacherlist) {
			if(i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
