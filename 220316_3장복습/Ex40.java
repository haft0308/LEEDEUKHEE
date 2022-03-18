import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수는?");
		int a = sc.nextInt();
		System.out.println("영어 점수는?");
		int b = sc.nextInt();
		System.out.println("수학 점수는?");
		int c = sc.nextInt();
		System.out.println("과학 점수는?");
		int d = sc.nextInt();
		System.out.println("음악 점수는?");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		float avg = (float)sum / 5;
		System.out.printf("합계는 %d 입니다.\n",sum);
		System.out.printf("평균은 %.1f 입니다.",avg);
		
	}

}
