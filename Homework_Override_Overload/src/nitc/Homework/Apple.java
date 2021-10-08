package nitc.Homework;

public class Apple extends Fruit{
	private int Sugar;
	
	public Apple(String Fruitname, double Fruitprice, int Quantity, int Sugar) {
		super(Fruitname, Fruitprice, Quantity);
		this.Sugar = Sugar;
	}

	public int getSugar() {
		return Sugar;
	}

	public void setSugar(int Sugar) {
		this.Sugar = Sugar;
	}
	@Override
	public String toString() {
		return "Fruit Name: " + getFruitname() + " Price: " + getFruitprice() + " Quantity: " + getQuantity() + " Sugar: "
				+ getSugar();
	}
}
