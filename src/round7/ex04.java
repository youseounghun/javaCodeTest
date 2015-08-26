package round7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 특정 수를 입력받는 범용메소드
 * @author WIN7
 *
 */
public class ex04
{
	public static int getInputNumber(String strMsg) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(strMsg+" = ");
		int grad = Integer.parseInt(in.readLine());
		return grad;
	}

	public static void main(String[] arg) throws IOException
	{
		int grad = getInputNumber("국어 점수");
		System.out.println("국어 점수는 "+grad+" 입니다.");
	}
}
