package eNum;

public enum Gender {
	MALE(1), FEMALE(0), OTHER(2);
	
	public final int n;
	private Gender(int n) {
		this.n = n;
	}
	
	public static Gender getGender(int n) {
		for(Gender i : values()) {
			if(i.n == n) return i;
		}
		return null;
	}
}
