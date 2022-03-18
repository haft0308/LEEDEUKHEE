import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//소문자를 입력받아 대문자로 변환하는 프로그램
	
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자를 입력하세요");
		char value = sc.next().charAt(0);
		int value2 = value -32;
				
		System.out.println((char)value2);
		
		
	}

}
