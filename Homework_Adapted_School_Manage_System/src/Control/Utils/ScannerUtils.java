package Control.Utils;

import java.util.Scanner;

public class ScannerUtils {
	public static int inputInt(Scanner in, int min, int max) {
		while(true) {
			try {
				int n = Integer.parseInt(in.nextLine());
				if(n < min || n > max) {
					System.out.println("You have to enter number in range [" + min + "," + max + "]");
					System.out.println("Enter again: ");
				}
				else return n;
				
			} catch (NumberFormatException ex) {
				System.out.println("Wrong Format Input !!!");
				System.out.println("Enter again interger input: ");
			}
		}
	}
	
	public static String inputString(Scanner in) {
		while(true) {
			try {
				String s = in.nextLine();
				boolean check = true;
				for(int i=0;i<s.length();i++) {
					if((s.charAt(i) - 0 >= 97 && s.charAt(i) - 0 <= 122) || (s.charAt(i) - 0 >= 65 && s.charAt(i) - 0 <= 90)) {
						continue;
					}
					else {
						System.out.println("Name doesn't have special characters !!!");
						System.out.println("Enter again: ");
						check = false;
						break;
					}
				}
				if(check == true && s != null && !s.isEmpty()) return s;
				
			} catch (Exception ex) {
				System.out.println("Error !!!");
				System.out.println("Enter again: ");
			}
		}
	}
}
