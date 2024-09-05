package Railway_Reservation;

public class Book {
	
	public static void bookTicket(passenger p) {
		if(Seats.wl.isEmpty()) {
			System.out.println("No tickets available!!!");
			return;
		}
		if(p.bp=='l') {
			if(!Seats.low.isEmpty()) {
				System.out.print("Alloted Successfully!!!");
				System.out.print(Seats.low.get(0));
				p.seat_number= Seats.low.get(0);
				passenger.passengers.add(p);
				Seats.low.remove(0);
			}
			else if(!Seats.mid.isEmpty()) {
				System.out.print("Middle Alloted Successfully!!!");
				System.out.print(Seats.mid.get(0));
				p.seat_number= Seats.mid.get(0);
				passenger.passengers.add(p);
				Seats.mid.remove(0);
			}
			else if(!Seats.up.isEmpty()) {
				System.out.print("up Alloted Successfully!!!");
				System.out.print(Seats.up.get(0));
				p.seat_number= Seats.up.get(0);
				passenger.passengers.add(p);
				Seats.up.remove(0);
			}
			else if(!Seats.rac.isEmpty()) {
				System.out.print("RAC Alloted Successfully!!!");
				System.out.print(Seats.rac.peek());
				p.seat_number= Seats.rac.peek();
				passenger.passengers.add(p);
				Seats.rac.poll();
			}
			else {
				System.out.print("Waiting List Alloted Successfully!!!");
				System.out.print(Seats.wl.peek());
				p.seat_number= Seats.wl.peek();
				passenger.passengers.add(p);
				Seats.wl.poll();
			}
		}
		if(p.bp=='u') {
			if(!Seats.up.isEmpty()) {
				System.out.print("Alloted Successfully!!!");
				System.out.print(Seats.up.get(0));
				p.seat_number= Seats.up.get(0);
				passenger.passengers.add(p);
				Seats.up.remove(0);
			}
			else if(!Seats.mid.isEmpty()) {
				System.out.print("mid Alloted Successfully!!!");
				System.out.print(Seats.mid.get(0));
				p.seat_number= Seats.mid.get(0);
				passenger.passengers.add(p);
				Seats.mid.remove(0);
			}
			else if(!Seats.low.isEmpty()) {
				System.out.print("low Alloted Successfully!!!");
				System.out.print(Seats.low.get(0));
				p.seat_number= Seats.low.get(0);
				passenger.passengers.add(p);
				Seats.low.remove(0);
			}
			else if(!Seats.rac.isEmpty()) {
				System.out.print("RAC Alloted Successfully!!!");
				System.out.print(Seats.rac.peek());
				p.seat_number= Seats.rac.peek();
				passenger.passengers.add(p);
				Seats.rac.poll();
			}
			else {
				System.out.print("Waiting List Alloted Successfully!!!");
				System.out.print(Seats.wl.peek());
				p.seat_number= Seats.wl.peek();
				passenger.passengers.add(p);
				Seats.wl.poll();
			}
		}
		if(p.bp=='m') {
			if(!Seats.mid.isEmpty()) {
				System.out.print("Alloted Successfully!!!");
				System.out.print(Seats.mid.get(0));
				p.seat_number= Seats.mid.get(0);
				passenger.passengers.add(p);
				Seats.mid.remove(0);
			}
			else if(!Seats.up.isEmpty()) {
				System.out.print("up Alloted Successfully!!!");
				System.out.print(Seats.up.get(0));
				p.seat_number= Seats.up.get(0);
				passenger.passengers.add(p);
				Seats.up.remove(0);
			}
			else if(!Seats.low.isEmpty()) {
				System.out.print("low Alloted Successfully!!!");
				System.out.print(Seats.low.get(0));
				p.seat_number= Seats.low.get(0);
				passenger.passengers.add(p);
				Seats.low.remove(0);
			}
			else if(!Seats.rac.isEmpty()) {
				System.out.print("RAC Alloted Successfully!!!");
				System.out.print(Seats.rac.peek());
				p.seat_number= Seats.rac.peek();
				passenger.passengers.add(p);
				Seats.rac.poll();
			}
			else {
				System.out.print("Waiting List Alloted Successfully!!!");
				System.out.print(Seats.wl.peek());
				p.seat_number= Seats.rac.peek();
				passenger.passengers.add(p);
				Seats.wl.poll();
			}
		}
	}
}
