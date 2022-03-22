import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// while 을 이용해 1~10까지 입력 받는 수를 세다가 사용자가 0의 숫자를 입력하면
		//입력받은 수가 몇 번이었는지 보여주고, 루프를 종료하는 프로그램을 작성
		//0
		//0번 입력 받았습니다.
		
		
		
		Scanner sc = new Scanner(System.in);

		int i =0;
		while(true)
		{
			System.out.println("1-10 사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
			
			int a = sc.nextInt();
			i=i+1;
			
			if (a>10 || a<0)
			{
				System.out.println("잘못입력하였습니다.");
				i=i-1; // // 카운트에서 제외하기, 카운트 하려면 삭제
			}
			if (a==0)
			{
				i=i-1; // 0 입력을 카운트에서 제외하기 위해 -1
				break;
			}
			
		}
		System.out.printf("%d번 입력 받았습니다.",i);
	}

}
