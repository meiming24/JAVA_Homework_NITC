package Entity;

public class Banana extends Fruit{
	private double kali;
	private String vitamin;

	public double getKali() {
		return kali;
	}
	public void setKali(double kali) {
		this.kali = kali;
	}
	public Banana(String name, double price, int quantity, double kali, String vitamin) {
		super(name,price,quantity);
		this.kali = kali;
		this.vitamin = vitamin;
	}
	
	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin " + this.getName() +": " + this.vitamin);
	}
}
