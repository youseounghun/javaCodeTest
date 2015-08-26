package round8;

public class round8_ex02 
{
	
	public static void main(String[] arg)
	{
		if(arg.length != 1)
		{
			System.out.println("Useage : java round8_02 number");
			System.exit(1);
		}
		
		int x = Integer.parseInt(arg[0]);
		System.out.println("입력된 수 : "+x);
	}

}
