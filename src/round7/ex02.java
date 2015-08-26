package round7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 
{
	public static void aaa() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번재수 : ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("두번재수 : ");
		int b = Integer.parseInt(in.readLine());
		
		if(a > b)
		{
			System.out.println("둘중 최대수는 "+a+"입니다.");
		}
		else
		{
			System.out.println("둘중 최대수는 "+b+"입니다.");
		}
	}
	
	public static void bbb() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째수 : ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("두번째수 : ");
		int b = Integer.parseInt(in.readLine());
		
		int tot = 0;
		// a가 b보다 클경우
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
		
		System.out.println(a + " ~ " + b+"사이의 합"+tot);
	}

	public static void main(String[] arg) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0;
		while(true)
		{
			System.out.println("1:최대수 2:사이합 3:종료 ==>");
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
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
}
