package round13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyPoint
{
	private int x;
	private int y;
	
	protected static BufferedReader in;
	static
	{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	protected MyPoint() throws IOException
	{
		System.out.print("x=");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("y=");
		this.y = Integer.parseInt(in.readLine());
	}
	
	protected void disp()
	{
		System.out.println();
		System.out.println("점(x,y) =  ("+this.x+","+this.y+")");
	}
}

class Circle extends MyPoint
{
	private int r;
	public Circle() throws IOException
	{
		super();
		System.out.print("r=");
		this.r = Integer.parseInt(in.readLine());
	}
	
	public void disp()
	{
		super.disp();
		System.out.println("반지름 r="+this.r);
	}
}


public class Round13_Ex05 
{
	public static void main(String[] ar) throws IOException
	{
		Circle cc = new Circle();
		cc.disp();
	}
}
