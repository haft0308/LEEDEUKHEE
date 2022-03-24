
public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MONTH = 12;
		String [] arrString = {"January", "February", "March", "April", "May", "June", "July", "August", "November", "December"};
		String [] arrStringKor = new String[MONTH];
		
		int i;
		
		System.out.println("영어로");
		for (i=0; i<arrString.length; i++)
		{
			System.out.println(arrString[i]);
		}
		for (i=0; i<arrStringKor.length; i++)
		{
			arrStringKor[i] = (i+1) + "월";
		}
		System.out.println("한글로");
		for ( i =0; i<arrStringKor.length; i++)
		{
			System.out.println(arrStringKor[i]);
		}
	}

}
