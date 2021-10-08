package Entity;

public class Apple extends Fruit{
	private int sugar;
	private String vitamin;
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public Apple(String name, double price, int quantity, int sugar, String vitamin) {
		super(name,price,quantity);
		this.sugar = sugar;
		this.vitamin = vitamin;
	}
	
	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin " + this.getName() +": " + this.vitamin);
	}
}
