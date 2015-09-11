package round15;

import java.lang.reflect.Field;

public class Round15_Ex15 
{
	public static void main(String[] arg) throws ClassNotFoundException
	{
		Class cls = Class.forName("java.lang.Boolean");
		//Class cls = Class.forName("round14.Round14_Ex01");
		
		System.out.println(cls);
		
		Field[] fld = cls.getFields();
		
		for(int i=0; i < fld.length; i++)
		{
			System.out.println(i+" : "+fld[i].getName());
		}
		
	}
}
