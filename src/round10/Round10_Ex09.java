package round10;

import java.io.IOException;

public class Round10_Ex09 
{
	public static void main(String[] arg) throws IOException
	{
		System.out.println("��ǥ �� ó��");
		Round10_Ex08 rd = new Round10_Ex08();
		rd.setX();
		rd.setY();
		rd.display();
		
		System.out.println("��ǥ�� 50,100 ���� �̵� �մϴ�.");
		
		rd.setX(50);
		rd.setY(100);
		rd.display();
	}
}
