package MainPr;

import java.util.Scanner;
import eNum.Job;
import eNum.TypeOfStudent;
import entity.TeachingSchedule;
import entity.Guard;
import entity.GuardSchedule;
import entity.Student;
import entity.StudySchedule;
import entity.Teacher;
import Singleton.TeacherList;
import Singleton.TeachingTable;
import Singleton.GuardList;
import Singleton.StudentList;
import Singleton.StudyTable;
import Singleton.WorkTable;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.println("1. Them vao danh sach, bang lich cua giang vien, sinh vien, nhan vien");
			System.out.println("2. Nhap ID can in thong tin");
			int choose;
			choose = in.nextInt();
			
			if(choose == 1) {
				System.out.println("Enter ID: ");
				int id; id = in.nextInt();
				System.out.println("Enter name: ");
				in.nextLine();
				String name; name = in.nextLine();
				System.out.println("Enter age: ");
				int age; age = in.nextInt();
				System.out.println("Enter gender:...(FEAMLE(0), MALE(1), OTHER(2))");
				int gender; gender = in.nextInt();
				System.out.println("Enter job: ... (GUARD(1), SANITAIONWORKER(2), TEACHER(3), STUDENT(4))");
				int job; job = in.nextInt();
				if(Job.getJob(job) == Job.TEACHER) {
					
					if(TeacherList.isValid(id) == false) {
						TeacherList.addTeacherList(new Teacher(id, name, age, gender, job));
					}
		
					System.out.println("Enter period of time needed to add to schedule: ");
					System.out.println("FROM6HTO7H (1),FROM7HTO8H (2),FROM8HTO9H (3),FROM9HTO10H (4)");
					int time; time = in.nextInt();
					System.out.println("Enter class needed to add to schedule: ");
					System.out.println("A101(1), B202(2), C303(3), D404(4), E505(5)");
					int room; room = in.nextInt();
					
					if(TeachingTable.isValid(time, room) == false) {
						TeachingTable.addTeachingTable(new TeachingSchedule(id, room, time));
					}
				}
				else if(Job.getJob(job) == Job.STUDENT) {
					System.out.println("Enter type of student: ...(FORMALSTUDY(1),TRANSFER(2),PARTTIMESTUDY(3))");
					int typeofstudent; typeofstudent = in.nextInt();
				
					if(StudentList.isValid(id) == false) {
						StudentList.addStudentList(new Student(id, name, age, gender, job, typeofstudent));
					}
				
					System.out.println("Enter period of time needed to add to schedule: ");
					System.out.println("FROM6HTO7H (1),FROM7HTO8H (2),FROM8HTO9H (3),FROM9HTO10H (4)");
					int time; time = in.nextInt();
					System.out.println("Enter class needed to add to schedule: ");
					System.out.println("A101(1), B202(2), C303(3), D404(4), E505(5)");
					int room; room = in.nextInt();
					
					
					if(StudyTable.isValid(time, room) == false) {
						StudyTable.addStudyTable(new StudySchedule(id, room, time));
					}
				}
				else{
					if(GuardList.isValid(id) == false) {
						GuardList.addGuardList(new Guard(id, name, age, gender, job));
					}
					 
					System.out.println("Enter period of time needed to add to schedule: ");
					System.out.println("FROM6HTO7H (1),FROM7HTO8H (2),FROM8HTO9H (3),FROM9HTO10H (4)");
					int time; time = in.nextInt();
					System.out.println("Enter floor needed to add to schedule: ");
					System.out.println("FLOORNO1(1), FLOORNO2(2), FLOORNO3(3), FLOORNO4(4)");
					int floor; floor = in.nextInt();
				
					if(WorkTable.isValid(time, floor) == false) {
						WorkTable.addWorkTable(new GuardSchedule(id, floor, time));
					}
				}
			}
			else {
				System.out.println("Enter ID");
				int id; 
				id = in.nextInt();
				
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
			
			if(choose !=1 && choose !=2) break;
			
		}
	}

}
