/**
 * New java8 Time API 
 */


package _4_Java8_DateTime_API;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;


public class java8_date_time_api 
{
	public static void main(String[] Args)
	{
		System.out.println("New java8 Time API");
		
		// Get the current date and time
	    LocalDateTime currentTime = LocalDateTime.now();
	    System.out.println("Current DateTime: " + currentTime);
	    
	    LocalDate date1 = currentTime.toLocalDate();
	    System.out.println("date1: " + date1);
	    
	    
	}
}
