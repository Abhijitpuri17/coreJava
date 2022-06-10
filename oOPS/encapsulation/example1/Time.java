package oOPS.encapsulation.example1;

public class Time {

	private int hour ;
	private int min ;
	private int sec ;
	private String AMorPM ;
	
       public void setTime(int h , int m , int s) 
	{			
    	   hour = (h >= 0 && h < 24) ?  (h == 0 || h == 12) ? 12 : h % 12  : 0;
		
		   min = (m >= 0 && m < 60) ?  m  : 0;
		
		   sec = (s >= 0 && s < 60) ?  s : 0 ;
		   
		   AMorPM = h >= 12 ? "PM" : "AM" ;
		
		
		if (h >= 24 || m >= 60 || s >= 60)
			{
			hour  = 0 ;
			min  =  0 ;
			sec = 0 ;
			System.out.println("Invalid Time");
			}
			
	}
	
	public String getTime() 
	{
	   return String.format("%d : %02d : %02d %s" , hour , min ,sec , AMorPM) ;
	}	
		
}
