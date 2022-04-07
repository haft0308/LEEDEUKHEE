
public class Method_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[3];
		for(int i =0; i<3; i++)
		{
			array[i] = i+1;
		}
		print_arr(array); //배열의 값을 출력하는 함수 호출
		System.out.println();
		changeArray(array); //Array 값을 변경하는 함수 호출
	}

	static void print_arr(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}		
	}
	
	static void changeArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = arr[i] +2;
			print_arr(arr); //배열의 값을 출력하는 함수 호출
		}
	}
}
