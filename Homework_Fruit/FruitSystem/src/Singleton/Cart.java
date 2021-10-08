package Singleton;

import java.util.HashMap;
import java.util.Map;

import Entity.Fruit;

public class Cart {
	static private Map<Integer ,Integer> cart; 
	private Cart() {
	}
	static public Map<Integer,Integer> getInstance(){
	if(cart == null) {
			cart = new HashMap<Integer,Integer>();
		}
		return cart;
	}
	
	static public boolean addToCart(int id, int quantity) {
		//kiem tra id
		if(Inventory.isValid(id) == false) return false;
		//kiem tra so luong
		Fruit temp = Inventory.getFruit(id);
		if(temp.getQuantity() < quantity) {
			return false;
		}
		else {
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity - quantity);
		}
		
		//Them vao cart
		if(cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id,oldQuantity + quantity);
		}
		else {
			cart.put(id,quantity);
		}
		return true;
	}
}
