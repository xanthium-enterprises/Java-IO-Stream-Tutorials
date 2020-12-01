// List all the files in an already existing directory


import java.io.*;

public class ListFilesInDirectory
{
	public static void main(String[] Args)
	{
		String path = "E:\\_3_Java_Tutorials"; //Name of an existing directory
		
		File dir = new File(path);
		
		try
		{
			if (dir.isDirectory())
			{
				File[] files = dir.listFiles();
				int i=1;
				for (File f : files)
				{
					
					System.out.println(" " + "("+ i +")  " + f.getName());
					i++;
				}
					
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
}	


