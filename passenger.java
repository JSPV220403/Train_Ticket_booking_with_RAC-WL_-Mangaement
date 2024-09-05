package Railway_Reservation;
import java.util.*;

public class passenger {
	static int id_generator=0;
	int id;
	String name;
	char gender;
	int age;
	char bp;
	int seat_number;
	static ArrayList<passenger>passengers= new ArrayList<>();
	static ArrayList<passenger>rac= new ArrayList<>();
	static ArrayList<passenger>wl= new ArrayList<>();
	
	passenger(){
		id= ++id_generator;
	}
	
	public static void printBookedTickets() {
		for(passenger p: passengers) {
			System.out.print(p.id+" ");
			System.out.print(p.name+" ");
			System.out.print(p.age+" ");
			System.out.print(p.seat_number+""+p.bp+"\n");
		}
	}
	
}
