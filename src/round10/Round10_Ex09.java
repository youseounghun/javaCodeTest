package round10;

import java.io.IOException;

public class Round10_Ex09 
{
	public static void main(String[] arg) throws IOException
	{
		System.out.println("좌표 값 처리");
		Round10_Ex08 rd = new Round10_Ex08();
		rd.setX();
		rd.setY();
		rd.display();
		
		System.out.println("좌표를 50,100 으로 이동 합니다.");
		
		rd.setX(50);
		rd.setY(100);
		rd.display();
	}
}
