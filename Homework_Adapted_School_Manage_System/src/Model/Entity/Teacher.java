package Model.Entity;

import Model.EnumPack.Gender;
import Model.EnumPack.Job;
import Model.Entity.Info;

public class Teacher extends Info {
	private Gender gender;
	private Job job;
	
	public Teacher(int id, String name, int age, Gender gender, Job job) {
		super(id, name, age);
		this.gender = gender;
		this.job = job;
	}
	
	public Gender getGender() {
		return gender;
	}
	public Job getJob() {
		return job;
	}
}
