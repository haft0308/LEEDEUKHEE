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
					
			//���� ū �� ���ϱ�
			if (su[i]>j)
			{
				j= su[i];
			}
			else
			{
				continue;
			}
		}
		
		System.out.println(j);
	
		
		//5���� ���������� �Է¹޾� ������ ����� ���϶�
		
		int hap=0;
		int[] st = new int[5];
		for(int k =0; k<5; k++)
		{
			System.out.printf("�������� �Է� %d : ",k+1);
			st[k] = sc.nextInt();
						
			hap = hap + st[k];
		}
		float avg =0;
		avg = (int)hap /5;
		
		System.out.printf("���� : %d",hap);
		System.out.printf("��� : %.1f",avg);
		
		
		//1-10���� ����� �迭 10���� �����صΰ�, �˻��� ���ڸ� �Է��Ͽ� ã�ƶ�
		
		int[] bae = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		
		if (a<0||a>10)
		{
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		
		}
		else
		{
			for (int c = 0; c<10; c++)
			{
				if (a==bae[c])
				{
					System.out.printf("ã�Ҵ�, %d",a);
				}

				else
				{
					continue;
				}
			}
		}
		
		
	}

}
