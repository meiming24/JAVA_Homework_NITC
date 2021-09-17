package nitc.Homework;

import java.util.Scanner;

public class Teacher extends Info {
	String Subject;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String subject) {
		super();
		Subject = subject;
	}
	
	public String getSubject() {
		return Subject;
	}
	
	public String setSubject(String subject) {
		return Subject = subject;
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		age = Integer.parseInt(input.nextLine());
		ID = input.nextLine();
		Subject = input.nextLine();
	}

	@Override
	public String toString() {
		return "Teacher: [Subject = " + Subject + ", name = " + name + ", age = " + age + ", ID = " + ID + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void print() {
		System.out.println(toString());
	}
}
