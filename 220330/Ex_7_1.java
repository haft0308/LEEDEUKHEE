import java.util.Random;
public class Ex_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1-45까지의 숫자를 배열에 담아, index의 임의의 자리와 index의 임의의 자리 값 교환을 통해
//		배열의 데이터를 섞어주는 프로그램(10번 이상 자리 교환하기)
		
		Random b = new Random();
		int[] a = new int[45];
		for(int i=0; i<45; i++)
		{
			a[i] = i+1;
			System.out.print(a[i]+",");
		}
		
		for(int i=0; i<15; i++)
		{
			int j = b.nextInt(45);
			int k = b.nextInt(45);
			a[j] = a[k];
		System.out.printf("a[%d]=%d\n",j,a[j]);
		}
		for(int i=0; i<45; i++)
		{
			System.out.print(a[i]+",");
		}
		//모르겠다요... ㅠㅠ
	}

}
