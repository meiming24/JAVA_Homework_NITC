
public class ForeignBook extends Book{
	private String ISBN;

	public ForeignBook(String name,String author, int price, int amount, String iSBN) {
		super (name, author, price, amount);
		ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}
}
