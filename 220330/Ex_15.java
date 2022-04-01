import java.util.Scanner;
public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//eauals()를 활용한 단어 맞추기 게임
		
		Scanner sc = new Scanner(System.in);
		
		String chair = "의자";
		String computer ="컴퓨터";
		String integer = "정수";
				
		System.out.println("Q1. chair의 뜻은?");
		String a = sc.next();
		
		if(a.equals(chair))
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다. 정답은 의자입니다.");
		}
		
		System.out.println("Q2. mtopecur의 뜻은?");
		String b= sc.next();
		
		if(b.equals(computer))
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다. 정답은 컴퓨터입니다.");
		}
		
		System.out.println("Q3. integer의 뜻은?");
		String c= sc.next();
		
		if(c.equals(integer))
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다. 정답은 정수입니다.");
		}
	}

}
