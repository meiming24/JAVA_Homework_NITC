package View;


import java.util.ArrayList;
import java.util.List;
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

public class Output {
	static Scanner in = new Scanner(System.in);
	
	static List<TeachingSchedule> teachingschedule = new ArrayList<TeachingSchedule>();
	static List<StudySchedule> studyschedule = new ArrayList<StudySchedule>();
	static List<GuardSchedule> lichNhanVienCaNhan = new ArrayList<GuardSchedule>();
	
	public static void PrintInfo() {
		System.out.println("Enter ID: ");
		int id; id = ScannerUtils.inputInt(in, 1, 1000);
		
		System.out.println("Teacher, Guard and Student Information");
		
		System.out.println("Teacher, Guard and Student Information");
		if(TeacherList.getTeacher(id) != null) {
			System.out.println(TeacherList.getTeacher(id).getId());
			System.out.println(TeacherList.getTeacher(id).getName());
			System.out.println(TeacherList.getTeacher(id).getAge());
			System.out.println(TeacherList.getTeacher(id).getGender());
			System.out.println(TeacherList.getTeacher(id).getJob());	
			
			if(TeachingTable.getTeachingSchedule(id) !=null) {
				System.out.println(TeachingTable.getTeachingSchedule(id).getRoom());
				System.out.println(TeachingTable.getTeachingSchedule(id).getTime());
			}
			else {
				System.out.println("No information !!!");
			}
		}
		else if(GuardList.getGuard(id) != null) {
			System.out.println(GuardList.getGuard(id).getId());
			System.out.println(GuardList.getGuard(id).getName());
			System.out.println(GuardList.getGuard(id).getAge());
			System.out.println(GuardList.getGuard(id).getGender());
			System.out.println(GuardList.getGuard(id).getJob());	
			
			if(WorkTable.getGuardSchedule(id) !=null) {
				System.out.println(WorkTable.getGuardSchedule(id).getFloor());
				System.out.println(WorkTable.getGuardSchedule(id).getTime());
			}
			else {
				System.out.println("No information !!!");
			}
		}
		else if(StudentList.getStudent(id) != null){
			System.out.println(StudentList.getStudent(id).getId());
			System.out.println(StudentList.getStudent(id).getName());
			System.out.println(StudentList.getStudent(id).getAge());
			System.out.println(StudentList.getStudent(id).getGender());
			System.out.println(StudentList.getStudent(id).getJob());

			if(StudyTable.getStudySchedule(id) !=null) {
				System.out.println(StudyTable.getStudySchedule(id).getRoom());
				System.out.println(StudyTable.getStudySchedule(id).getTime());
			}
			else {
				System.out.println("No information !!!");
			}
		}
		else {
			System.out.println("ID not exist !!!");
		}
	}
}
