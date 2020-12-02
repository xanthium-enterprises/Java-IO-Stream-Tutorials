/**
 * Creating a File using java.nio.*
 * 
 */


package _6_Java_nio_Path;

import java.nio.file.Path; //Path is interface
import java.nio.file.Paths;//Paths is class
import java.nio.file.Files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;



public class Java_nio_Files_Creation
{

	public static void main(String[] args)
	{
		
		Path p = Paths.get("mytextfile.txt");
		
		//Create the file
		try
		{
			 Files.createFile(p);//Create  a new File 
			 System.out.println(p.getFileName() +" File created"); 
			 
		}
	    catch(FileAlreadyExistsException Ex)
		{
	    	System.out.println("File already exists");
		}
		
		catch(IOException Ex)
		{
			System.out.println("IO Exception occured");
			Ex.getMessage();
		}
		
		//delete the file
		try 
		{
			if(Files.deleteIfExists(p))
				System.out.println(p.getFileName() + " deleted");
		}
		catch(IOException Ex)
		{
			Ex.getMessage();
		}

		
		
	}//end of main()

}//end of class java_nio_pathClass
