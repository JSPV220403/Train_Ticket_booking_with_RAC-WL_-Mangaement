package Railway_Reservation;

import java.util.Arrays;

public class cancellation {
	public static void ticketCancel(int id) {
		
		for(passenger p: passenger.passengers) {
			if(p.id==id) {
				if(p.bp=='l') {
					Seats.low.add(p.seat_number);
				}
				else if (p.bp=='m') {
					Seats.mid.add(p.seat_number);
				}
				else if(p.bp=='u') {
					Seats.up.add(p.seat_number);
				}
				passenger temp= passenger.rac.get(0);
				temp.bp=p.bp;
				passenger.rac.remove(0);
				passenger.passengers.add(temp);
				
				passenger.rac.add(passenger.wl.get(0));
				passenger.wl.remove(0);
				return;
				
			}
		}
		
	}
}
