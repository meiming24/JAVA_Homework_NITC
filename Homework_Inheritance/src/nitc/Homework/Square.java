package nitc.Homework;

import java.util.Scanner;

public class Square extends getNum{
	int data;
	
	public void input() {
		Scanner input = new Scanner(System.in);
		getNumsize = Integer.parseInt(input.nextLine());
		data = getNumsize;
	}
	
	public int Perimeter() {
		return data*4;
	}
	
	public long Area() {
		return data*data;
	}
	
}
