package round7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 
{
	public static void aaa() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù����� : ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("�ι���� : ");
		int b = Integer.parseInt(in.readLine());
		
		if(a > b)
		{
			System.out.println("���� �ִ���� "+a+"�Դϴ�.");
		}
		else
		{
			System.out.println("���� �ִ���� "+b+"�Դϴ�.");
		}
	}
	
	public static void bbb() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��°�� : ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("�ι�°�� : ");
		int b = Integer.parseInt(in.readLine());
		
		int tot = 0;
		// a�� b���� Ŭ���
		if(a > b)
		{
			int mis = a;
			a = b;
			b = mis;
		}
		
		for(int i = a; i <= b; i++)
		{
			tot +=i;
		}
		
		System.out.println(a + " ~ " + b+"������ ��"+tot);
	}

	public static void main(String[] arg) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0;
		while(true)
		{
			System.out.println("1:�ִ�� 2:������ 3:���� ==>");
			x = Integer.parseInt(in.readLine());
			
			switch(x) 
			{
			case 1:
				aaa();
				break;
			case 2:
				bbb();
				break;
			case 3:
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
	
}
