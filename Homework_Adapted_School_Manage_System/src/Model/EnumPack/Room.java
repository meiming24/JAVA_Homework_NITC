package Model.EnumPack;

public enum Room {
	A101(1), B202(2), C303(3), D404(4), E505(5);
	
	public final int n;
	
	private Room(int n) {
		this.n = n;
	}
	public static Room getRoom(int n) {
		for(Room i : values()) {
			if(i.n == n) return i;
		}
		return null;
	}
}
