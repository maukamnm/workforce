package workforce;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

	// Munoz added scanner and arraylist
	static ArrayList<HouseKeeper> housekeepers = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Hotel> hotels = new ArrayList<>();

	public static void main(String[] args) {

// Create a new Hotel and pass in needed constructor parameter
		// (floors,room/floor, name)
		hotels.add(new Hotel(4, 8, "GCU Inn"));

		// Starts the hotel operations by passing hotel object
		operateHotel(hotels);
	}

	// Method that does all the operations
	// and starts by accepting a Hotel object as a parameter
	private static void operateHotel(ArrayList<Hotel> hotels) {
		Hotel hotel = new Hotel();
		// Create a Scanner object to allow user input
		Scanner sc = new Scanner(System.in);

		// Show all the rooms in the hotel
		System.out.println(hotels);

		// Create and show a menu for the user
		// Keep showing until they enter a 0
		do {
			System.out.println("Operations Menu");
			System.out.println("======================");
			System.out.println("0. Exit");
			System.out.println("1. Show all rooms");
			System.out.println("2. Randomly dirty rooms");
			System.out.println("3. Clean all rooms");
			// Munoz: Basic enhancement 3
			System.out.println("4. Enter new Hotel");
			System.out.println("5. Enter new Hotel Staff (Housekeeper)");
			System.out.println("6. Review all Housekeepers");
			System.out.println("======================");
			System.out.println("Which Option? ");
			// Allow the user to enter a number.
			// What happens if they enter a letter?
			int choice = 0;
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Try again!");
				operateHotel(hotels);
			}
			// Pick the option from the switch statement
			switch (choice) {
			// if choice == 0
			case 0:
				// Exit the program
				System.exit(0);
				break;
			// if choice == 1
			case 1:
				// Show all the rooms in the hotel now that some are messy
				System.out.println(hotels);
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
			case 4:
				// create hotel
				createHotel();
				break;
			case 5:
				// create staff
				String name = null;
				double wage = 0;
				int speed = 0;
				createStaff();
				break;
			case 6:
				// print out housekeepers
				reviewStaff();
				break;
			// there is no default case as the loop will repeat anyway
			}

		} while (true); // We will handle the exit in the loop
	}

	public static void createHotel() {

		try {
			System.out.println("Enter Hotel Name");
			String name = sc.nextLine();
			System.out.println("Enter Number of Hotel Floors");
			int floors = sc.nextInt();
			System.out.println("Enter Number of Hotel Rooms per Floor");
			int rooms = sc.nextInt();
			hotels.add(new Hotel(floors, rooms, name));
		}

		catch (InputMismatchException e) {
			System.out.println("Whoops! Try again..");
			createHotel();
		}
	}

	public static void createStaff() {
		try {
		System.out.println("Enter Housekeepers name:");
		String name = sc.nextLine();
		System.out.println("Enter Housekeepers wage per hour:");
		double wage = sc.nextDouble();
		System.out.println("Enter Housekeepers speed of rooms per hour:");
		int speed = sc.nextInt();
		housekeepers.add(new HouseKeeper(name, wage, speed));
		}

		catch (InputMismatchException e) {
			System.out.println("Whoops! Try again..");
			createStaff();
		}
	}
	public static void reviewStaff() {
		for(int i = 0; i<housekeepers.size(); i++) {
			System.out.println((i+1) + ": " + housekeepers.get(i));
		}
	}
}
