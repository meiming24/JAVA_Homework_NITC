package View;

import java.util.Scanner;

import Control.Utils.ScannerUtils;
import Model.Entity.GuardSchedule;
import Model.Entity.StudySchedule;
import Model.Entity.TeachingSchedule;
import Model.Entity.Guard;
import Model.Entity.Student;
import Model.Entity.Teacher;
import Model.EnumPack.Gender;
import Model.EnumPack.Job;
import Model.EnumPack.TypeOfStudent;
import Control.Singleton.TeacherList;
import Control.Singleton.TeachingTable;
import Control.Singleton.WorkTable;
import Control.Singleton.StudentList;
import Control.Singleton.StudyTable;
import Control.Singleton.GuardList;

public class Input {
	static Scanner in = new Scanner(System.in);
	
	static public void Enter() {
		System.out.println("Enter ID: ");
		int id = ScannerUtils.inputInt(in, 1, 1000);
		System.out.println("Enter Name: ");
		String name = ScannerUtils.inputString(in);
		System.out.println("Enter Age: ");
		int age = ScannerUtils.inputInt(in, 18, 100);
		System.out.println("Enter Gender:...(FEMALE(0), MALE(1), OTHER(2))");
		int gd = ScannerUtils.inputInt(in, 0, 2);
		Gender gender = Gender.getGender(gd); 
		System.out.println("Enter Job: ... (GUARD(1), SANITATIONWORKER(2), TEACHER(3), STUDENT(4))");
		int jb = ScannerUtils.inputInt(in, 1, 4);
		Job job = Job.getJob(jb);
		
		if(job == Job.TEACHER) {
			if(TeacherList.isValid(id) == false) {
				TeacherList.addTeacherList(new Teacher(id, name, age, gender, job));
			}
		}
		else if(job == Job.STUDENT) {
			System.out.println("Enter type of student: ...(FORMALSTUDY(1),TRANSFER(2),PARTTIMESTUDY(3))");
			int type = ScannerUtils.inputInt(in, 1, 3);
			TypeOfStudent typeOfStudent = TypeOfStudent.getTypeOfStudent(type);
			
			if(StudentList.isValid(id) == false) {
				StudentList.addStudentList(new Student(id, name, age, gender, job, typeOfStudent));
			}
		}
		else {
			if(GuardList.isValid(id) == false) {
				GuardList.addGuardList(new Guard(id, name, age, gender, job));
			}
		}
	}
	
	public static void InputTeachingSchedule() {
		System.out.println("Enter Teacher ID: ");
		int id = ScannerUtils.inputInt(in, 1, 1000);
		System.out.println("Enter period of time needed to add to schedule: ");
		System.out.println("FROM6HTO7H (1),FROM7HTO8H (2),FROM8HTO9H (3),FROM9HTO10H (4)");
		int time; time = ScannerUtils.inputInt(in, 1, 4);
		System.out.println("Enter class needed to add to schedule: ");
		System.out.println("A101(1), B202(2), C303(3), D404(4), E505(5)");
		int room; room = ScannerUtils.inputInt(in, 1, 5);
		
		if(TeachingTable.isValid(time, room) == false) {
			TeachingTable.addTeachingTable(new TeachingSchedule(id, room, time));
		}
	}
	 
	 public static void InputStudySchedule() {
		System.out.println("Enter Student ID: ");
		int id = ScannerUtils.inputInt(in, 1, 1000);
		System.out.println("Enter period of time needed to add to schedule: ");
		System.out.println("FROM6HTO7H (1),FROM7HTO8H (2),FROM8HTO9H (3),FROM9HTO10H (4)");
		int time; time = ScannerUtils.inputInt(in, 1, 4);
		System.out.println("Enter class needed to add to schedule: ");
		System.out.println("A101(1), B202(2), C303(3), D404(4), E505(5)");
		int room; room = ScannerUtils.inputInt(in, 1, 5);
		
		
		if(StudyTable.isValid(time, room) == false) {
			StudyTable.addStudyTable(new StudySchedule(id, room, time));
		}
	}
	 
	public static void InputGuardSchedule(){
		System.out.println("Enter Guard ID: ");
		int id = ScannerUtils.inputInt(in, 1, 100);
		System.out.println("Enter period of time needed to add to schedule: ");
		System.out.println("FROM6HTO7H (1),FROM7HTO8H (2),FROM8HTO9H (3),FROM9HTO10H (4)");
		int time; time = ScannerUtils.inputInt(in, 1, 4);
		System.out.println("Enter floor needed to add to schedule: ");
		System.out.println("FLOORNO1(1), FLOORNO2(2), FLOORNO3(3), FLOORNO4(4)");
		int floor; floor = ScannerUtils.inputInt(in, 1, 4);
	
		if(WorkTable.isValid(time, floor) == false) {
			WorkTable.addWorkTable(new GuardSchedule(id, floor, time));
		}
	}
	
	static public void AddTable() {
		System.out.println("1. Add to teaching table");
		System.out.println("2. Add to study table");
		System.out.println("3. Add to guard table");
		System.out.println("Choose: ");
		int x = ScannerUtils.inputInt(in, 1, 3);
		if(x == 1) Input.InputTeachingSchedule();
		else if(x == 2) Input.InputStudySchedule();
		else Input.InputGuardSchedule();
	}
}
