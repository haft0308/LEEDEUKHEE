import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3명의 사람에게 국영수 점수를 입력받아 총점 구하기
		
		Scanner sc=new Scanner(System.in);
		int[][] a= new int[3][4];
		String[] str = new String[] {"국어", "영어", "수학","총점"};
		
		for(int i=0; i<3; i++)
		{
			int chong =0;
			System.out.println((i+1)+"번째 사람의 점수 입력");
			for(int j=0; j<3; j++)
			{						
				System.out.print(str[j]+" 점수 입력 : ");
				a[i][j] =sc.nextInt();
				chong = chong + (int)a[i][j];
				a[i][3] = chong;
			}
			System.out.println();
		}
		
		for(int i=0; i<4; i++)
		{
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		
		for(int i=0; i<3; i++)
		{			
			for(int j=0; j<4; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
