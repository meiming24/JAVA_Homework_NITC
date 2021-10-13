package entity;

import eNum.Gender;
import eNum.Job;

public class Guard extends Info {
	private Gender gender;
	private Job job;
	
	public Guard(int id, String name, int age, int gender, int job) {
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
