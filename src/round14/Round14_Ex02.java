package round14;

interface A2
{
	void aaa();
	public abstract void bbb();
}

class B2 implements A2
{
	public void aaa()
	{
		System.out.println("aaa �޼���");
	}
	
	public void bbb()
	{
		System.out.println("bbb �޼���");
	}
}

public class Round14_Ex02 
{
	public static void main(String ar)
	{
		B2 bp = new B2();
		bp.aaa();
		bp.bbb();
	}
}
