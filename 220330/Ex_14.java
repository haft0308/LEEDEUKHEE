
public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열 생성
		//배열의 행과 열의 마지막 요소에 각 여과 행의 총합을 저장하고 출력
		
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
//	void print(int[][] score2) // 함수 정의 // 메인함수와 동등한 위치에 새로운 함수, return 이 없으면 void 입력
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
