package round10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round10_Ex08 
{
	private int x;
	private int y;
	private BufferedReader in;
	
	public Round10_Ex08()
	{
		in = new BufferedReader(new InputStreamReader(System.in));
		x  = 0;
		y  = 0;
	}
	
	public void setX() throws IOException
	{
		System.out.print("X = ");
		x = Integer.parseInt(in.readLine());
	}
	
	public void setY() throws IOException
	{
		System.out.print("Y = ");
		y = Integer.parseInt(in.readLine());
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	public void display()
	{
		System.out.println();
		System.out.println("Á¡ÀÇÁÂÇ¥ (x,y) = ");
		System.out.println("( "+x+" , "+y+" )");
		System.out.println();
	}
}
