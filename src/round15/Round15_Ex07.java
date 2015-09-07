package round15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round15_Ex07 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int x=0, y=0, tot=0;
		boolean bool = false;
		
		do
		{
			bool = false;
			System.out.print("x = ");
			try
			{
				x = Integer.parseInt(in.readLine());
			}catch(NumberFormatException e)
			{
				System.out.println("x �� ���ڸ� �Է� �����մϴ�.");
				bool = true;
			}
			
		}while(bool);
		
		do
		{
			bool = false;
			System.out.print("y = ");
			try
			{
				y = Integer.parseInt(in.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("y �� ���ڸ� �Է� �����մϴ�.");
				bool = true;
			}
			
		}while(bool);
		
		try
		{
			tot = x/y;
		}
		catch(ArithmeticException e)
		{
			tot = x;
		}
		
		System.out.println(x+" / "+y+" = "+ tot);
	}
}
