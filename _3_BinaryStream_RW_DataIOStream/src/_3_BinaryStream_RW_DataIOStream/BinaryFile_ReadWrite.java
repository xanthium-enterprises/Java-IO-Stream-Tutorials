// Reading and Writing a binary File using  DataInputStream/Data Outputstream  Classes

package _3_BinaryStream_RW_DataIOStream;

public class BinaryFile_ReadWrite
{

	public static void main(String[] args) 
	{
		Movie m = new Movie();
		
		m.setName("Tenet");
		m.setYear(2011);
		
		System.out.println(m.getName());
		System.out.println(m.getYear());
	}

}
