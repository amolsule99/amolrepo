package Threadss;

public class MovieBookApp extends Thread
{
	static BookTicketSeat b;
	
	int seats;
	
	public void run()
	{
		b.bookSeat(seats);
		
	}

	public static void main(String[] args) 
	{
		b=new BookTicketSeat();
		
		MovieBookApp deepak=new MovieBookApp(); //Thread-0
		deepak.seats=7;
		deepak.start();
		
		MovieBookApp amol=new MovieBookApp();//Thread-1
		amol.seats=6;
		amol.start();
		

	}

}
