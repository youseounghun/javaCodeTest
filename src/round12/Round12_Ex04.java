package round12;

public class Round12_Ex04 
{
	public static void main(String[] ar)
	{
		int x = 100;
		
		class Inner
		{
			int y = 200;
		}
		Inner in = new Inner();
		System.out.println(x);
		System.out.println(in.y);
	}
}
