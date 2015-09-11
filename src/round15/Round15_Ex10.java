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
			// 숫자 1 입력
			do {
				flag = 0;
				try {
					System.out.print("SU1 = ");
					su1 = Integer.parseInt(in.readLine());
				} catch (NumberFormatException nfe) {
					MyException me = new MyException("숫자만입력가능", nfe);
					me.printStackTrace();
					flag = 1;
				}
			} while (flag != 0);
			
			// 기호입력
			do{
				
				do {
					flag = 0;
					String str = "";
					try {
						// 연산자 입력
						System.out.print("YON(+,-,*,/) = ");
						str = in.readLine();
						yon = str.charAt(0);
					} catch (StringIndexOutOfBoundsException siooe) {
						// 입력된 값이 존재하지 않을 경우
						MyException me = new MyException("입력된 값이 존재하지 않음", siooe);
						me.printStackTrace();
						flag = 1;
					}
					
					// 입력된 값의 자릿수 체크
					if(str.length() != 1)
					{
						// 입력된 값이 존재하지 않을 경우
						MyException me = new MyException("연산자의 자릿수는 1자리 입니다.");
						me.printStackTrace();
						flag = 1;
					}
				} while (flag != 0);
				
				// 숫자 2 입력
				do {
					flag = 0;
					try {
						System.out.print("SU2 = ");
						su2 = Integer.parseInt(in.readLine());
					} catch (NumberFormatException nfe) {
						MyException me = new MyException("숫자만입력가능", nfe);
						me.printStackTrace();
						flag = 1;
					}
				} while (flag != 0);
				
				// 입력된 값 연산
				flag = 0;
				
				try {
					switch(yon) {
						case '+' : tot = su1+su2; break;
						case '-' : tot = su1-su2; break;
						case '*' : tot = su1*su2; break;
						case '/' : tot = su1/su2; break;					
					}
				} catch (ArithmeticException ae) {
					MyException me = new MyException("0으로 나눌수 없습니다.", ae);
					me.printStackTrace();
					
					flag =1;
				}
				
			} while (flag != 0);
			
			// 계산된 값 출력
			System.out.println(su1+" "+yon+" "+su2+" = "+tot);
		}
	}
}
