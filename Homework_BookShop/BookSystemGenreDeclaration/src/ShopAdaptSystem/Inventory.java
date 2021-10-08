package ShopAdaptSystem;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	static private List <Book> inventory = new ArrayList();
	
	private Inventory() {
		
	}
	static public List<Book> getInventory(){
		return inventory;
	}
	static public boolean addToInventory(Book book) {
		inventory.add(book);
		return true;
	}
	
	static public boolean isValid(int id) {
		for(Book i : inventory) {
			if(i.getId() == id) return true;
		}
		return false;
	}
	
	static public Book getBook(int id) {
		return inventory.get(id);
	}
	
	static public boolean addQuantity(int id, int quantity) {
		if(Inventory.isValid(id) == true) {
			Inventory.getBook(id).addQuantity(quantity);
		}
		else {
			System.out.println("Sản phẩm không tồn tại !!!");
			return false;
		}
		return true;
	}
	
}
