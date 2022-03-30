
public class Ex_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int형 값 10개를 저장할 배열을 생성하고, 1~10으로 초기화 하는 코드 구현
		
		int[] a = new int[10];
		for(int i=0; i<10; i++)
		{
			a[i]=i+1;
			System.out.println(a[i]);
		}
		
		
		// 배열의 크기를 나타내는 속성 이름은?(size, length, amount, quantity)
		// ==> length
//		//다음 코드의 실행 결과는?  ==> 2
//		int[][] arr = new int[2][3];
//		System.out.println(arr.length);
	}

}
