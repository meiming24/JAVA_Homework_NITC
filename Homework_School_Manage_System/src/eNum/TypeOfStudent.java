package eNum;

public enum TypeOfStudent {
	FORMALSTUDY(1),TRANSFER(2),PARTTIMESTUDY(3);
	
	public final int n;
	
	private TypeOfStudent(int n) {
		this.n = n;
	}
		
	public static TypeOfStudent getTypeOfStudent(int n) {
		for(TypeOfStudent i : values()) {
			if(i.n == n) {
				return i;
			}
		}
		return null;
	}
}
