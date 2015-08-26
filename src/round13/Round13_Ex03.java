package round13;

class UpperClass
{
	int x,y;
	
	// Ŭ���� ������1
	public UpperClass()
	{
		x = 10;
		y = 20;
	}
	// Ŭ���� ������2
	public UpperClass(int x)
	{
		this();	// Upper Class ������ ȣ��
		this.x = x;
	}
	// Ŭ���� ������3
	public UpperClass(int x, int y)
	{
		this(x);
		this.y = y;
	}
}

class LowerClass extends UpperClass
{
	int r;
	public LowerClass()
	{
		super();
		r = 30;
	}
	public LowerClass(int x)
	{
		super(x);
		r = 30;
	}
	public LowerClass(int x, int y)
	{
		super(x,y);
		r = 30;
	}
	public LowerClass(int x, int y, int r)
	{
		this(x,y);
		this.r = r;
	}
}


public class Round13_Ex03 
{
	public static void main(String[] ar)
	{
		LowerClass lc = new LowerClass();
		System.out.println("x=="+lc.x+" y=="+lc.y+" r=="+lc.r);
	}
}
