package round8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class round8_ex05 
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"����","����","����"};
		int [][] sub     = new int[3][subname.length+1];
		float[] avg      = new float[3];
		
		for(int a=0; a < sub.length; a++)
		{
			System.out.println( a+1 +" ��° �л�");
			for(int b=0; b < subname.length; b++)
			{
				do
				{
					System.out.print(subname[b]+" ���� = ");
					sub[a][b] = Integer.parseInt(in.readLine());
				}
				while(sub[a][b] < 0 || sub[a][b] > 100);
				
				sub[a][subname.length] += sub[a][b]; 
			}
			avg[a] = (float)(sub[a][subname.length] / subname.length);
		}
		
		for(int i=0; i < sub.length; i++)
		{
			System.out.println();
			System.out.println(i+1 + "��° �л��� ������ = "+sub[i][subname.length]);
			System.out.println(i+1 + "��° �л��� ������� = "+avg[i]);
		}
	}
}
