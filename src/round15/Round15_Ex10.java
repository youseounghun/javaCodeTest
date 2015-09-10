package round15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round15_Ex10 
{
	private static BufferedReader in;
	
	static
	{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] arg) throws IOException
	{
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0, flag = 0;
		
		while(true)
		{
			do
			{
				flag = 0;
				try
				{
					System.out.print("SU1 = ");
					su1 = Integer.parseInt(in.readLine());
				}
				catch(NumberFormatException nfe)
				{
					
				}
			}
			while(flag != 0);
		}
	}

}
