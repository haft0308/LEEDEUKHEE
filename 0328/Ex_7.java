import java.util.Scanner;
public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 10개 저장 (1-10까지 랜덤 수), 검색할 숫자를 입력하여 찾는 프로그램 (LinearSearch)

		int[] a = new int[10];
		for(int i=0; i<10; i++)
		{			
			a[i] = (int)((Math.random()*10000)%10); //10까지가 안되네 9까지 *10하면 0부터 나오고...
			System.out.println(a[i]);
		}
		System.out.println("검색할 값(1~10)을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		for(int i=0; i<10; i++)
		{
			if(f==a[i])
			{
				System.out.printf("인덱스 %d 에서 검색\n",i);
			}
		}
	}

}


//import java.util.Random;
//Random a= new Random(); <-- 객체 생성한 후
//a.nextInt(10); <--10미만의 정수 랜덤