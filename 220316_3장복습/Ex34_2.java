import java.util.Scanner;

public class Ex34_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("점수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(a>=90? "A":(a>=80? "B":(a>=70?"C":(a>60?"D":"F"))));
		
	}

}
