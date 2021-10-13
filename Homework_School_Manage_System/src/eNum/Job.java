package eNum;

public enum Job {
	GUARD(1), SANITATIONWORKER(2), TEACHER(3), STUDENT(4);
	public final int n;
	
	private Job(int n) {
		this.n = n;
	}
		
	public static Job getJob(int n) {
		for(Job i : values()) {
			if(i.n == n) {
				return i;
			}
		}
		return null;
	}	
}
