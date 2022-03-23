
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j=1;
		int[] num;
		num = new int[5];
		for(int i=1; i<5; i++)
		{
			j= 10*j;
			num[i] = j;
		}
		System.out.println(num[2]);
		
		
		
		int[] numb;
		numb = new int[6];
		for (int a=0; a<6; a++)
		{
			numb[a] = 1;
		}
		System.out.println(numb[5]);
		
		
		int[] number;
		number = new int[6];
		for (int c=0; c<6; c++)
		{
			for (int b=1; b<7; b++)
			{
				number[c] = b;
			}
		}
		System.out.println(number[5]);
	}

}
