package ShopAdaptSystem;

public class ScienceBook extends Book{
	private int publishYear;
	private String genre;
	public ScienceBook(String name,String author, int price, int amount, int publishYear, String genre) {
		super (name, author, price, amount);
		this.publishYear = publishYear;
		this.genre = genre;
	}
	
	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	@Override
	public void Genre() {
		// TODO Auto-generated method stub
		System.out.println("Genre: " + this.genre);
	}
}
