package round8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class round8_ex04 
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String [] subname = {"±¹¾î","¿µ¾î","¼öÇÐ"};
		int[] sub = new int[subname.length + 1];
		
		for(int i=0; i < subname.length; i++)
		{
			do
			{
				System.out.print(subname[i]+" = ");
				sub[i] = Integer.parseInt(in.readLine());
			}
			while(sub[i] < 0 || sub[i] > 100);
			
			sub[subname.length -1] += sub[i];
		}
		
		//Æò±Õ
		float avg = (float)(sub[subname.length -1] / (subname.length - 1));
		
		System.out.println();
		System.out.println("ÃÑÁ¡ = "+sub[subname.length-1]);
		System.out.println("Æò±Õ = "+avg);
	}
}
