package Entity;

public class Orange extends Fruit{
	private int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Orange(String name, double price, int quantity, int weight) {
		super(name,price,quantity);
		this.weight = weight;
	}
}
