import java.util.Scanner;
public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("원기둥의 부피를 구하시오");
		System.out.println("반지름은?");
		int r = sc.nextInt();
		System.out.println("높이는?");
		int h = sc.nextInt();
		
		float v = vol(r,h);
		System.out.println("부피는 "+v+"입니다.");
	}
	static float vol(int a, int b)
	{
		return 3.14f*(a*a)*b;
	}
}
