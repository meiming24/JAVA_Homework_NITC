package Singleton;

import java.util.ArrayList;
import java.util.List;
import eNum.Time;
import eNum.Room;

import entity.TeachingSchedule;

public class TeachingTable {
	static private List <TeachingSchedule> teachingtable = new ArrayList <TeachingSchedule>();
	
	private TeachingTable(){
	}
	
	public List <TeachingSchedule> getInstance() {
		return teachingtable;
	}
	
	static public boolean addTeachingTable(TeachingSchedule teachingschedule) {
		teachingtable.add(teachingschedule);
		return true;
	}
	
	static public boolean isValid(int time, int room) {
		for (TeachingSchedule i : teachingtable) {
			if(i.getTime() == Time.getTime(time) && i.getRoom() == Room.getRoom(room)) {
				return true;
			}
		}
		return false;
	}
	
	static public TeachingSchedule getTeachingSchedule(int id){
		for(TeachingSchedule i : teachingtable) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
