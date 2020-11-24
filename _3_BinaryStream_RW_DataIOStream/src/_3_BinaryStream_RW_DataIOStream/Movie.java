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

import java.time.LocalDate;


public class Movie 

{
	private String name;
	private int year;
	private LocalDate release_date;
	private String description;
	private String director;
	private String[] Actors;
	
	//Constructors
	public Movie()//default constructor
	{
		
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
	
}//end of class Movie
