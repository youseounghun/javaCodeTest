package round15;

import java.util.Properties;

public class Round15_Ex13 
{
	public static void main(String[] arg)
	{
		Boolean bool  = Boolean.FALSE;
		Boolean bool1 = Boolean.TRUE;
		
		Boolean bool2 = new Boolean(true);
		Boolean bool3 = new Boolean("false");
		
		boolean a = bool2.booleanValue();
		System.out.println("a = "+a); // true
		
		boolean b = bool2.equals(bool3);
		System.out.println("b = "+b); // false
		
		System.out.println("bool = "+bool);	// false
		System.out.println("bool = "+bool.toString()); // false
		
		Boolean e = Boolean.valueOf(b);	// false
		Boolean f = Boolean.valueOf("true"); // true
		
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		
		boolean bbb = false;
		
		Boolean bo = new Boolean(bbb);
		int i = new Boolean(bbb).hashCode();
		int j = Boolean.valueOf(bbb).hashCode();
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		
		Properties prop = System.getProperties();
		prop.put("class", "true");
		System.setProperties(prop);
		boolean bb = Boolean.getBoolean("class");
		System.out.println(bb);
	}
}
