
public class Y_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int f=1;
		int[][] e;
		e= new int[5][];
		for(int i=0; i<5; i++)
		{
			e[i]=new int[i+1];
			for(int j=0; j<e[i].length; j++)
			{
				e[i][j]=f++;
				System.out.print(e[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		
		int h = 1;
		int[][] n;
		n= new int[5][];
		for(int i=0; i<5; i++)
		{
			n[i]=new int[5-i];
			for(int j=0; j<n[i].length; j++)
			{
				n[i][j]=h++;
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		
		int w= 1;
		int[][] q;
		q=new int[5][5];
		for(int i=0; i<5; i++)
		{
			
			for(int j=i; j<5; j++)
			{
				q[i][j]=w++;
				System.out.printf("q[%d][%d] = %d\t",i,j,q[i][j]);				
			}
			
			System.out.println();
		}
		
	}

}
