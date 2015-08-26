package round10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round10_Ex06 
{
	private BufferedReader in;
	private String name;
	private int[] jumin;
	private boolean right;
	
	public Round10_Ex06()
	{
		in   = new BufferedReader(new InputStreamReader(System.in));
		name  = "";
		jumin = new int[14];
		right = false;
	}
	
	public void setName() throws IOException
	{
		System.out.print("�̸� = ");
		name = in.readLine();
	}
	
	public void setJumin() throws IOException
	{
		do
		{
			right = false;
			System.out.print("�ֹι�ȣ = ");
			
			for(int i=0; i<jumin.length; i++)
			{
				jumin[i] = System.in.read() - 48;
			}
			System.in.read();
			System.in.read();
			
			if(jumin[2]*10 + jumin[3] > 12)
			{
				System.out.println("�¾ ���� 12������ Ů�ϴ�.");
				continue;
			}
			else if(jumin[4]*10 + jumin[5] > 31)
			{
				System.out.println("�¾ ���� 31�� ���� Ů�ϴ�.");
				continue;
			}
			else if(jumin[7] != 9 && jumin[7] != 0 && jumin[7] != 1 && jumin[7] != 2 && jumin[7] != 3 && jumin[7] != 4)
			{
				System.out.println("������ ��Ÿ���� ���ڰ� Ʋ���ϴ�.");
				continue;
			}
			
			int hap = 0, cre = 2;
			float temp = 0.0f, temp1 = 0.0f;
			for(int i=0; i<jumin.length -1; i++)
			{
				if(i == 6)
				{
					continue;
				}
				hap += jumin[i] * cre;
				cre++;
				if(cre == 10)
				{
					cre = 2;
				}
			}
			
			temp   = (int)(hap/11.0f)*11.0f+11.0f-hap;
			temp1  = temp - (int)(temp/10.0f)*10.0f;
			
			if(temp1 != jumin[13])
			{
				System.out.println("�ֹι�ȣ ���� ���� Ʋ���ϴ�.");
				continue;
			}
			right = true;
		}while(!right);
	}
	
	public void display()
	{
		
	}
}
