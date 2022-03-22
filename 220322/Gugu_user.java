import java.util.Scanner;

public class Gugu_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("몇단을 출력할까요?");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		
		for (int i=1; i<10; i++)
		{
			System.out.printf("%d*%d=%d\n",j,i,j*i);
		}
		
	}

}
