package Model.EnumPack;

public enum Time {
	FROM6HTO7H (1), FROM7HTO8H (2), FROM8HTO9H (3), FROM9HTO10H (4); 
	
	public final int n;
	
	private Time(int n) {
		this.n = n;
	}
	
	public static Time getTime(int n) {
		for(Time i : values()) {
			if(i.n == n) {
				return i;
			}
		}
		return null;
	}
}
