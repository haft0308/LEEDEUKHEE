
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a = random();
		int[][] b = random();
		
		rPrint(a);
		rPrint(b);
		
		rPrint(sum(a,b));
		rPrint(mul(a,b));		
				
	}
	
	static int[][] random()
	{
		int[][] a = new int[2][4];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j] =(int)(Math.random()*10);
			}			
		}
		return a;
	}
	
	static void rPrint(int[][] a)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
	}
	
	static int[][] sum(int[][] a, int[][] b)
	{
		int[][] sum = new int[2][4];
		for(int i=0; i<sum.length; i++)
		{
			for(int j=0; j<sum[i].length; j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}
	
	static int[][] mul(int[][] a, int[][] b)
	{
		int[][] mul = new int[2][4];
		for(int i=0; i<mul.length; i++)
		{
			for(int j=0; j<mul[i].length; j++)
			{
				mul[i][j] = a[i][j] * b[i][j];
			}
		}
		return mul;
	}

}
