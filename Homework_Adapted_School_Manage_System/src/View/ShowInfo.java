package View;

import java.util.Scanner;

import Control.Utils.ScannerUtils;

public class ShowInfo {
	static Scanner in = new Scanner(System.in);
	public static void Menu() {
		System.out.println("1. Enter person info");
		System.out.println("2. Add Schedule");
		System.out.println("3. Output ID info");
		System.out.println("Choose: ");
		
		int x = ScannerUtils.inputInt(in, 1, 3);
		if(x == 1) Input.Enter();
		else if(x == 2) Input.AddTable();
		else Output.PrintInfo();
	}
}
