/**
 * Simple Thread,extends the thread class
 * @author Rahul
 */
package _9_Java_Threads;

public class _1_Simple_Thread
{
		public static void main(String[] args)
		{
				Thread Th1 = new MyThread1();
				Thread Th2 = new MyThread2();
				
				Th1.start();
				System.out.println("MyThread1 Started");
				
				Th2.start();
				System.out.println("MyThread2 Started");
				
				System.out.println("\n");
				

		}//end of  main()
}//end of  class _1_Simple_Thread


//Thread 1 Class
class MyThread1 extends Thread
{
		public void run() //run method 
		{
			for(int t=0 ;t<5;t++)
			{
				System.out.println("Hello from MyThread1");
				
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
}//end of class Mythread1



//Thread 1 Class
class MyThread2 extends Thread
{
		public void run() //run method 
		{
			for(int t=0 ;t<5;t++)
			{
				System.out.println("Ola from MyThread2");
				
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
}//end of class Mythread2

