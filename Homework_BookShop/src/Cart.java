import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	static private Map <Integer,Integer> cart = new HashMap <Integer,Integer> ();
	
	static Map <Integer,Integer> getCart(){
		return cart;
	}
	
	static public void pay(int id, int quantity, int moneypay) {
		Book tmp = Inventory.getBook(id);
		moneypay = moneypay + (tmp.getPrice()*quantity);
		System.out.println("Thành tiền: " + moneypay);
	}
	
	static public boolean addToCart(int id, int quantity) {
		if(!Inventory.isValid(id)) {
			System.out.println("Sản phẩm không tồn tại !!!");
			return false;
		}
		else {
			Book tmp = Inventory.getBook(id);
			if(tmp.getAmount() < quantity) {
				System.out.println("Không đủ hàng :( ");
				return false;
			}
			else {
				int oldQuantity = tmp.getAmount();
				tmp.setAmount(oldQuantity - quantity);
			}
			
			if(cart.containsKey(id)) {
				int oldQuantity = cart.get(id);
				cart.put(id, oldQuantity + quantity);
				System.out.println(tmp.getName()+" "+cart.get(id));
			}
			else {
				cart.put(id, quantity);
				System.out.println(tmp.getName()+" "+cart.get(id));
			}
			return true;
		}
	}
}
