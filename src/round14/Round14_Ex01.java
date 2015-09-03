package round14;

interface A1
{
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
}

public class Round14_Ex01 
{
	public static void main(String[] ar)
	{
		System.out.println("w = "+A1.w);
		System.out.println("x = "+A1.x);
		System.out.println("y = "+A1.y);
		System.out.println("z = "+A1.z);
	}
}
