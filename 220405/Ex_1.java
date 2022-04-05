
public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		int[] a1 = {1,2,3};
		int[] a2 = {4,5,6};
		
		x = sum(a1);
		y = sum(a2);
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	static int sum(int[] a)
	{		
		return a[0]+a[1]+a[2];
	}

}
