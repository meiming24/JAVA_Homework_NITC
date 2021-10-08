package ShopAdaptSystem;

public class LiteratureBook extends Book{
	private int republish;
	private String genre;
	public LiteratureBook(String name ,String author, int price, int amount, int republish, String genre) {
		super (name, author, price, amount);
		this.republish = republish;
		this.genre = genre;
	}

	public int getRepublish() {
		return republish;
	}

	public void setRepublish(int taiban) {
		this.republish = republish;
	}
	
	@Override
	public void Genre() {
		// TODO Auto-generated method stub
		System.out.println("Genre: " + this.genre);
	}
	
}
