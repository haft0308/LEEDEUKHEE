import java.util.Scanner;

public class Ex_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//사용자에게 5개의 숫자를 입력받아 배열에 담아서 출력
		
		
		Scanner sc = new Scanner(System.in);
//		
//		int[] user;
//		user = new int[5];
//		for(int i=0; i<5; i++)
//		{
//			System.out.println("수를 입력하세요");
//			user[i] = sc.nextInt();		
//		}
//		
//		System.out.printf("user[5] = {%d,%d,%d,%d,%d}",user[0],user[1],user[2],user[3],user[4]);
		
// 배열의 0번째 인덱스의 배열 값과 1번째 인덱스 배열 값을 바꾸어 저장하라, ex) 4,3,2,1 -> 3,4,2,1 ??
		int[] a= new int[] {4,3,2,1};
		System.out.printf("a[4] = {%d,%d,%d,%d}\n",a[0],a[1],a[2],a[3]);
		a[0]=3;
		a[1]=4;
		System.out.printf("a[4] = {%d,%d,%d,%d}\n",a[0],a[1],a[2],a[3]);
		
//정수 10개를 입력받아 가장 큰 값과 가장 작은 값을 구하시오.
		
//		int[] su;
//		su = new int[10];
//		int big= su[0];
//		
//		for(int i=0; i<10; i++)
//		{
//			System.out.printf("정수를 10번 입력하세요."+(i+1));
//			su[i] = sc.nextInt();			
//				
//			if(su[i]>big)
//			{
//				big=su[i];
//			}	
//		}
//		
//		int s = su[0];
//		for(int i=0; i<10; i++)
//		{
//			if(su[i]<s)
//			{
//				s=su[i];
//			}
//		}
//		System.out.printf("입력한 수 중 가장 큰 수는 : %d",big);
//		System.out.printf(", 가장 작은 수는 : %d",s); 
		
		//5명의 수학 점수를 입력 받아 총점과 평균을 구하라
		
		int[] m = new int[5];
		int hap =0;
		for(int i=0; i<5; i++)
			{
				System.out.printf("점수를 5번 입력하세요."+(i+1));
				m[i] = sc.nextInt();
				hap = hap + m[i];
			}
		System.out.println("총점 : "+hap);
		System.out.println("평균 : "+(hap/5.0));
	
		
	}

}
