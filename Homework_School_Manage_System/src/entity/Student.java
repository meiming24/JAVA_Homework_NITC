package entity;

import eNum.Gender;
import eNum.Job;
import eNum.TypeOfStudent;

public class Student extends Info {
	private Gender gender;
	private Job job;
	private TypeOfStudent typeOfStudent;
	public Student(int id, String name, int age, int gender, int job, int typeOfStudent) {
		super(id,name,age);
		this.gender = Gender.getGender(gender);
		this.job = Job.getJob(job);
		this.typeOfStudent = TypeOfStudent.getTypeOfStudent(typeOfStudent);
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public Job getJob() {
		return job;
	}
	
	public TypeOfStudent getTypeOfStudent() {
		return typeOfStudent;
	}
}
