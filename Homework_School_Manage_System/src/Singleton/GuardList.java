package Singleton;

import java.util.ArrayList;
import java.util.List;

import entity.Guard;

public class GuardList {
static private List<Guard> guardlist = new ArrayList<Guard>();
	
	private GuardList(){
	}
	
	public List<Guard> getInstance() {
		return guardlist;
	}
	
	static public boolean addGuardList(Guard guard) {
		guardlist.add(guard);
		return true;
	}
	
	static public boolean isValid(int id) {
		for (Guard i : guardlist) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	static public Guard getGuard(int id) {
		for (Guard i : guardlist) {
			if(i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
