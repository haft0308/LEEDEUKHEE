
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int j = 1;
		int sum =0;
		
		int[] a;
		a = new int[10];
		for(int i=0; i<10; i++)
		{		
			a[i] = j;
			j=j*10;
			
			sum = sum + a[i];		
		}
		System.out.println(a[9]);
		System.out.println(sum);
		
		//�迭�� 0,1�� ��, �� ū�� �迭�� ÷�� ���
		
		
		
	}

}
