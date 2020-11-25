/**
 	Class for storing movie details
 	contains
             Movie Name   -> String 
             Movie Year   -> Date Variable/String
             Release date -> Date Variable
             Movie description - String
             Director -> String
             Actors   -> String[]
             Budget   -> Money Variable
             
     @author Rahul
     @version 0.1
     
*/

package _3_BinaryStream_RW_DataIOStream;


public class Movie 

{
	private String name;
	private int year;
	private String director;
	
	
	//Constructors
	public Movie()//default constructor
	{
		
	}
	
	//Constructors
	public Movie(String Name,int year,String director)
	{
			this.name = Name;
			this.year = year;
			this.director = director;
	}
	
	// Setters and getters for the name of the movie
	public String getName()
	{
		return name;
	}
	
	public Boolean setName(String name)
	{
		this.name = name;
		return true;
	}
    //--------------------------------------------------//
	
	
	// Setters and getters for the year of the movie
	public int getYear()
	{
		return year;
	}
	
	public Boolean setYear(int year)
	{
		this.year = year;
		return true;
	}
	
	//--------------------------------------------------//
	

	// Setters and getters for the director of the movie
	public String getDirector()
	{
			return director;
	}
		
	public Boolean setDirector(String director)
	{
			this.director = director;
			return true;
	}
		
    //--------------------------------------------------//
	
}//end of class Movie
