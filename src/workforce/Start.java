package workforce;

public class Start {

	public static void main(String[] args) {
		
		// Create a new Hotel and pass in needed constructor parameter
		// (floors,room/floor, name)
		Hotel hotel = new Hotel(4, 8, "GCU Inn");
		
		// Show all the rooms in  the hotel
		System.out.println(hotel);
		
		// randomly dirty up some rooms
		hotel.messy();
		
		// Show all the rooms in the hotel now that some are messy
		System.out.println(hotel);
	}

}
