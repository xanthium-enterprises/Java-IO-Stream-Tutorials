// Creates a file with filename composed of current date time info
// Writes info in the array to the text file.



import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileWriter;

import java.io.File;

import java.time.LocalDate;
import java.time.LocalTime;

public class BufferedWriter_File_Write 
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
		
		//================================================================================================//
		//                              Creating a File to store data                                     //
		//================================================================================================//
		File filehandle = new File(FileName);
			
		try
		{
			if (filehandle.createNewFile())
				System.out.println("created File " + FileName );
		}
		catch(Exception E )
		{
			System.out.println(E.getMessage());
		}
		
		//================================================================================================//
		//                             Writing data from Array to File                                    //
		//================================================================================================//
		
		try
		{
			PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(filehandle)));	
			
		    for(String P:Text_to_Write )
		    	pr.println(P);
		    
		    pr.close(); //If the stream is not closed ,data will not be written to the file
		}
		catch(Exception E )
		{
			System.out.println(E.getMessage());
		}
		
	}//end of main()

}//End  of class 
