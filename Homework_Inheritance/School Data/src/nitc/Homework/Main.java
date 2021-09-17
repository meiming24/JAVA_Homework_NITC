package nitc.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a;
		ArrayList <Teacher> teacher = new ArrayList<Teacher> ();
		ArrayList <Student> student = new ArrayList<Student> ();
		ArrayList <SanitationWorker> sanitationworker = new ArrayList<SanitationWorker> ();
		ArrayList <Guard> guard = new ArrayList<Guard> ();
		int num1,num2,num3,num4;
		do {
			display();
			a = Integer.parseInt(input.nextLine());
			switch(a){
			case 1:
				System.out.print("Enter the number of teachers: ");
				num1 = Integer.parseInt(input.nextLine());
				for(int i=0;i<num1;i++){
					Teacher newteacher = new Teacher();
					newteacher.input();
					teacher.add(newteacher);
				}
				break;
			case 2:
				System.out.print("Enter the number of students: ");
				num2 = Integer.parseInt(input.nextLine());
				for(int i=0;i<num2;i++) {
					Student newstudent = new Student();
					newstudent.input();
					student.add(newstudent);
				}
				break;
			case 3:
				System.out.print("Enter the number of guards: ");
				num3 = Integer.parseInt(input.nextLine());
				for(int i=0;i<num3;i++) {
					Guard newguard = new Guard();
					newguard.input();
					guard.add(newguard);
				}
				break;
			case 4:
				System.out.print("Enter the number of sanitation workers: ");
				num4 = Integer.parseInt(input.nextLine());
				for(int i=0;i<num4;i++) {
					SanitationWorker newsw = new SanitationWorker();
					newsw.input();
					sanitationworker.add(newsw);
				}
				break;
			case 5:
				for(int i=0;i<num1;i++) {
					teacher.get(i).print();
					System.out.println("									");
				}
				break;
			case 6:
				for(int i=0;i<num2;i++) {
					student.get(i).print();
					System.out.println("									");
				}
				break;
			case 7:
				for(int i=0;i<num3;i++) {
					guard.get(i).print();
					System.out.println("									");
				}
				break;
			case 8:
				for(int i=0;i<num4;i++) {
					sanitationworker.get(i).print();
					System.out.println("									");
				}
				break;
			case 9:
				System.out.println("Exit");
				break;
			}
		} while(a != 9);
	}
	static void display() {
		System.out.println("1.Enter teacher");
		System.out.println("2.Enter student");
		System.out.println("3.Enter guard");
		System.out.println("4.Enter sanitation worker");
		System.out.println("5.Print teacher");
		System.out.println("6.Print student");
		System.out.println("7.Print guard");
		System.out.println("8.Print sanitation worker");
		System.out.println("9.Exit");
		System.out.print("Choose: ");
	}
}
