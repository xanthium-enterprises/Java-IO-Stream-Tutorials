// Creates a file inside a directory
// in this format -> MyDirectory\MyFileInsideDir.txt
// uses java.nio.*

package _6_Java_nio_Path;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.File; //for File.separator

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;


public class Java_nio_Files_Directory_creation
{

	public static void main(String[] args)
	{
		
		String dirname  = "MyDirectory";
		String filename = dirname + File.separator + "MyFileInsideDir.txt";
		
		
		Path dir_path  = Paths.get(dirname);
		Path file_path = Paths.get(filename);
		
		// Create the directory
		try
		{
			Path obj  = Files.createDirectory(dir_path); //returns a path object
			System.out.println("Directory Creation Status: " + obj.toString());
			
		} 
		catch(FileAlreadyExistsException e )
		{
			System.out.println("Directory Already exists");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//Create the file inside the directory
		try
		{
			Path obj = Files.createFile(file_path);
			System.out.println("File Creation Status: " + obj.toString());
			
		} 
		catch(FileAlreadyExistsException e )
		{
			System.out.println("File Already exists");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("\nCheck dir/file inside OS File System \nPress Enter to delete");
		try 
		{
			System.in.read();
		} 
		catch (IOException e1) 
		{
			System.out.println("System.in.read(); Exception occured");
			e1.printStackTrace();
		}
		
		//==============================================================================//
		// Deletion                                                                     //
		//==============================================================================//
		
		// Delete the File
		try
		{
			if( Files.deleteIfExists(file_path)) //returns bool
				System.out.println("File Deleted");
		} 
		catch(DirectoryNotEmptyException e)
		{
			System.out.println("Directory not empty");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
				
				
		
		// Delete the directory 
		try
		{
			if( Files.deleteIfExists(dir_path)) //returns bool
				System.out.println("Directory Deleted");
			
		} 
		catch(DirectoryNotEmptyException e)
		{
			System.out.println("Directory not empty");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("End of main()");

	}

}
