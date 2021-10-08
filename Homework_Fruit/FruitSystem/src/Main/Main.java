package Main;

import java.util.List;
import java.util.Scanner;

import Entity.Apple;
import Entity.Banana;
import Entity.Fruit;
import Entity.Orange;
import Singleton.Cart;
import Singleton.Inventory;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose = Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				System.out.println("Choose");
				System.out.println("1.Apple");
				System.out.println("2.Orange");
				System.out.println("3.Banana");
				int type = Integer.parseInt(in.nextLine());
				switch(type) {
				case 1:
					System.out.print("Enter number of Apples: ");
					int numApple = Integer.parseInt(in.nextLine());
					for(int i=0;i<numApple;i++) {
						System.out.print("Enter name: ");
						String name = in.nextLine();
						System.out.print("Enter price: ");
						double price = Double.parseDouble(in.nextLine());
						System.out.print("Enter quantity: ");
						int quantity=Integer.parseInt(in.nextLine());
						System.out.print("Enter the amount of sugar: ");
						int sugar=Integer.parseInt(in.nextLine());
						Inventory.addToInventory(new Apple(name,price,quantity,sugar));
					}
					break;
				case 2:
					System.out.print("Enter number of Oranges: ");
					int numOrange=Integer.parseInt(in.nextLine());
					for(int i=0;i<numOrange;i++) {
						System.out.print("Enter name: ");
						String name = in.nextLine();
						System.out.print("Enter price: ");
						double price = Double.parseDouble(in.nextLine());
						System.out.print("Enter quantity: ");
						int quantity=Integer.parseInt(in.nextLine());
						System.out.print("Enter weight: ");
						int weight = Integer.parseInt(in.nextLine());
						Inventory.addToInventory(new Orange(name,price,quantity,weight));
					}
					break;
				case 3:
					System.out.print("Enter number of Bananas: ");
					int numBanana = Integer.parseInt(in.nextLine());
					for(int i=0;i<numBanana;i++) {
						System.out.print("Enter name: ");
						String name = in.nextLine();
						System.out.print("Enter price: ");
						double price = Double.parseDouble(in.nextLine());
						System.out.print("Enter quantity: ");
						int quantity = Integer.parseInt(in.nextLine());
						System.out.print("Enter Kali content: ");
						double kali = Double.parseDouble(in.nextLine());
						Inventory.addToInventory(new Banana(name,price,quantity,kali));
					}
					break;
				}
				
				break;
			case 2:
				System.out.println("List of Stocks");
				List <Fruit> fruit=Inventory.getInstance();
				for(Fruit i:fruit) {
					System.out.println(i.getId() + " " + i.getName() + " " + i.getQuantity());
				}
				System.out.println();
				System.out.println("Enter ID and Quantity of Stocks");
				System.out.print("ID: ");
				int id = Integer.parseInt(in.nextLine());
				System.out.print("Quantity: ");
				int quantity=Integer.parseInt(in.nextLine());
				Cart.addToCart(id, quantity);
				break;
			case 3:
				System.out.println("List of Stocks");
				List<Fruit> inventory = Inventory.getInstance();
				for(Fruit i:inventory) {
					System.out.println(i.getName() + " " + i.getQuantity());
				}
				System.out.println();
				System.out.println("Enter ID of Fruit you want to add: ");
				int ID = Integer.parseInt(in.nextLine());
				System.out.println("Enter Quantity of Fruits you want to add:  ");
				int Quantity = Integer.parseInt(in.nextLine());
				Inventory.addQuantity(ID,Quantity);
				break;
			case 4:
				List<Fruit> x = Inventory.getInstance();
				for(Fruit i:x) {
					System.out.println("Ten: "+i.getName());
					System.out.println("Gia: "+i.getPrice());
					System.out.println("So luong: "+i.getQuantity());
					if(i instanceof Apple) {
						Apple tmp = (Apple) i;
						System.out.println("Sugar: " + tmp.getSugar());
					}
					else if(i instanceof Orange) {
						Orange tmp = (Orange) i;
						System.out.println("Weight: "+ tmp.getWeight());
					}
					else {
						Banana tmp = (Banana) i;
						System.out.println("Kali content: " + tmp.getKali());
					}
				}
				break;
			case 5:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Enter again");
					break;
			}
		} while(choose != 4);
	}
	static public void showMenu() {
		System.out.println("1.Nhap loai hoa qua");
		System.out.println("2.Tao gio hang");
		System.out.println("3.Nhap kho");
		System.out.println("4.In");
		System.out.println("4.Thoat");
		System.out.print("Chon: ");
	}
	static Fruit i;
}