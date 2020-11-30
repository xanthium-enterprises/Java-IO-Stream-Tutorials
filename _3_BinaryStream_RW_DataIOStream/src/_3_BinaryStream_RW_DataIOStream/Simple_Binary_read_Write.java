package _3_BinaryStream_RW_DataIOStream;

import java.io.File;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;

import java.io.IOException;
import java.io.EOFException;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Simple_Binary_read_Write
{

	public static void main(String[] args) 
	{
		
		
		
		File fhandle = new File("simplebinaryfile.bin");
		
		//==============================================================================//
		//                   Create a new binary file in disk                           //
		//==============================================================================//
		try
		{			
			if(fhandle.createNewFile()) //if file created successfully
			{
				System.out.println("File        :- " + fhandle.getName() + " created ");
				System.out.println("File Length :- " + fhandle.length()  + " bytes"   );
			}
				
		}
		catch(Exception fileEx)
		{
			System.out.println(fileEx.getMessage());
		}
		
		//==================================================================================//
		//      Create a new dataoutputstream to write                                      //
		//==================================================================================//
		
		DataOutputStream dataoutput_stream; //create a dataoutstream  variable
		
		try
		{
			dataoutput_stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fhandle)));
			
			dataoutput_stream.writeInt(100);
			dataoutput_stream.writeUTF("Hello");
			dataoutput_stream.writeDouble(12.6788);
			
			dataoutput_stream.writeInt(1000);
			dataoutput_stream.writeUTF("Hello - 1");
			dataoutput_stream.writeDouble(123.6788);
			
			dataoutput_stream.writeInt(10000);
			dataoutput_stream.writeUTF("Hello - 2");
			dataoutput_stream.writeDouble(19023.67088);
			
			dataoutput_stream.writeInt(100002);
			dataoutput_stream.writeUTF("Hello - 3");
			dataoutput_stream.writeDouble(119023.67088);
			
			dataoutput_stream.writeInt(1000023);
			dataoutput_stream.writeUTF("Hello - 4");
			dataoutput_stream.writeDouble(19023.67088);
			
			dataoutput_stream.close();//Close the Stream
			
		} 
		catch ( IOException e)
		{
			
			e.printStackTrace();
		}
		System.out.println("Data Written to File"   );
		System.out.println("File Length :- " + fhandle.length()  + " bytes"   );
		
		//==================================================================================//
	    //         Create a new inputstream to read from javabinaryfile.bin                 //
		//==================================================================================//
        DataInputStream datainput_stream; //create a datainputstream  variable
        boolean EOF = false;
		try
		{
			datainput_stream = new DataInputStream(new BufferedInputStream(new FileInputStream(fhandle)));
						
			while(!EOF)
			{
				System.out.println(datainput_stream.readInt());
				System.out.println(datainput_stream.readUTF());
				System.out.println(datainput_stream.readDouble());
			}
			
			datainput_stream.close();//Close the Stream
			
		}
		catch(EOFException e)
		{
			EOF = true;
			System.out.println("EOFException Occurred");
		}
		catch ( IOException e)
		{
			
			e.printStackTrace();
		}
		//==============================================================================//
		//                         Delete the file                                      //
		//==============================================================================//
		try
		{
			System.out.println("Press Enter key to delete " + fhandle.getName());
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
	}

}
