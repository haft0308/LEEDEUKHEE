
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		int[][] a;
		a = new int[5][5];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				a[i][j]=k++;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
