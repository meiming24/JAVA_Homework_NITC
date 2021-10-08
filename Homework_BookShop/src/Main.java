import java.util.List;
import java.util.Scanner;

public class Main {
	static int numberOfBook;
	static int moneypay;
	static public void displayMenu() {
		System.out.println("1.Enter books from inventory");
		System.out.println("2.Print books from inventory");
		System.out.println("3.Create cart");
		System.out.println("4.Add book to cart");
		System.out.println("5.Exit");
		System.out.print("Choose: ");
	}
	static public void displayBook() {
		System.out.println("1.Foreign Book");
		System.out.println("2.Science Book");
		System.out.println("3.Literature Book");
		System.out.print("Choose: ");
	}
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do {
			displayMenu();
			choose = input.nextInt();
			switch(choose) {
				case 1:
					System.out.println("Enter the genres of the deposit book: ");
					int genre;
					displayBook();
					genre = input.nextInt();
					switch(genre) {
						case 1: 
							System.out.print("Enter the amount of Literature Books: ");
							numberOfBook = Integer.parseInt(input.nextLine());
							for(int i=0;i<numberOfBook;i++) {
								System.out.print("Enter the name of the Book: ");
								String name = input.nextLine();
								System.out.print("Enter the author: ");
								String author = input.nextLine();
								System.out.print("Enter price: ");
								int price = Integer.parseInt(input.nextLine());
								System.out.print("Enter the amount of Books: ");
								int amount = Integer.parseInt(input.nextLine());
								System.out.print("Enter the number of republishment: ");
								int republish = Integer.parseInt(input.nextLine());
								Inventory.addToInventory(new LiteratureBook(name,author,price,amount,republish));
							}
							break;
						case 2: 
							System.out.print("Enter the amount of Science Books: ");
							numberOfBook = Integer.parseInt(input.nextLine());
							for(int i=0;i<numberOfBook;i++) {
								System.out.print("Enter the name of the Book: ");
								String name = input.nextLine();
								System.out.print("Enter the author: ");
								String author = input.nextLine();
								System.out.print("Enter price: ");
								int price = Integer.parseInt(input.nextLine());
								System.out.print("Enter the amount of Books: ");
								int amount = Integer.parseInt(input.nextLine());
								System.out.print("Enter publish year of the Books: ");
								int publishYear = Integer.parseInt(input.nextLine());
								Inventory.addToInventory(new ScienceBook(name,author,price,amount,publishYear));
							}
							break;
						case 3:
							System.out.print("Enter the amount of Foreign Books: ");
							numberOfBook = Integer.parseInt(input.nextLine());
							for(int i=0;i<numberOfBook;i++) {
								System.out.print("Enter the name of the Book: ");
								String name = input.nextLine();
								System.out.print("Enter the author: ");
								String author = input.nextLine();
								System.out.print("Enter price: ");
								int price = Integer.parseInt(input.nextLine());
								System.out.print("Enter the amount of Books: ");
								int amount = Integer.parseInt(input.nextLine());
								System.out.print("Enter ISBN code: ");
								String iSBN = input.nextLine();
								Inventory.addToInventory(new ForeignBook(name,author,price,amount,iSBN));
							}
							break;
						}
					break;
				case 2:
					List <Book> book = Inventory.getInventory();
					for(Book i : book) {
						System.out.println("ID: "+i.getId());
						System.out.println("Name: "+i.getName());
						System.out.println("Author: "+i.getAuthor());
						System.out.println("Amount: "+i.getAmount());
						System.out.println("Price: "+i.getPrice());
						if(i instanceof LiteratureBook) {
							LiteratureBook tmp= (LiteratureBook) i;
							System.out.println("Number of Republishment: "+tmp.getRepublish());
						}
						else if(i instanceof ScienceBook) {
							ScienceBook tmp = (ScienceBook) i;
							System.out.println("Year of Publishment: "+tmp.getPublishYear());
						}
						else {
							ForeignBook tmp = (ForeignBook) i;
							System.out.println("ISBN Code: "+tmp.getISBN());
						}
					}
					break;
				case 3:
					System.out.println("List of Books");
					List <Book> x = Inventory.getInventory();
					for(Book i:x) {
						System.out.println(i.getId() + " " + i.getName() + " " + i.getPrice() + " " + i.getAmount());
					}
					System.out.println();
					System.out.print("Enter ID book add to Cart: ");
					int ID = Integer.parseInt(input.nextLine());
					System.out.print("Enter amount of books add to Cart: ");
					int Quantity = Integer.parseInt(input.nextLine());
					Cart.addToCart(ID, Quantity);
					if(Cart.addToCart(ID, Quantity)) Cart.pay(ID, Quantity, moneypay);
					break;
				case 4:
					System.out.println("List of Books");
					List <Book> inventory = Inventory.getInventory();
					for(Book i:inventory) {
						System.out.println(i.getId() + " " + i.getName() + " " + i.getPrice() + " " + i.getAmount());
					}
					System.out.println();
					System.out.print("Enter ID book add to Inventory: ");
					int id = Integer.parseInt(input.nextLine());
					System.out.print("Enter amount of books add to Inventory: ");
					int quantity = Integer.parseInt(input.nextLine());
					Inventory.addQuantity(id, quantity);
					break;
				case 5:
					System.out.println("Thoat");
					break;
					default:
						System.out.println("Nhap lai");
				}
			} while(choose!=5);
	}
}
