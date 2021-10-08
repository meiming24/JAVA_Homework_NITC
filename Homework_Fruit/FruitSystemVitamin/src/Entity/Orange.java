package Entity;

public class Orange extends Fruit{
	private int weight;
	private String vitamin;

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Orange(String name, double price, int quantity, int weight, String vitamin) {
		super(name,price,quantity);
		this.weight = weight;
		this.vitamin = vitamin;
	}
	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin " + this.getName() +": " + this.vitamin);
	}
}
