
public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] answer = new int[]{1,4,4,3,1,4,4,2};
		for(int i = 0; i<8; i++)
		{
			{
				for(int j=0; j<answer[i]; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
