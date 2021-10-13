package entity;

import eNum.Room;
import eNum.Time;

public class StudySchedule {
	private int id;
	private Room room;
	private Time time;
	
	public StudySchedule(int id, int room, int time) {
		this.id = id;
		this.room = Room.getRoom(room);
		this.time = Time.getTime(time);
	}
	
	public int getId() {
		return id;
	}
	
	public Time getTime() {
		return time;
	}
	
	public Room getPhongHoc() {
		return room;
	}
}
