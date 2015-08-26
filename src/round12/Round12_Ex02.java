package round12;


class OuterType
{
	private int x = 100;
	public void display()
	{
		System.out.println("x=="+x);
		OuterType.Inner in = this.new Inner();
		System.out.println("y=="+in.y);
	}
	
	class Inner
	{
		private int y = 200;
	}
}

public class Round12_Ex02 
{
	public static void main(String[] ar)
	{
		OuterType ot = new OuterType();
		ot.display();
	}
}
