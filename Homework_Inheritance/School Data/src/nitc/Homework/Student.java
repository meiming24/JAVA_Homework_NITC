package nitc.Homework;

import java.util.Scanner;

public class Student extends Info{
	String Class;
	
	public Student() {
		super();
	}

	public Student(String lop) {
		super();
		Class = lop;
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		age = Integer.parseInt(input.nextLine());
		ID = input.nextLine();
		Class = input.nextLine();
	}

	@Override
	public String toString() {
		return "The student: [class = " + Class + ", name = " + name + ", tuoi = " + age + ", ID = " + ID + ", getClass() ="
				+ getClass() + ", hashCode() =" + hashCode() + ", toString() =" + super.toString() + "]";
	}
	public void print() {
		System.out.println(toString());
	}
}
