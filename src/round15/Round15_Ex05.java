package round15;

class A6 extends Thread
{
	public void run()
	{
		while(true)
		{
			java.util.Date date = new java.util.Date();
			System.out.println("date = "+date.toString());
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
}

class B6 extends Thread
{
	public void run()
	{
		for(int i = 0; i< 1000; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(400);
			}catch(InterruptedException ie){}
		}
	}
}

public class Round15_Ex05 
{
	public static void main(String[] ar)
	{
		System.out.println("Main Start");
		A6 mt = new A6();
		B6 ms = new B6();
		mt.setDaemon(true);
		ms.setDaemon(true);
		mt.start();
		ms.start();
		System.out.println("Main End");
	}
}
