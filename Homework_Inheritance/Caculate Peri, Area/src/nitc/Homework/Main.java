package nitc.Homework;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a;
		Square a1 = new Square();
		Rectangular a2 = new Rectangular();
		Triangle a3 = new Triangle();
		Parallogram a4 = new Parallogram();
		
		do {
			a = Integer.parseInt(input.nextLine());
			switch(a) {
			case 1:
				a1.input();
				System.out.printf("The Perimeter of the Square: %d\n",a1.Perimeter());
				System.out.printf("The Area of the Square: %d\n",a1.Area());
				break;
			case 2:
				a2.input();
				System.out.printf("The Perimeter of the Rectangle: %d\n",a2.Perimeter());
				System.out.printf("The Area of the Rectangle: %d\n",a2.Area());
				break;
			case 3:
				a3.input();
				System.out.printf("The Perimeter of the Triangle: %d\n",a3.Perimeter());
				System.out.printf("The Area of the Triangle: %lf\n",a3.Area());
				break;
			case 4:
				a4.input();
				System.out.printf("The Perimeter of the Parallogram: %d\n",a4.Perimeter());
				System.out.printf("The Area of the Parallogram: %d\\n",a4.Area());
				break;
			case 5:
				System.out.println("End the Process !!!");
			default:
				System.out.println("Enter again !!!");
				break;
			}
		} while(a != 5);
	}
	static void display() {
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Parallogram");
		System.out.println("4.Triangle");
		System.out.println("5.Exit");
		System.out.print("Choose one above: ");
	}
}
