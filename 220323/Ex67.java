
public class Ex67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While문 사용 1에서 100까지 합을 구하기
		int sum = 0;
		int a=1;
		
		while(a<=100)
		{
			sum = sum + a;
			a++;
		}
		System.out.println(sum);
		
		// 1~100까지 제곱의 합 구하기
		
		int hap =0;
		for (int i=0; i<=100; i++)
		{
			int j= 0;
			j = i*i;
			hap = hap + j;
		}
		System.out.println(hap);
		
		
		//1에서 100까지 합을 구하는 과정에서 합이 100이 넘을 때의 최소 정수값과 그때까지의 합을 구하는 프로그램
		
		
		
	}

}
