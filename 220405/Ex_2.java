
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a = new int[2][4];
		int[][] b = new int[2][4];
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<4; j++)
			{
				a[i][j] =(int)(Math.random()*10);
				b[i][j] =(int)(Math.random()*10);
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		
		int[][] hap = sum(a, b);
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<4; i++)
			{
				System.out.print(hap[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
	}
	
	static int[][] sum(int[][] a, int[][] b)
	{
		int[][] sum = new int[2][4];
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<4; j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

}
