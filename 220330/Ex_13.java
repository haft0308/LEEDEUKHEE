import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		���ĺ��� ���ڸ� ��ȣǥ�� ��ȣȭ �ϴ� ���α׷�
//		(*charAt()Ȱ�� sc.next()Ȱ��)
		
		String str1 = new String();
		str1="abcdefghijklmnopqrstuvwxyz0123456789";
		String str2 = new String();
		str2="'~!@#$%^&*()-_+=|[]{};:,./qwertyuiop";
		char c = ' ';
		char d = ' ';	
		char e = ' ';
		
		System.out.println("a~z,0~9���� ���ڸ� �Է��ϼ���");
		System.out.print("src : ");
	
		Scanner sc = new Scanner(System.in);
		String src = sc.next();
		
		for(int i=0; i<src.length();i++)
		{
			e = src.charAt(i);
			
			for(int j=0; j<36; j++)
			{					
				c = str1.charAt(j);
				d = str2.charAt(j);
				if(e==c)
				{
					
					System.out.print(d);
				}
			}
			
		}
		
		
	}

}
