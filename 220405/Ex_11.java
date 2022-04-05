
public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,4,4,3,1,4,4,2};
		starPrint(a, "@");
		
	}

	static void starPrint(int[] a, String b)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i]; j++)
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
}
