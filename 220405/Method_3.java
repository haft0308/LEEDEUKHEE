
public class Method_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//반복되는 부분을 함수로 정리
		int[] star = new int[10];
		star_print(star);
				
		for(int i=0; i<10; i++)
		{
			star[i] = i+1;
		}
		star_print(star);
		
		for(int i=0; i<10; i++)
		{
			star[i] = star[i]+1;
		}		
		star_print(star);
	}

	static void star_print(int[] a)
	{
		System.out.println("---------------------------");
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	

}
