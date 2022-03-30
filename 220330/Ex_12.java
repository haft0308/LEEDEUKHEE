
public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[][] star = {
				{'*','*',' ',' ',' ',},
				{'*','*',' ',' ',' ',},
				{'*','*','*','*','*',},
				{'*','*','*','*','*',},
		};
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(star[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("====================================");
		//회전시켜 출력
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(star[3-j][i]+"\t");
			}
			System.out.println();
		}
	}

}
