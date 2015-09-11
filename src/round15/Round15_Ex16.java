package round15;

import java.io.IOException;

public class Round15_Ex16 
{
	public static void main(String[] arg) throws IOException
	{
		Runtime rt = Runtime.getRuntime();
		
		System.out.print("1.네이버 2.다음");
		
		int x = System.in.read() -48;
		
		System.in.read();
		System.in.read();
		
		String url = "";
		if(x == 1)	url = "http://www.naver.com";
		else if( x == 2) url = "http://wwww.daum.net";
		
		rt.exec("explorer.exe " + url);
			
	}
}
