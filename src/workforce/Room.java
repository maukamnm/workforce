package workforce;

public class Room {

	// Class attributes
	public int roomNum;  			// e.g. 101, 201, 301
	public int floorNum; 			// e.g. 2, 3, 4
	public boolean isClean = true;	// default the room is clean
	public double sqFt = 450.0;		// e.g. 450.0 (default value)
	
	// Override the build in toString method
	// only prints out a subset of all class attributes
	public String toString() {
		return roomNum + "\t\t" + isClean + "\n";
	}
}
