
public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2���� �迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭 ����
		//�迭�� ��� ���� ������ ��ҿ� �� ���� ���� ������ �����ϰ� ���
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int[][] score2;
		score2= new int[6][4];
				
		for(int i=0; i<5; i++)
		{
			int l = 0;
			for(int j=0; j<3; j++)
			{					
				l = l + score[i][j];
				score2[i][j] = score[i][j];
				score2[i][3] = l;
				
				System.out.print(score2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("===========================");
		
		for(int i=0; i<4; i++)
		{
			int h = 0;
			for(int j=0; j<5; j++)
			{				
				h = h + score2[j][i];
				score2[5][i] = h;
			}
		}	
		
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(score2[i][j]+"\t");
			}
			System.out.println();
		}

		
		
		
	}//main
//	void print(int[][] score2) // �Լ� ���� // �����Լ��� ������ ��ġ�� ���ο� �Լ�, return �� ������ void �Է�
//	{
//		for(int i=0; i<6; i++)
//		{
//			for(int j=0; j<4; j++)
//			{
//				System.out.println(score2[i][j]+"\t");
//			}
//		}
//	}

}
