// To read the contents of  the file "stream-file1.txt" using  FileInputStream and 
// Display the characters on the screen.

// "stream-file1.txt"  should exist before reading it using FileInput Stream.


import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReaderExample
{
	public static void main(String[] Args) throws IOException
	{
		FileInputStream inputstream = null;	
		int temp = 0;
		
		try
		{
			inputstream  = new FileInputStream("stream-file1.txt");
			
			System.out.println();
			
			while((temp = inputstream.read()) != -1)
			{
				char c = (char)temp;
				System.out.print(c);
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			
			System.out.println();
			
			e.printStackTrace();
			
			System.out.println();
		}
		
		finally
		{
			if(inputstream != null)
				inputstream.close();
		}
		
	}
}
