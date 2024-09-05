package Railway_Reservation;
import java.util.*;

public class Home {
	public static void main(String args[]) {
		int choose;
		Scanner nreader= new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Choose operation:\n1. Book Ticket\n2. Ticket Cancellation\n"
					+ "3. Available Ticket\n4. Booked Ticket");
			
			choose= nreader.nextInt();
			
			switch(choose) {
			
			case 1:
				
				passenger p= new passenger();
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Enter passenger name: ");
				p.name= sc.nextLine();
				
				System.out.println("Enter gender[M/F]: ");
				p.gender= sc.next().charAt(0);
				
				System.out.println("Enter your age: ");
				p.age= nreader.nextInt();
				
				System.out.println("Enter birth preferance: ");
				p.bp= sc.next().charAt(0);
				
				
				
				Book.bookTicket(p);
				
				break;
				
			case 2:
				int id;
				System.out.println("Enter your id: ");
				id= nreader.nextInt();
				cancellation.ticketCancel(id);
				break;
				
			case 3:
				Seats.printAvailableTickets();
				break;
			case 4:
				passenger.printBookedTickets();
				break;
				
			}
			
			
		
		}
	
		
	}
}
