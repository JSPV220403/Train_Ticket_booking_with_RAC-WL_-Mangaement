package RTB;
import java.util.*;
class tickets{
	static int number=1;
	int id=number;
	int Age=0;
	char berth;
	
	String name;
	tickets(int id, String name, int Age,char berth){
		this.id= number++;
		this.name= name;
		this.Age= Age;
		this.berth= berth;
	}
}

class operations{
	static int U=1;
	static int M=1;
	static int L=1;
	static int rac=1;
	static int wl=1;
	
	static LinkedList<tickets> TicketList= new LinkedList<>();
	static Queue<tickets> RAC= new LinkedList<>();
	static Queue<tickets> WL= new LinkedList<>();
	
	
	public static void Availability() {
		System.out.println("Upper Availability "+U);
		System.out.println("Middle Availability "+M);
		System.out.println("Lower1 Availability "+L);
		System.out.println("RAC Availability "+rac);
		System.out.println("Waiting List Availability "+wl);
		
		System.out.println("_______________________________________________");
	}
	public static void BookTicket() {
		String name;
		int age;
		char berth;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter name: ");
		name= sc.nextLine();
		System.out.print("Enter Age: ");
		age= sc.nextInt();
		System.out.print("Enter Berth Preference: ");
		berth= sc.next().charAt(0);
		
		if(berth=='L') {
			if(L-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, berth));
				System.out.println("One ticket Booked Prefered Berth");
				L--;
			}
			else if(M-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, 'M'));
				System.out.println("One ticket Booked Out of Prefered Berth");
				M--;
			}
			else if(U-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, 'U'));
				System.out.println("One ticket Booked Out of Prefered Berth");
				U--;
			}
			else if(rac-1>=0) {
				rac--;
				RAC.add(new tickets(tickets.number, name, age, berth));
				System.out.println("You are in RAC");
			}
			else if(wl-1>=0) {
				wl--;
				System.out.println("You are in Waiting List");
			}
			else {
				System.out.println("No tickets Available ");
			}
			
		}
		else if(berth=='U') {
			if(U-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, berth));
				System.out.println("One ticket Booked Prefered Berth");
				U--;
			}
			else if(M-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, 'M'));
				System.out.println("One ticket Booked Out of Prefered Berth");
				M--;
			}
			else if(L-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, 'U'));
				System.out.println("One ticket Booked Out of Prefered Berth");
				L--;
			}
			else if(rac-1>=0) {
				rac--;
				RAC.add(new tickets(tickets.number, name, age, berth));
				System.out.println("You are in RAC");
			}
			else if(wl-1>=0) {
				wl--;
				System.out.println("You are in Waiting List");
			}
			else {
				System.out.println("No tickets Available ");
			}
			
		}
		else if(berth=='M') {
			if(M-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, berth));
				System.out.println("One ticket Booked Prefered Berth");
				M--;
			}
			else if(U-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, 'U'));
				System.out.println("One ticket Booked Out of Prefered Berth");
				U--;
			}
			else if(L-1>=0){
				TicketList.add(new tickets(tickets.number, name, age, 'L'));
				System.out.println("One ticket Booked Out of Prefered Berth");
				L--;
			}
			else if(rac-1>=0) {
				rac--;
				RAC.add(new tickets(tickets.number, name, age, berth));
				System.out.println("You are in RAC");
			}
			else if(wl-1>=0) {
				wl--;
				System.out.println("You are in Waiting List");
			}
			else {
				System.out.println("No tickets Available ");
			}
		}
		
		
	}
	public static void BookedTickets() {
		for(int i=0; i< TicketList.size(); i++) {
			System.out.println(TicketList.get(i).id);
			System.out.println(TicketList.get(i).name);
			System.out.println(TicketList.get(i).Age);
			System.out.println(TicketList.get(i).berth);
			System.out.println("______________________________________________");
		}
	}
	public static void TicketCancel() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id= sc.nextInt();
		tickets o= TicketList.get(id-1);
		if(o.berth=='L') {
			L++;
		}
		else if(o.berth=='M') {
			M++;
		}
		else if(o.berth=='U') {
			U++;
		}
		if(RAC.size()!=0) {
			tickets o1= RAC.peek();
			o1.berth= o.berth;
			rac--;
			if(o.berth=='L') {
				L++;
			}
			else if(o.berth=='M') {
				M++;
			}
			else if(o.berth=='U') {
				U++;
			}
			TicketList.add(RAC.peek());
			RAC.remove(RAC.peek());	
		}
		TicketList.remove(id-1);
		if(WL.size()!=0) {
			tickets o1= WL.peek();
			o1.berth= o.berth;
			if(o.berth=='L') {
				L++;
			}
			else if(o.berth=='M') {
				M++;
			}
			else if(o.berth=='U') {
				U++;
			}
			RAC.add(WL.peek());
			WL.remove(WL.peek());
			
		}
		
	}
	
}

public class Main{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=0;
		 
		while(true) {
			System.out.println("1.Ticket Availability");
			System.out.println("2.Book Ticket");
			System.out.println("3.Booked Tickets");
			System.out.println("4.Ticket Cancellation");
			System.out.println("Enter your input: ");
			n= sc.nextInt();
			if(n==1) {
				operations.Availability();
			}
			else if(n==2) {
				operations.BookTicket();
			}
			else if(n==3) {
				operations.BookedTickets();
			}
			else if(n==4) {
				operations.TicketCancel();
			}
			else {
				break;
			}
			
		}
	}
}
