
public class LiteratureBook extends Book{
	private int republish;

	public LiteratureBook(String name ,String author, int price, int amount, int republish) {
		super (name, author, price, amount);
		this.republish = republish;
	}

	public int getRepublish() {
		return republish;
	}

	public void setRepublish(int taiban) {
		this.republish = republish;
	}
}
