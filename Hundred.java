package test2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
		int a = (int)(Math.random()*100);
		System.out.println(a);
		
		System.out.println("1-100사이의 숫자를 입력하시오");
		
		int x=0;

		while(a != x) 
		{
			try
			{				
				x = sc.nextInt();		
				if(x==a)
				{
					System.out.println("정답입니다.");
					break;
				}
				if(x<a)
				{
					System.out.println("더 큰 수를 입력하세요.");
				}
				else
				{
					System.out.println("더 작은 수를 입력하세요.");
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("숫자만 입력하세요."); // 한번만 나오게 하려면?? 와일문 밖으로 try catch를 뺄수있나
				Scanner sc2 = new Scanner(System.in); //왜 스캐너를 새로 만들어야하나?
				x = sc2.nextInt();
				if(x==a)
				{
					System.out.println("정답입니다.");
					break;
				}
				if(x<a)
				{
					System.out.println("더 큰 수를 입력하세요.");
				}
				else
				{
					System.out.println("더 작은 수를 입력하세요.");
				}
			}
		}		
	}
}

