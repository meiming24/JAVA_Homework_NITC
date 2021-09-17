package nitc.Homework;

import java.util.Scanner;

public class Rectangular extends getNum{
	
	int [] data = new int [2];
	
	public void input() {
		Scanner input = new Scanner(System.in);
		for(int i=1;i<2;i++) {
			getNumsize = Integer.parseInt(input.nextLine());
			data[i] = getNumsize;
		}
	}
	
	public int Perimeter() {
		return (data[0] + data[1]) * 2;
	}
	
	public long Area() {
		return data[0] * data[1];
	}
	
}
