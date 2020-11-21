import java.io.BufferedReader;

import java.time.LocalDate;
import java.time.LocalTime;

public class BufferedReader_File_Write 
{

	public static void main(String[] args)
	{
		//Dummy data to write to File
		String [] Text_to_Write = {
									" No\tDate\tTemp",
									"============================",
									" 1\t21-11-2020\t32C",
									" 2\t22-11-2020\t35C",
									" 3\t23-11-2020\t30C",
									" 4\t24-11-2020\t28C",
									"============================"
								  };
		
		//System.out.println(java.time.LocalDate.now());//prints the current date 
		//System.out.println(java.time.LocalTime.now());//prints the current time
		
		//================================================================================================//
		//                              Date time Formatting Code                                         //
		//================================================================================================//
		
		LocalDate CurrentDate = LocalDate.now();
		LocalTime CurrentTime = LocalTime.now();
		
		System.out.println(CurrentDate.toString());//prints the current date using toString()
		System.out.println(CurrentTime.toString());//prints the current time using toString()
		
		System.out.println();
		
		String[] FormattedCurrentDate = CurrentDate.toString().split("-");
		String[] FormattedCurrentTime = CurrentTime.toString().split(":");
		
		System.out.print("Date->");
		for(String P:FormattedCurrentDate)
			System.out.print(" " + P);
		
		System.out.print("\nTime->");
		for(String P:FormattedCurrentTime)
			System.out.print(" " + P);
		
		//================================================================================================//
		//                              Creating File name from Datetime                                  //
		//================================================================================================//
		String FileName_date =  FormattedCurrentDate[0] + "_" + FormattedCurrentDate[1] + "_" +FormattedCurrentDate[2] +"-";
		String FileName_Time =  FormattedCurrentTime[0] + "_" + FormattedCurrentTime[1];
		String FileName      =  "daq-" + "D" + FileName_date + "T" + FileName_Time +".txt";
		
		System.out.println("\n"+ "FileName ->" + FileName);
		

	}//end of main()

}//End  of class 
