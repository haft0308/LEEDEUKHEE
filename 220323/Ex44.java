
public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a = {1,2,3,4,5};
//		int[] b = {1,4,7,10,13};
//		int[] c = {1,3,5,7,9};
//		int[] d = {2,4,6,8,10}; //������ �̷��� ���ϴ°� �ƴѰ� ������...
		

		int i = 0;
		
		int[]a = new int[5];
		for(i=0; i<5; i++)
		{
			a[i] = i+1;
		}
		
		
		int m=1;
		int[]b = new int[5];
		for(i=0; i<5; i++)
		{			
			b[i]=m;
			m=m+3;
		}
		System.out.println(b[3]);
		
		
		int n =1;
		int[] c = new int[5];
		for(i=0; i<5; i++)
		{
			c[i] = n;
			n=n+2;
		}
		System.out.println(c[3]);
		
		
		int s = 2;
		int[] d = new int[5];
		for (i=0; i<5; i++) //if (d[i]%2==0) ���� �ص� ������ �̰� �� ����� ���Ƽ�,,,
		{
			d[i] = s;
			s = s+2;
		}
		System.out.println(d[3]);
	}

}
