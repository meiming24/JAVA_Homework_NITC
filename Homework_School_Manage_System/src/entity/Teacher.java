package entity;

import eNum.Gender;
import eNum.Job;

public class Teacher extends Info {
	private Gender gender;
	private Job job;
	
	public Teacher(int id, String name, int age, int gender, int job) {
		super(id, name, age);
		this.gender = Gender.getGender(gender);
		this.job = Job.getJob(job);
	}
	
	public Gender getGender() {
		return gender;
	}
	public Job getJob() {
		return job;
	}
}
