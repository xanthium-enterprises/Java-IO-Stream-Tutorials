// Reads the File "Simple_Buffered_FileReader_text.txt" prints the colon seperated values
// Colon seperated values is converted to space seperated values and printed to console 

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Simple_Buffered_File_Reader
{

	public static void main(String[] args) throws Exception
	{
		String FileLine = " ";
		
		File F = new File("Simple_Buffered_FileReader_text.txt");
		BufferedReader br = new BufferedReader(new FileReader(F));
		
		while((FileLine = br.readLine()) != null)
		{
			System.out.println(FileLine);
			
			String[] data = FileLine.split(";");
			
			for(String P:data)
				System.out.print(" " + P);
			
			System.out.println();
		}
		
		br.close();
			
		

	}//end of main()
}//end of class
