package round13;

class Inherit extends Object
{
	
}

public class Round13_Ex01
{
	public static void main(String[] ar)
	{
		Inherit in = new Inherit();
		System.out.println("�ΰ�ü�� ���� ?"+ in.equals(in));
		System.out.println("in ��ü�� Ŭ���� �̸� ?"+ in.getClass());
		System.out.println("in ��ü�� hashCode�� ?"+ in.hashCode());
		System.out.println("in ��ü�� ǥ���ϴ� �⺻���ڿ��� ?"+ in.toString());
		System.out.println("in ��ü�� ǥ���ϴ� �⺻ ���ڿ� ����� ?"+ in);
	}
}
