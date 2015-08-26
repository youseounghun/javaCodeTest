package round12;

public class Round12_Ex05 
{
	public static void main(String[] ar)
	{
		final int x = 100;
		class Inner
		{
			int y = 200;
			public void display()
			{
				System.out.println("x=="+x);
				System.out.println("y=="+y);
			}
		}
		
		Inner in = new Inner();
		in.display();
	}
}
