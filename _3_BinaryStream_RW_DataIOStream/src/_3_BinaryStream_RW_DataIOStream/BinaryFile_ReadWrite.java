// Reading and Writing a binary File using  DataInputStream/Data Outputstream  Classes

package _3_BinaryStream_RW_DataIOStream;

import java.io.File;

public class BinaryFile_ReadWrite
{

	public static void main(String[] args) 
	{
		Movie[] movies = getMovies();
		
		File fhandle = new File("javabinaryfile.bin");
		
		//create a new binary file in disk
		try
		{
			
			
			if(fhandle.createNewFile()) //if file created successfully
			{
				System.out.println("File :- " + fhandle.getName() + " created ");
			}
				
			
		}
		catch(Exception fileEx)
		{
			System.out.println(fileEx.getMessage());
		}
		
		/*
			for(Movie PM:movies)
			{
				System.out.println(PM.getName());
				System.out.println(PM.getYear());
				System.out.println(PM.getDirector());
				System.out.println();
			}
		*/
		
		//delete the file 
		try
		{
			System.out.println("Press any key to delete " + fhandle.getName());
			System.in.read(); //wait for key press 
			
			if(fhandle.delete())
			{
				System.out.println("File :- " + fhandle.getName() + " deleted ");
			}
				
				
		}
		catch(Exception fileEx)
		{
			System.out.println(fileEx.getMessage());
		}
	}//end of main()
	
	// to populate the classes with some default values
	private static Movie[] getMovies()
	{
		Movie[] m = new Movie[5];
		
		m[0] = new Movie("Tenet",2020,"Christofer Nolan");
		m[1] = new Movie("The Wolf of Wall Street",2013,"Martin Scorsese");
		m[2] = new Movie("Pan's Labyrinth",2006,"Guillermo del Toro");
		m[3] = new Movie("Alien",1979,"Ridley Scott");
		m[4] = new Movie("Whiplash",2014,"Damien Chazelle");
		
		return m;//returns an array of movie objects
	}

}//end of class
