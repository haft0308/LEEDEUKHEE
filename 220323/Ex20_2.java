import java.util.Scanner;

public class Ex20_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 5번 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int[] user;
		user = new int[5];
		
		for (int i =0; i<5; i++)
		{
			int num = sc.nextInt();
			user[i]= num;						
		}		
		System.out.printf("user[%d,%d,%d,%d,%d]",user[0],user[1],user[2],user[3],user[4]);
	}

}
