
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] number;
		number = new int[6];
		for(int i =0; i<6; i++)
		{
			int j = 0;
			j = i*2+1;
			number[i] = j;
		}	
		System.out.println(number[5]);
		
		
		
		int[] nu;
		nu = new int[6];
		for(int k=0; k<6; k++)
		{
			int j = 0;
			j = k*10 +10;
			nu[k] = j;
		}
		System.out.println(nu[4]);
		
	}

}
