package Control.MainProgram;

import java.util.Scanner;

import Control.Utils.ScannerUtils;
import View.ShowInfo;

public class MainPr {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. Log in");
			System.out.println("2. Exit");
			System.out.println("Choose: ");
			
			int x = ScannerUtils.inputInt(in, 1, 2);
			if(x == 1) ShowInfo.Menu();
			else break;
		}
	}
}
