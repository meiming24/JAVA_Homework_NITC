package nitc.Homework;

public class Banana extends Fruit{
	private int Weight;

	public Banana(String Fruitname, double Fruitprice, int Quantity, int Weight) {
		super(Fruitname, Fruitprice, Quantity);
		this.Weight = Weight;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int Weight) {
		this.Weight = Weight;
	}

	@Override
	public String toString() {
		return "Fruit Name: " + getFruitname() + " Price: " + getFruitprice() + "  Quantity: " + getQuantity()
				+ " Weight: " + getWeight();
	}
}
