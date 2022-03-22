
public class Gugu_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("구구단");
		for (int i=2; i<10; i++)
		{
			for (int j=1; j<10; j++)
			{
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.println("구구단");
		for (int i=1; i<10; i++)
		{
			for (int j=2; j<10; j++)
			{
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
