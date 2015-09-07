package round15;

class A1 implements Runnable
{
	public void run()
	{
		System.out.println("\n Here is MyThread!!");
		for(int i = 0; i < 100; i++)
		{
			for(char ch = 'A'; ch <= 'z'; ch++)
			{
				System.out.print(ch);
			}
		}
	}
}

public class Round15_01 
{
	public static void main(String[] ar)
	{
		System.out.println("Main Thread!!");
		A1 mt = new A1();
		Thread myth = new Thread(mt);
		myth.start();
		
		for(int i=1; i<1000; i++)
		{
			System.out.println(i);
			if(i % 10 == 0) System.out.println();
			else System.out.print("\t");
		}
		
		System.out.print("\n Main Thread Destory");
	}
}
