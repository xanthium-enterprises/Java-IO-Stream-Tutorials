/**
 * Threading using Runnable interface
 * 
 */

package _9_Java_Threads;

import java.util.ArrayList;

public class _2_Simple_Thread_Runnable_Interface
	{

		public static void main(String[] args)
			{
//				MyThread1_RunnableInterface R1 = new MyThread1_RunnableInterface(1,"Hello from Thread");
//				Thread t1 = new Thread(R1);
//				t1.start();
				
				Thread t1 = new Thread(new MyThread1_RunnableInterface(1,"Hello from Thread1"));
				Thread t2 = new Thread(new MyThread1_RunnableInterface(2,"Hello from Thread2"));
				Thread t3 = new Thread(new MyThread1_RunnableInterface(3,"Hello from Thread3"));
				
                t1.start();
                t2.start();
                t3.start();
				
				
			
			}//end of main()

	}//end of class _2_Simple_Thread_Runnable_Interface



//MyThread1
class MyThread1_RunnableInterface implements Runnable
{
		private int variable;
		private String message;
		
		MyThread1_RunnableInterface(int i,String message ) //Constructor
		{
				variable = i;
				this.message = message;
		}
		
		public void run() //implements the run() method from Runnable
		{
				for(int t=0 ;t<5;t++)
				{
					System.out.println("Hello from MyThread1 - i = " + variable + ",  Message - " + message);
					
					try
						{
							Thread.sleep(2000);
						}
					catch(InterruptedException e)
						{
							System.out.println("MyThread1: InterruptedException Occured");
						}
				}//end of for loop
				System.out.println("MyThread1:End of run() method ");	
			}//end of run() method 
		
}//end of class MyThread1_RunnableInterface


//MyThread2
class MyThread2_RunnableInterface implements Runnable
{
		private int variable;
		private String message;
		
		MyThread2_RunnableInterface(int i,String message ) //Constructor
		{
				variable = i;
				this.message = message;
		}
		
		public void run() //implements the run() method from Runnable
		{
				for(int t=0 ;t<5;t++)
				{
					System.out.println("Hello from MyThread2 - i = " + variable + ",  Message - " + message);
					
					try
						{
							Thread.sleep(2000);
						}
					catch(InterruptedException e)
						{
							System.out.println("MyThread2: InterruptedException Occured");
						}
				}//end of for loop
				System.out.println("MyThread2:End of run() method ");	
			}//end of run() method 
		
}//end of class MyThread2_RunnableInterface



//MyThread3
class MyThread3_RunnableInterface implements Runnable
{
		private int variable;
		private String message;
		
		MyThread3_RunnableInterface(int i,String message ) //Constructor
		{
				variable = i;
				this.message = message;
		}
		
		public void run() //implements the run() method from Runnable
		{
				for(int t=0 ;t<5;t++)
				{
					System.out.println("Hello from MyThread3 - i = " + variable + ",  Message - " + message);
					
					try
						{
							Thread.sleep(2000);
						}
					catch(InterruptedException e)
						{
							System.out.println("MyThread3: InterruptedException Occured");
						}
				}//end of for loop
				System.out.println("MyThread3:End of run() method ");	
			}//end of run() method 
		
}//end of class MyThread2_RunnableInterface


