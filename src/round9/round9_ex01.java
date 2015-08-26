package round9;
import java.io.*;

public class round9_ex01 extends Object implements Serializable 
{
	private int[] sub;
	private float avg;
	
	public round9_ex01()
	{
		sub = new int[4];
		avg = 0.0f;
	}
	
	public void calc()
	{
		int tot = 0;
		for(int i=0; i<sub.length; i++)
		{
			tot += sub[i];
		}
		
		avg = tot/sub.length;
	}
	
	public static class round9_01_Inner
	{
		private String[] subname = {"국어","영어","수학"};
		public String getSubname(int x)
		{
			return subname[x];
		}
	}
}
