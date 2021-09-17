package nitc.Homework;

import java.util.Scanner;

public class Triangle extends getNum {
	
	int [] data = new int [3];
	
	public void input() {
		Scanner input = new Scanner(System.in);
		for(int i=1;i<3;i++) {
			getNumsize = Integer.parseInt(input.nextLine());
			data[i] = getNumsize;
		}
	}
	
	public int Perimeter() {
		return data[0] + data[1] + data[2];
	}
	
	public double Area() {
		double p = this.Perimeter()/2;
		return (double) Math.sqrt(p * (p-data[0]) * (p-data[1]) * (p-data[2]));
	}
	
}
