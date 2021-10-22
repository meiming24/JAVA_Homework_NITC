package Model.Entity;

import Model.EnumPack.Gender;
import Model.EnumPack.Job;
import Model.EnumPack.TypeOfStudent;
import Model.Entity.Info;

public class Student extends Info {
	private Gender gender;
	private Job job;
	private TypeOfStudent typeOfStudent;
	public Student(int id, String name, int age, Gender gender, Job job, TypeOfStudent typeOfStudent) {
		super(id,name,age);
		this.gender = gender;
		this.job = job;
		this.typeOfStudent = typeOfStudent;
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
