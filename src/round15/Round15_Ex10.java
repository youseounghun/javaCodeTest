package round15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round15_Ex10 
{
	private static BufferedReader in;
	
	static
	{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] arg) throws IOException
	{
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0, flag = 0;
		
		while(true)
		{
			// ���� 1 �Է�
			do {
				flag = 0;
				try {
					System.out.print("SU1 = ");
					su1 = Integer.parseInt(in.readLine());
				} catch (NumberFormatException nfe) {
					MyException me = new MyException("���ڸ��Է°���", nfe);
					me.printStackTrace();
					flag = 1;
				}
			} while (flag != 0);
			
			// ��ȣ�Է�
			do{
				
				do {
					flag = 0;
					String str = "";
					try {
						// ������ �Է�
						System.out.print("YON(+,-,*,/) = ");
						str = in.readLine();
						yon = str.charAt(0);
					} catch (StringIndexOutOfBoundsException siooe) {
						// �Էµ� ���� �������� ���� ���
						MyException me = new MyException("�Էµ� ���� �������� ����", siooe);
						me.printStackTrace();
						flag = 1;
					}
					
					// �Էµ� ���� �ڸ��� üũ
					if(str.length() != 1)
					{
						// �Էµ� ���� �������� ���� ���
						MyException me = new MyException("�������� �ڸ����� 1�ڸ� �Դϴ�.");
						me.printStackTrace();
						flag = 1;
					}
				} while (flag != 0);
				
				// ���� 2 �Է�
				do {
					flag = 0;
					try {
						System.out.print("SU2 = ");
						su2 = Integer.parseInt(in.readLine());
					} catch (NumberFormatException nfe) {
						MyException me = new MyException("���ڸ��Է°���", nfe);
						me.printStackTrace();
						flag = 1;
					}
				} while (flag != 0);
				
				// �Էµ� �� ����
				flag = 0;
				
				try {
					switch(yon) {
						case '+' : tot = su1+su2; break;
						case '-' : tot = su1-su2; break;
						case '*' : tot = su1*su2; break;
						case '/' : tot = su1/su2; break;					
					}
				} catch (ArithmeticException ae) {
					MyException me = new MyException("0���� ������ �����ϴ�.", ae);
					me.printStackTrace();
					
					flag =1;
				}
				
			} while (flag != 0);
			
			// ���� �� ���
			System.out.println(su1+" "+yon+" "+su2+" = "+tot);
		}
	}
}
