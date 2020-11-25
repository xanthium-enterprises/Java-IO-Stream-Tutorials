// Reading and Writing a binary File using  DataInputStream/Data Outputstream  Classes

package _3_BinaryStream_RW_DataIOStream;

public class BinaryFile_ReadWrite
{

	public static void main(String[] args) 
	{
		Movie[] m = new Movie[5];
		
		m[0] = new Movie("Tenet",2020,"Christofer Nolan");
		m[1] = new Movie("The Wolf of Wall Street",2013,"Martin Scorsese");
		m[2] = new Movie("Pan's Labyrinth",2006,"Guillermo del Toro");
		m[3] = new Movie("Alien",1979,"Ridley Scott");
		m[4] = new Movie("Whiplash",2014,"Damien Chazelle");
		
		for(Movie PM:m)
		{
			System.out.println(PM.getName());
			System.out.println(PM.getYear());
			System.out.println(PM.getDirector());
			System.out.println();
		}
		
	}

}
