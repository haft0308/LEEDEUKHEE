import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���� 10���� �Է¹޾� ���� ū ���� ���϶�
		System.out.println("������ 10�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		
		int[] su = new int[10];
		int j = 0;
		
		for(int i=0; i<10; i++)
		{
			System.out.printf("���� �Է� %d : ",i+1);
			su[i] = sc.nextInt();
							
			if (su[i]>j)
			{
				j= su[i];
			}
			else
			{
				continue;
			}
		}
		//���� ū �� ���ϱ�
		System.out.println(j);
	
		
		
	}

}
