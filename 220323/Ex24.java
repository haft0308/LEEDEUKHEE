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
					
			//가장 큰 값 구하기
			if (su[i]>j)
			{
				j= su[i];
			}
			else
			{
				continue;
			}
		}
		
		System.out.println(j);
	
		
		//5명의 수학점수를 입력받아 총점과 평균을 구하라
		
		int hap=0;
		int[] st = new int[5];
		for(int k =0; k<5; k++)
		{
			System.out.printf("수학점수 입력 %d : ",k+1);
			st[k] = sc.nextInt();
						
			hap = hap + st[k];
		}
		float avg =0;
		avg = (int)hap /5;
		
		System.out.printf("총점 : %d",hap);
		System.out.printf("평균 : %.1f",avg);
		
		
		//1-10까지 저장된 배열 10개를 저장해두고, 검색할 숫자를 입력하여 찾아라
		
		int[] bae = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		
		if (a<0||a>10)
		{
			System.out.println("잘못입력하였습니다.");
		
		}
		else
		{
			for (int c = 0; c<10; c++)
			{
				if (a==bae[c])
				{
					System.out.printf("찾았다, %d",a);
				}

				else
				{
					continue;
				}
			}
		}
		
		
	}

}
