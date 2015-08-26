package round12;

class Outer2
{
	private static int x = 100;
	
	static class Inner2
	{
		private int y = 200;
		public void display()
		{
			System.out.println("x=="+x);
			System.out.println("y=="+y);
		}
	}
}

public class Round12_Ex03 
{
	public static void main(String[] ar)
	{
		Outer2.Inner2 in = new Outer2.Inner2();
		in.display();
	}
}
