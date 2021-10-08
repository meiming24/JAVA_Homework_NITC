package nitc.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Fruit> List = new ArrayList<Fruit>();
		List.add(new Apple("Táo Mỹ", 3000, 2, 30));
		List.add(new Apple("Táo Vàng", 5000, 1, 15));
		List.add(new Orange("Cam sành", 4500, 3, 3));
		List.add(new Orange("Cam Tây Ninh", 6500, 2, 2));
		List.add(new Banana("Chuối Tây", 2500, 1, 10));
		List.add(new Banana("Chuối ngự", 10000, 2, 5));
		System.out.println("Make your choice: ");
		System.out.println("1. Display information: ");
		System.out.println("2. Shopping: ");
		int n = input.nextInt();
		if (n == 1) {
			for (Fruit item : List)
				System.out.println(item.toString());
		} else {
			double money;
			System.out.println("Enter Cash: ");
			money = input.nextDouble();
			int i = 0;
			for (Fruit item1 : List) {
				if (item1.getFruitprice() <= money) {
					int count = 0;
					double ans = money;
					while (money >= 0) {
						money = money - item1.getFruitprice();
						count++;
					}
					if (counnt - 1 >= item1.getQuantity())
						System.out.println("Maximum " + item1.getFruitname() + " we can buy: " + item1.getQuantity());
					else
						System.out.println("Maximum " + item1.getFruitname() + " we can buy: " + (count - 1));
						money = ans;
				}
			}
		}
	}
}
