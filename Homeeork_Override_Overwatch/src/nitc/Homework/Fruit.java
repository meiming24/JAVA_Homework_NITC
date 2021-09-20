package nitc.Homework;

public class Fruit {
	private String Fruitname;
	private double Fruitprice;
	private int Quantity;
	
	public Fruit(String Fruitname, double Fruitprice, int Quantity) {
		super();
		this.Fruitname = Fruitname;
		this.Fruitprice = Fruitprice;
		this.Quantity = Quantity;
	}
	
	public String getFruitname() {
		return Fruitname;
	}

	public void setFruitname(String Fruitname) {
		this.Fruitname = Fruitname;
	}

	public double getFruitprice() {
		return Fruitprice;
	}

	public void setFruitprice(double Fruitprice) {
		this.Fruitprice = Fruitprice;
	}
	
	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}
	
}
