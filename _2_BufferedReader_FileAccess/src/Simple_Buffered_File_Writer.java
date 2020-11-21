//Simple_Buffered_File_Writer
//Creates a file Simple_buff_File_Writer.txt and writes a string to the text file

import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Simple_Buffered_File_Writer 
{

	public static void main(String[] args) 
	{
		File fwriter = new File("Simple_buff_File_Writer.txt");
		
		try
		{
			if(fwriter.createNewFile() == true)
			{
				System.out.println("File Simple_buff_File_Writer.txt is created");
			}
				
		}
		catch(Exception E)
		{
			System.out.println(E.getMessage());
		}
		
		try
		{
			PrintWriter print_writer= new PrintWriter(new BufferedWriter(new FileWriter(fwriter)));
			print_writer.println("Hello World from PrintWriter");
			print_writer.close();//without these data will not be written to text file
		}
		catch(Exception E)
		{
			System.out.println(E.getMessage());
		}
		
		
	}//end of main()
}//End  of class 
