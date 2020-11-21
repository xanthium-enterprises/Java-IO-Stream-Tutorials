
// Read from stream-file1.txt using Streams and write into the stream-file2.txt 
// Byte by Byte write


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamReaderCopy
{
	public static void main(String[] Args) throws Exception
	{
		// Both Streams are assigned null value 
		
		FileInputStream   inputstream  = null;
		FileOutputStream  outputstream = null;
		
		int temp = 0;
		
		try
		{
			inputstream  = new FileInputStream("stream-file1.txt");// File needs to exist before running the program
			outputstream = new FileOutputStream("stream-file2.txt"); //File is created automatically
			
			
			while((temp = inputstream.read()) != -1) //Check for end of file 
			{
				char c = (char)temp;     // Convert integer to character byte 
				outputstream.write(c);   // write into stream-file2.txt byte by byte 
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
			// Close both the streams 
			if (inputstream != null)
				inputstream.close();
				
			if (outputstream != null)
				outputstream.close();
		}
		
	}
}
