
public class Ex19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[10];
		int key = 8;
		//초기화
		for (int i =0; i<10; i++)
		{
			a[i] =i;
		}
		
		for (int i = 0; i<10; i++)
		{
			System.out.println(a[i]);
			if (key == a[i])
			{
				System.out.println("key 찾음");
				break;
			}
		}
		
		//int 배열 a의 변수에 0~9까지 10개의 값이 할당되어 있음
		// 배열 a를 순서대로 출력하다가 key 값인 8이 나오면 "key 찾음"을 출력하고 프로그램을 종료한다.
	}

}
