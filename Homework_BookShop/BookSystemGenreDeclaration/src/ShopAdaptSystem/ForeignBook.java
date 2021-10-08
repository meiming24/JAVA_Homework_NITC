package ShopAdaptSystem;

public class ForeignBook extends Book{
	private String ISBN;
	private String genre;
	public ForeignBook(String name,String author, int price, int amount, String iSBN, String genre) {
		super (name, author, price, amount);
		this.genre = genre;
		ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}
	
	@Override
	public void Genre() {
		// TODO Auto-generated method stub
		System.out.println("Genre: " + this.genre);
	}
}
