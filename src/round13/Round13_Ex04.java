package round13;

class A
{
	protected int x = 100;
	protected int y = 200;
}

class B extends A
{
	private int r = 300;
	public void disp()
	{
		System.out.println("x=="+super.x);
		System.out.println("y=="+super.y);
		System.out.println("r=="+this.r);
	}
}

public class Round13_Ex04 
{
	public static void main(String[] ar)
	{
		B bp = new B();
		bp.disp();
	}
}
