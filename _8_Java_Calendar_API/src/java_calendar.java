// Calendar class in Java


import java.util.Calendar;  //required 

public class java_calendar
{
	public static void main(String[] Args)
	{
		Calendar cal = Calendar.getInstance();
		
		System.out.println("\n        Calendar -> " +cal +"\n");
		
		System.out.println("\nCurrent Calendar -> " +cal.getTime() +"\n");
		
		
		System.out.println("Calendar Type               -> " + cal.getCalendarType());
		System.out.println("Current  Year               -> " + cal.get(Calendar.YEAR));
		System.out.println("Current  Month              -> " + cal.get(Calendar.MONTH));
		System.out.println("Current  Date               -> " + cal.get(Calendar.DATE));
		System.out.println("Current  Day of the Year    -> " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("Current  Day of the Month   -> " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Current  Day of the Week    -> " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("Current  Hour               -> " + cal.get(Calendar.HOUR));
		System.out.println("Current  Hour of the Day    -> " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("AM/PM                       -> " + cal.get(Calendar.AM_PM));
		System.out.println("Current  Minute             -> " + cal.get(Calendar.MINUTE));
		System.out.println("Current  Second             -> " + cal.get(Calendar.SECOND));
		System.out.println("Current  Milliseconds       -> " + cal.get(Calendar.MILLISECOND));
	}
}