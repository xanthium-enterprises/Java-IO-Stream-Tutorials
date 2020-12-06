// Timezone class in Java


import java.util.*;  //required 


public class java_time_zone
{
	public static void main(String[] Args)
	{
		Date date = new Date(); // A point in time
		
			
		System.out.println("\nSystem Time : "  +  System.currentTimeMillis());
		System.out.println("System Date   : "  +  date);
		
		// CST TimeZone using the Same date
		TimeZone CST = TimeZone.getTimeZone("America/Chicago");
		Calendar USA = Calendar.getInstance(CST);
		USA.setTime(date);
		
		System.out.println("\n");
		
		System.out.println("   CST TimeZone using the Same date    ");
		System.out.println("---------------------------------------");
		System.out.println("TimeZone Name          : " + CST.getDisplayName());
		System.out.println("TimeZone ID            : " + CST.getID());
		System.out.println("Day of the Week in USA : " + USA.get(Calendar.DAY_OF_WEEK));
		System.out.println("Date in USA            : " + USA.get(Calendar.DATE));
		
		TimeZone GMT = TimeZone.getTimeZone("GMT+08");
		Calendar China = Calendar.getInstance(GMT);
		China.setTime(date);
		
		System.out.println("\n");
		
		System.out.println("   GMT TimeZone using the Same date    ");
		System.out.println("---------------------------------------");
		System.out.println("TimeZone Name            : " + GMT.getDisplayName());
		System.out.println("TimeZone ID              : " + GMT.getID());
		System.out.println("Day of the Week in China : " + China.get(Calendar.DAY_OF_WEEK));
		System.out.println("Date in China            : " + China.get(Calendar.DATE));
		
		//System.out.println(China.getInstance());
	}
}