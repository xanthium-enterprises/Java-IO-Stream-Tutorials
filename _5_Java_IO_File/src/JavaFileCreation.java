// Program to create a File using java.io.File



import java.io.*;

public class JavaFileCreation
{
	public static void main(String[] Args)
	{
		String FileName      = "C:\\Users\\Rahul\\Desktop\\Java File Management\\logfile.txt";
		
		//String FileName      = "logfile.txt";      // name of the File to be created
		                                             // FileHandle.getParent() returns null instead of parent
		
		File FileHandle      = new File(FileName); // This ctreates a file handle not a File
		
		try
		{
			if (FileHandle.createNewFile())  //Creates a File in the Harddisk ,returns false if file already exists
			{	
				System.out.println("  File Exists");
				System.out.println("  File Name            -> "  + FileHandle.getName()          );
				System.out.println("  File toString()      -> "  + FileHandle.toString()         );
				System.out.println("  File Path            -> "  + FileHandle.toPath()           );
				System.out.println("  File Absolute   Path -> "  + FileHandle.getAbsolutePath()  );
				System.out.println("  File Cannonical Path -> "  + FileHandle.getCanonicalPath() );
				System.out.println("  File Read            -> "  + FileHandle.canRead()          );
				System.out.println("  File Write           -> "  + FileHandle.canWrite()         );
				System.out.println("  File Parent          -> "  + FileHandle.getParent()        );
				
				
				FileHandle.delete();
				
			}
				
			else
				System.out.println(FileHandle.getName() + " Do not Exist");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}
		
	}
	
}