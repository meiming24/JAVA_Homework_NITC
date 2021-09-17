package nitc.Homework;

import java.util.Scanner;

public class SanitationWorker extends Info {
	public void input() {
		Scanner input = new Scanner(System.in);
		name=input.nextLine();
		age = Integer.parseInt(input.nextLine());
		ID = input.nextLine();
	}

	@Override
	public String toString() {
		return "Sanitation Worker: [name = " + name + ", age = " + age + ", ID = " + ID + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void print() {
		System.out.println(toString());
	}
}
