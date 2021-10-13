package Singleton;

import java.util.ArrayList;
import java.util.List;
import eNum.Time;
import eNum.Room;

import entity.StudySchedule;

public class StudyTable {
	static private List <StudySchedule> studytable = new ArrayList <StudySchedule> ();
	
	private StudyTable(){
	}
	
	public List <StudySchedule> getInstance() {
		return studytable;
	}
	
	static public boolean addStudyTable (StudySchedule studyschedule) {
		studytable.add(studyschedule);
		return true;
	}
	
	static public boolean isValid(int time, int room) {
		for (StudySchedule i : studytable){
			if(i.getTime() == Time.getTime(time) && i.getPhongHoc() == Room.getRoom(room)){
				return true;
			}
		}
		return false;
	}
	
	static public StudySchedule getStudySchedule(int id) {
		for(StudySchedule i : studytable) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
