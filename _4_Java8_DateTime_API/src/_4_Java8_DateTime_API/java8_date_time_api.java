/**
 * New java8 Time API 
 */


package _4_Java8_DateTime_API;

import java.time.LocalTime;
import java.time.LocalDate;

public class java8_date_time_api 
{
	public static void main(String[] Args)
	{
		System.out.println("New java8 Time API\n");
		
		// Time Class
		System.out.println("Time API");
	    LocalTime TimeVariable = LocalTime.now();
		System.out.println("LocalTime.now() -> " + TimeVariable);
		System.out.println("Hour 24hr Format -> " + TimeVariable.getHour());
		System.out.println("         Minutes -> " + TimeVariable.getMinute());
		System.out.println("         Seconds -> " + TimeVariable.getSecond());
		System.out.println("    Nano Seconds -> " + TimeVariable.getNano());
		
		// Date Class
		System.out.println("\nDate API");
		LocalDate DateVariableObj = LocalDate.now();
		System.out.println("LocalDate.now() -> " + DateVariableObj);
		System.out.println("           Year -> " + DateVariableObj.getYear());
		System.out.println("          Month -> " + DateVariableObj.getMonthValue());
		System.out.println("            Day -> " + DateVariableObj.getDayOfMonth());
		
		//Encoding Custom date 
		System.out.println("\nEncoding Custom date");
		LocalDate CustomDate1 = LocalDate.of(2000, 12, 1);
		LocalDate CustomDate2 = LocalDate.of(1920, 2, 5);
		
		System.out.println("CustomDate1       -> " + CustomDate1);
		System.out.println("CustomDate1-Year  -> " + CustomDate1.getYear());
		System.out.println("CustomDate1-Month -> " + CustomDate1.getMonth());
		System.out.println("CustomDate1-Day   -> " + CustomDate1.getDayOfMonth());
	}
}
