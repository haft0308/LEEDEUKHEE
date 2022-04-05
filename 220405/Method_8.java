
public class Method_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] student= {"박진수","장원우","강한솔","최진욱"};
		
		print(student);
		
		printJang(student,"조장");
		printJang(student,"짱!");
	}

	static void print(String[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	
	static void printJang(String[] a, String b)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" "+ b+"\n");
		}
	}
}
