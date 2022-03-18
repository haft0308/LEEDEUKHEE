import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변을 정수로 입력");
		int l = sc.nextInt();
		System.out.println("삼각형의 높이를 정수로 입력");
		int h= sc.nextInt();
		
		float cm2 = ((float)l * (float)h) / 2;
		System.out.printf("삼각형의 넓이는 %.1f 입니다.", cm2);
	}

}
