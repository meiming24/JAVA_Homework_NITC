package Model.Entity;

import Model.EnumPack.Gender;
import Model.EnumPack.Job;

public abstract class Info {
	private int id;
	private String name;
	private int age;
	
	public Info(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	abstract public Gender getGender();
	abstract public Job getJob();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
}
