package homework;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			method1();
		}
		catch(Exception e)
		{
			System.out.println(5);
		}
		System.out.println(6);
	}

	static void method2()
	{
		throw new NullPointerException();
	}
	static void method1()
	{
		try
		{
			method2();
			System.out.println(1);
		}
		catch(ArithmeticException e)
		{
			System.out.println(2);
		}
		finally
		{
			System.out.println(3);
		}
		System.out.println(4);
	}
}
//3,5,6