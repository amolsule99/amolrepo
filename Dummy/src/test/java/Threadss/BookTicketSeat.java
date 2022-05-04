package Threadss;

public class BookTicketSeat
{

      int total_seats=10;
      
     synchronized public void bookSeat(int seats)
      {
    	  if(total_seats>=seats)
    	  {
    		  System.out.println("Seats booked successfully");
    		  
    		  total_seats=total_seats-seats;
    		  
    		  System.out.println("Left Seats= "+total_seats);
    		  
    	  }
    	  
    	  else
    	  {
    		  System.out.println("Sorry Seats can not be booked.....!");
    		  System.out.println("Left Seats= "+total_seats);
    	  }
      }
	
	public static void main(String[] args) 
	{
		

	}

}
