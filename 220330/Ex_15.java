import java.util.Scanner;
public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//eauals()�� Ȱ���� �ܾ� ���߱� ����
		
		Scanner sc = new Scanner(System.in);
		
		String chair = "����";
		String computer ="��ǻ��";
		String integer = "����";
				
		System.out.println("Q1. chair�� ����?");
		String a = sc.next();
		
		if(a.equals(chair))
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("Ʋ�Ƚ��ϴ�. ������ �����Դϴ�.");
		}
		
		System.out.println("Q2. mtopecur�� ����?");
		String b= sc.next();
		
		if(b.equals(computer))
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("Ʋ�Ƚ��ϴ�. ������ ��ǻ���Դϴ�.");
		}
		
		System.out.println("Q3. integer�� ����?");
		String c= sc.next();
		
		if(c.equals(integer))
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("Ʋ�Ƚ��ϴ�. ������ �����Դϴ�.");
		}
	}

}
