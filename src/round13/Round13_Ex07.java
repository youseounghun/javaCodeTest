package round13;

class A3
{
	public String toString()
	{
		return "A3 클래스";
	}
}

class B3
{
	public String toString()
	{
		return "B3 클래스";
	}
}

public class Round13_Ex07 
{
	public static void main(String[] ar)
	{
		Object[] obj = new Object[2];
		obj[0] = new A3();
		obj[1] = new B3();
		
		for(int i=0; i<obj.length; i++)
		{
			System.out.println("obj["+i+"] = "+obj[i].toString());
		}
		
		/*
		A3 ap = new A3();
		B3 bp = new B3();
		System.out.println("ap = "+ap.toString());
		System.out.println("bp = "+bp);
		*/
	}
}
