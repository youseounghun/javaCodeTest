package round7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ư�� ���� �Է¹޴� ����޼ҵ�
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
		int grad = getInputNumber("���� ����");
		System.out.println("���� ������ "+grad+" �Դϴ�.");
	}
}
