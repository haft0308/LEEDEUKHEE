
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 ch에 a,p,p,l,e 순서대로 문자 출력, 역순으로 출력
		
		char ch[] = {'a','p','p','l','e'};
		for (int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i]);
		}
		
		
		System.out.println();
		
		//역순으로 출력
		
		char ch2[] = {'a','p','p','l','e'};
		for (int j=4; j==0; j--)			
		{
			System.out.print(ch2[j]); //왜 안되지....>.<
		}
		
	}

}
