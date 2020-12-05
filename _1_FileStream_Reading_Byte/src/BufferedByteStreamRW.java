/**
 * Buffered Byte stream Read/Write 
 * @author Rahul
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedByteStreamRW
{
	public static void main(String[] args) 
	{
			char[] c = {'H','e','l','l','o','\n','W','o','r','l','d'};
			
			File filehandle = new File("ByteStream.txt");
		
		
			try 
				{
					if (filehandle.createNewFile())
						System.out.println("File Created Succesfully");
					else if(filehandle.exists())
						System.out.println("File exists");
				} 
			catch (IOException e)
				{
					e.printStackTrace();
				}
			try
				{
					BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(filehandle));
				  
					for(char p :c)
					   bf.write(p);
				    
				    bf.close();
				}
			catch(Exception e)
				{
					e.getMessage();
				}
			
			try
				{
					BufferedInputStream bfi = new BufferedInputStream(new FileInputStream(filehandle));
				    
					int read;
					char temp;
					while((read = bfi.read())!= -1)
					{
						temp =(char)read;
						System.out.println(temp);	 
					}
						 
						
				    bfi.close();
				}
			catch(Exception e)
				{
					e.getMessage();
				}
	        

	}//end of main() 
}//end of class
