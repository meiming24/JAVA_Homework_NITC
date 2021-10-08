package ShopAdaptSystem;


public abstract class Book {
	
	
	
	
	private int id;
	private String name;
	private String author;
	private int price;
	private int amount;
	static private int count;
	
	
	
	
	public Book(String name, String author, int price, int amount) {
		super();
		this.id = count++;
		this.name = name;
		this.author = author;
		this.price = price;
		this.amount = amount;
	}

	
	
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	public void addQuantity(int quantity) {
		this.amount = this.amount + quantity;
	}
	
	abstract public void Genre();

}
