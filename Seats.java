package Railway_Reservation;
import java.util.*;

public class Seats {
	static ArrayList<Integer>low= new ArrayList<>(Arrays.asList(1,2));
	static ArrayList<Integer>mid= new ArrayList<>(Arrays.asList(1,2));
	static ArrayList<Integer>up= new ArrayList<>(Arrays.asList(1));
	static Queue<Integer>rac= new LinkedList<>(Arrays.asList(1,2));
	static Queue<Integer>wl= new LinkedList<>(Arrays.asList(1,2));
	
	public static void printAvailableTickets() {
		for(Integer i: low) {
			System.out.println("\n"+i+'L');
		}
		for(Integer i: mid) {
			System.out.println("\n"+i+'M');
		}
		for(Integer i: up) {
			System.out.println("\n"+i+'U');
		}
	}
}
