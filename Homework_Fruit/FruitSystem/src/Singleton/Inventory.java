package Singleton;

import java.util.ArrayList;
import java.util.List;

import Entity.Fruit;

public class Inventory {
	static private List<Fruit> inventory;
	
	private Inventory() {
		
	}
	
	static public List<Fruit> getInstance(){
		if(inventory == null) {
			inventory = new ArrayList<Fruit>();
		}
		return inventory;
	}
	//them fruit vao inventory
	static public boolean addToInventory(Fruit fruit) {
		inventory.add(fruit);
		return true;
	}
	//kiem tra id co ton tai trong list hay khong
	static public boolean isValid(int id) {
		for(Fruit i : inventory) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	static public Fruit getFruit(int id) {
		return inventory.get(id-1);
	}
	
	static public boolean addQuantity(int id,int quantity) {
		if(Inventory.isValid(id)==false) {
			System.out.println("Product isn't valid !!!");
			return false;
		}
		else {
			Inventory.getFruit(id).addQuantity(quantity);
		}
		return true;
	}
}
