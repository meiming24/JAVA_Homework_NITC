package entity;

import eNum.Floor;
import eNum.Time;

public class GuardSchedule {
	private int id;
	private Floor floor;
	private Time time;
	
	public GuardSchedule(int id, int floor, int time) {
		this.id = id;
		this.floor = Floor.getFloor(floor);
		this.time = Time.getTime(time);
	}
	
	public int getId() {
		return id;
	}
	
	public Time getTime() {
		return time;
	}
	
	public Floor getFloor() {
		return floor;
	}
}
