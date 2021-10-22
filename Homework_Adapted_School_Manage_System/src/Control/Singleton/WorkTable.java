package Control.Singleton;

import java.util.ArrayList;
import java.util.List;
import Model.EnumPack.Time;
import Model.EnumPack.Floor;

import Model.Entity.GuardSchedule;

public class WorkTable {
	static private List <GuardSchedule> worktable = new ArrayList <GuardSchedule>();
	
	private WorkTable(){
	}
	
	public List <GuardSchedule> getInstance() {
		return worktable;
	}
	
	static public boolean addWorkTable(GuardSchedule guardschedule) {
		worktable.add(guardschedule);
		return true;
	}
	
	static public boolean isValid(int time, int floor) {
		for (GuardSchedule i : worktable){
			if(i.getTime() == Time.getTime(time) && i.getFloor() == Floor.getFloor(floor)) {
				return true;
			}
		}
		return false;
	}
	
	static public GuardSchedule getGuardSchedule(int id) {
		for(GuardSchedule i : worktable){
			if(i.getId() == id) return i;
		}
		return null;
	}
}
