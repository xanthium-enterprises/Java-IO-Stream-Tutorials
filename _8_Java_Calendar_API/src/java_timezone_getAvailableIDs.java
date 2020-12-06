// Java code to illustrate getAvailableIDs() method 
  
import java.util.*; 
  
public class java_timezone_getAvailableIDs
 { 
    public static void main(String args[]) 
    { 
  
        
        String[] Id_array = TimeZone.getAvailableIDs(); // Storing all the available Ids 
  
        
        System.out.println("All the available Ids are: "); // Displaying all the available Ids 
  
        for (int count = 0; count < Id_array.length; count++) 
            System.out.println(Id_array[count]); 
    } 
} 