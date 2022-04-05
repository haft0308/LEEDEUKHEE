
public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//합과 곱을 구하는 메소드(함수)정의, 활용 프로그램 작성, 배열의 내용을 출력하는 함수
		
		int[] a = {3,4};
		int[] b = {5,6};
				
		int[] hap = sum(a,b);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(hap[i]+"\t");
		}
		System.out.println();
				
		int[] gob = multiply(a,b);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(gob[i]+"\t");
		}
		System.out.println();				
	}
	
	static int[] sum(int[] a, int[] b)
	{
		int[] sum = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			sum[i]=a[i]+b[i];
		}
		return sum;
	}
	
	static int[] multiply(int[] a, int[] b)
	{
		int[] multiply = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			multiply[i]=a[i]*b[i];
		}
		return multiply;
	}

}
