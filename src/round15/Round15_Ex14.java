package round15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Wrapper 클래스의 최대.최소값을 이용하여 
 * 입력받은 값이 저장될 가장 적절한 자료형 찾기
 * @author WIN7
 *
 */
public class Round15_Ex14 
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			
			System.out.print(" 수 = ");
			long su = 0;
			
			try
			{
				su = Long.parseLong(in.readLine());
			}
			catch(NumberFormatException nfe)
			{
				MyException me = new MyException("숫자만 입력해 주세요",nfe);
				me.printStackTrace();
			}
		
			String type = "";
			
			// byte 체크
			if(su >= Byte.MIN_VALUE && su <= Byte.MAX_VALUE)
			{
				type = "byte";
			}
			// short 체크
			else if(su >= Short.MIN_VALUE && su <= Short.MAX_VALUE)
			{
				type = "short";
			}
			// int 체크
			else if( su >= Integer.MIN_VALUE && su <= Integer.MAX_VALUE)
			{
				type = "int";
			}
			else
			{
				type = "long";
			}		
			System.out.println(type+" 에 담기 적당");
		}
	}
}
