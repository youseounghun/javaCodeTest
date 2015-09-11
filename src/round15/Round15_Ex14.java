package round15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Wrapper Ŭ������ �ִ�.�ּҰ��� �̿��Ͽ� 
 * �Է¹��� ���� ����� ���� ������ �ڷ��� ã��
 * @author WIN7
 *
 */
public class Round15_Ex14 
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			
			System.out.print(" �� = ");
			long su = 0;
			
			try
			{
				su = Long.parseLong(in.readLine());
			}
			catch(NumberFormatException nfe)
			{
				MyException me = new MyException("���ڸ� �Է��� �ּ���",nfe);
				me.printStackTrace();
			}
		
			String type = "";
			
			// byte üũ
			if(su >= Byte.MIN_VALUE && su <= Byte.MAX_VALUE)
			{
				type = "byte";
			}
			// short üũ
			else if(su >= Short.MIN_VALUE && su <= Short.MAX_VALUE)
			{
				type = "short";
			}
			// int üũ
			else if( su >= Integer.MIN_VALUE && su <= Integer.MAX_VALUE)
			{
				type = "int";
			}
			else
			{
				type = "long";
			}		
			System.out.println(type+" �� ��� ����");
		}
	}
}
