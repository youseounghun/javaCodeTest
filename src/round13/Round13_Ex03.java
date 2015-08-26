package round13;

class UpperClass
{
	int x,y;
	
	// 클래스 생성자1
	public UpperClass()
	{
		x = 10;
		y = 20;
	}
	// 클래스 생성자2
	public UpperClass(int x)
	{
		this();	// Upper Class 생성자 호출
		this.x = x;
	}
	// 클래스 생성자3
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
