package round15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round15_Ex08 
{
	public static int aaa()
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int age = 0;
		try
		{
			System.out.print("나이 = ");
			age = Integer.parseInt(in.readLine());
			return age;
		}
		catch(NumberFormatException nfe)
		{
			nfe.printStackTrace();
			//System.out.println("error == "+nfe.getMessage());
			return age;
		}
		catch(IOException ie)
		{
			return age;
		}
		finally
		{
			System.out.println("나이 : "+age);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Start");
		aaa();
		System.out.println("Main End");
	}
}
