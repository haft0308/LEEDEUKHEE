
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1���� 100���� ������ ����Ű�� �� ���� ���϶�
		
				
		int [] su;
		su = new int[100];
		for (int i=0; i<100; i++)
		{
			su[i]=i+1;
		}
		System.out.println(su[3]+su[6]); // �̷� ���α׷��ΰ�? �ƴϸ� ��� ���� �� ���ϴ°ǰ�? ������ �ǵ��� �𸣰���... �Ф�
		
		
		
		//�迭a �� 1, 10, 8, 5, 3, 9 �� ���� ����ִ�. �迭 a�� ���� ���϶�
		
		int sum =0;
		int[] a= {2,10,8,5,3,9};
		for (int j =0; j<a.length; j++) //j<a.length --> j<6 ���� �ȹ��� ������ ���忡 �����־,,,,
		{
			sum = sum+a[j];
		}
		System.out.println(sum);
		
		
	}

}
