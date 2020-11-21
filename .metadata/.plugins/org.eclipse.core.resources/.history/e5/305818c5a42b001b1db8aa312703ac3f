// Wednesday 18 November 2020 
// Openjdk11
// ubuntu 
// 
// Reads the file "story.txt" and prints on the console using FileInputStream.read().
// only ASCII characters are printed.
// All unicode charcters are printed in Gibberish.

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamReading_Eg
{
	public static void main(String [] Args) throws IOException
	{
		
		
		FileInputStream My_fileinputstream = null;
		int temp = 0;
		
		try
		{
			My_fileinputstream = new FileInputStream("story.txt");// Story file should be created before hand
			                                                      // here  _1_FileStream_Reading_Byte/story.txt
			while((temp = My_fileinputstream.read()) != -1) //returns a byte read 
			                                                //or -1 on reaching end of stream.
			{
				char c = (char)temp;
				System.out.print(c);
			}
				
		}
		catch(IOException E)
		{
			System.out.println("Exception Occured");
			System.out.println(E.getMessage());
		} 
		finally
		{
		    if (My_fileinputstream != null)
		    		My_fileinputstream.close(); //Close the stream 
		} 
		
		
	}
}




