package round15;

import java.io.IOException;

public class Round15_Ex06 
{
	public static void main(String[] ar)
	{
		try
		{
			System.out.println("x = ");
			int x = System.in.read() - 48;
			System.out.println("x = "+x);
		}catch(IOException io)
		{
			System.out.println("Ű���� �Է� ����");
			System.exit(0);
		}
	}
}
