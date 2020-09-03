package workforce;

public class Start {

	public static void main(String[] args) {
		
		// Create a new Hotel and pass in needed constructor parameter
		// (floors,room/floor, name)
		Hotel myHotel = new Hotel(4, 8, "GCU Inn");
		
		// Starts the hotel operations by passing hotel object
		operateHotel(myHotel);
	}
	
	// Method that does all the operations
	// and starts by accepting a Hotel object as a parameter
	private static void operateHotel(Hotel hotel) {
		
		// Show all the rooms in  the hotel
		System.out.println(hotel);
		
		// randomly dirty up some rooms
		hotel.messy();
		
		// Show all the rooms in the hotel now that some are messy
		System.out.println(hotel);
		
		// clean all rooms
		hotel.cleanAll();
		
		// Show all the rooms in the hotel now that they are clean
		System.out.println(hotel);
	}

}
