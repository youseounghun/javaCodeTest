package round7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ڿ��� �Է¹޴� ����޼ҵ� ����
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
		String name = getInputString("�̸�");
		System.out.println(name+" �� �ȳ��ϼ���!");
	}
}
