import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//정수 10개를 입력받아 가장 큰 값을 구하라
		System.out.println("정수를 10개 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int[] su = new int[10];
		int j = 0;
		
		for(int i=0; i<10; i++)
		{
			System.out.printf("정수 입력 %d : ",i+1);
			su[i] = sc.nextInt();
							
			if (su[i]>j)
			{
				j= su[i];
			}
			else
			{
				continue;
			}
		}
		//가장 큰 값 구하기
		System.out.println(j);
	
		
		
	}

}
