package workforce;

public class HouseKeeper {
	
	// Class attributes
	private String name;
	private double payPerHour;
	private int roomsPerHour;
	
	// Constructor for class
	public HouseKeeper (String name, double pay){
		this.name = name;
		this.payPerHour = pay;
	}
	
	// Overloaded Constructor for class - additional parameter
	public HouseKeeper (String name, double pay, int rooms){
		this.name = name;
		this.payPerHour = pay;
		this.roomsPerHour = rooms;
	}
	

}
