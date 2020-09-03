package workforce;

public class Hotel {
	
	// Class attributes
	 private String name;		// e.g. Grand Hotel
	 private Room [][] rooms;	// MultiDimensional array of rooms by floor
	 
	 // Constructor that creates a hotel and rooms
	 public Hotel (int numFloors, int numRooms, String name) {
		 
		 // Set the hotel's name
		 this.name = name;
		 
		 // Actually create the array of rooms because we know the size now
		 rooms = new Room[numFloors][numRooms];
		 
		 // Loop through each floor and room and create a Room object
		 // to put in to the array.
		 for (int x = 0; x < numFloors; x++) {
			 for (int y = 0; y < numRooms; y++) {
				 // Make an empty Room object for each loop (Local variable)
				 Room room = new Room();
				 room.floorNum = x + 1;
				 room.roomNum = (x + 1) * 100 + y;
				 // Add the room finally to the array
				 rooms[x][y] = room;
			 }
		 }
	 }
	 
	 
	 // Method used to dirty the rooms
	 public void messy() {
		 // Loop through all the floors and rooms
		 for (int x = 0; x < rooms.length; x++) {
			 for (int y = 0; y < rooms[x].length; y++) {
				 int dirtyScore = (int)(Math.random() * 10);
				 if (dirtyScore > 5)
					 rooms[x][y].isClean = false;
			 }
		 }	
	 }
	 
	 // Method used to clean all the rooms
	 public void cleanAll() {
		 // Loop through all the floors and rooms
		 for (int x = 0; x < rooms.length; x++) {
			 for (int y = 0; y < rooms[x].length; y++) {
					 rooms[x][y].isClean = true;
			 }
		 }	
	 }
	 
	 // List all the rooms in the hotel
	 // This method OVERRIDES the default toString() built in to Java
	 public String toString() {
		 String output = "HotelName = " + name + "\n";
		 output += "Rooms\n";
		 output += "========================\n";
		 
		 // Loop through all the floors and rooms
		 for (int x = 0; x < rooms.length; x++) {
			 output += "FLOOR #" + (x + 1) + "\n";
			 for (int y = 0; y < rooms[x].length; y++) {
				 output += rooms[x][y];
			 }
		 }	
		 // Don't print here, send all entire String back to where it was called
		 return output;
		 
	 }
	 

}
