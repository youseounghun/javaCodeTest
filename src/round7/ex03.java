package round7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열을 입력받는 범용메소드 예시
 * @author WIN7
 *
 */
public class ex03 
{
	public static String getInputString(String strName) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(strName+" = ");
		String imsi = in.readLine();
		return imsi;
	}
	
	public static void main(String[] arg) throws IOException
	{
		String name = getInputString("이름");
		System.out.println(name+" 님 안녕하세요!");
	}
}
