
public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2,680원 거스름돈
		//500원 동전의 갯수는 5
		
		int a = 2680;
		int[] b = new int[]{500,100,50,10};
		int[] d = new int[5];
		d[0] = 2680;
		for(int i=0; i<4; i++)
		{		
			int c = d[i]/b[i];
			d[i+1] = a%b[i];
			System.out.printf("%d 동전의 갯수는 %d\n",b[i],c);
		}
		
	}

}
