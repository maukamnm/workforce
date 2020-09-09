package workforce;

import java.util.InputMismatchException;
import java.util.Scanner;

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

		// Create a Scanner object to allow user input
		Scanner sc = new Scanner(System.in);

		// Show all the rooms in  the hotel
		System.out.println(hotel);

		// Create and show a menu for the user
		// Keep showing until they enter a 0
		do {
			System.out.println("Operations Menu");
			System.out.println("======================");
			System.out.println("0. Exit");
			System.out.println("1. Show all rooms");
			System.out.println("2. Randomly dirty rooms");
			System.out.println("3. Clean all rooms");
			System.out.println("======================");	
			System.out.println("Which Option? ");
			// Allow the user to enter a number.
			// What happens if they enter a letter?
			int choice = 0;
			try{
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Try again!");
				operateHotel(hotel);
			}
			// Pick the option from the switch statement
			switch(choice) {
			// if choice == 0
			case 0:
				// Exit the program
				System.exit(0);
				break;
			// if choice == 1	
			case 1:
				// Show all the rooms in the hotel now that some are messy
				System.out.println(hotel);
				break;
			// if choice == 2
			case 2:
				// randomly dirty up some rooms
				hotel.messy();
				break;
			// if choice == 3
			case 3:
				// clean all rooms
				hotel.cleanAll();
				break;
			// there is no default case as the loop will repeat anyway
			}

		} while (true); // We will handle the exit in the loop
	}

}
