package round11;

public class Round11_Ex01 
{
	private int x;
	private int y;
	
	public Round11_Ex01()
	{
		x = 0;
		y = 0;
	}
	
	public Round11_Ex01(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public void disp()
	{
		System.out.println("x = "+x+" y = "+y);
	}
	
	public static void main(String[] arg)
	{
		Round11_Ex01 rd = new Round11_Ex01(100,200);
		Round11_Ex01 rd1 = new Round11_Ex01(50,60);
		rd.disp();
		rd1.disp();
	}
}
