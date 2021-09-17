package nitc.Homework;

import java.util.Scanner;

public class Parallogram extends getNum{
	
	int [] data = new int [3];
	
	public void input() {
		Scanner input = new Scanner(System.in);
		for(int i=1;i<3;i++) {
			getNumsize = Integer.parseInt(input.nextLine());
			data[i] = getNumsize;
		}
	}
	
	public int Perimeter() {
		return (data[0] + data[1])*2;
	}
	
	public int Area() {
		return data[0] * data[2];
	}
	
}
