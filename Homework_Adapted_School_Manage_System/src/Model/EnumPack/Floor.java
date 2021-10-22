package Model.EnumPack;

public enum Floor {
	FLOORNO1(1), FLOORNO2(2), FLOORNO3(3), FLOORNO4(4);
	
	private final int n;
	
	private Floor(int n) {
		this.n = n;
	}
	
	public static Floor getFloor(int n) {
		for(Floor i : values()) {
			if(i.n == n) return i;
		}
		return null;
	}
	
}
