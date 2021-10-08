
public class ScienceBook extends Book{
	private int publishYear;
	
	public ScienceBook(String name,String author, int price, int amount, int publishYear) {
		super (name, author, price, amount);
		this.publishYear = publishYear;
	}
	
	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
}
