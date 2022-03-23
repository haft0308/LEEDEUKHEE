
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1에서 100까지 정수를 기억시키고 그 합을 구하라
		
				
		int [] su;
		su = new int[100];
		for (int i=0; i<100; i++)
		{
			su[i]=i+1;
		}
		System.out.println(su[3]+su[6]); // 이런 프로그램인가? 아니면 모든 수를 다 더하는건가? 문제의 의도를 모르겠음... ㅠㅠ
		
		
		
		//배열a 에 1, 10, 8, 5, 3, 9 의 값이 들어있다. 배열 a의 합을 구하라
		
		int sum =0;
		int[] a= {2,10,8,5,3,9};
		for (int j =0; j<a.length; j++) //j<a.length --> j<6 아직 안배운거 같은데 뒷장에 나와있어서,,,,
		{
			sum = sum+a[j];
		}
		System.out.println(sum);
		
		
	}

}
