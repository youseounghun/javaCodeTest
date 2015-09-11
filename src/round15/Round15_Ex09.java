package round15;

import java.io.PrintStream;
import java.io.PrintWriter;

class MyException extends Exception
{
	private String message;
	private Throwable cause;
	
	public MyException()
	{
		super();
	}
	
	public MyException(String msg)
	{
		super(msg);
		message = msg;
	}
	
	public MyException(Throwable cause)
	{
		super(cause);
		this.cause = cause;
	}
	
	public MyException(String msg, Throwable cause)
	{
		super(msg, cause);
		message = msg;
		this.cause = cause;
	}
	
	public void setCause(Throwable cause)
	{
		this.cause = cause;
	}
	
	public Throwable getCause()
	{
		return cause;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void printStackTrace()
	{
		System.out.println();
		System.out.println(">>>  Error 발생");
		System.out.println(">>>  에러사유    = "+message);
		System.out.println(">>>  관련 클래스 = "+cause);
		System.out.println(">>>  메시지      = "+cause.getMessage());
		System.out.println();
		//super.printStackTrace(System.out);
	}
	
	public void printStackTrace(PrintStream out)
	{
		super.printStackTrace(out);
	}
	
	public void printStackTrace(PrintWriter out)
	{
		super.printStackTrace(out);
	}
}

public class Round15_Ex09 
{
	public static void main(String[] arg)
	{
		int x = 100;
		int y = 0;
		int tot = 0;
		
		try{
			tot = x/y;
		}catch(ArithmeticException ae){
			MyException me = new MyException("나눗셈",ae);
			me.printStackTrace();
		}
		
		System.out.println("tot = "+tot);
	}
}
