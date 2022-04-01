
public class Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4,5};
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		
		max = makeMax(arr1);
		System.out.println(max);
		
		sum = makeSum(arr1);
		System.out.println(sum);
		
		avg = makeAvg(arr1);
		System.out.println(avg);
	}
	
	static int makeMax(int[] array)
	{
		int a =0;

		for(int i=0; i<5; i++)
		{
			a = array[0];
			if(array[i]>a)
			{
				a=array[i];
			}
		}		
		return a;		
	}
	
	static int makeSum(int[] a)
	{
		int b =0;
		for(int i=0; i<5; i++)
		{
			b=b+a[i];
		}
		return b;
	}

	static float makeAvg(int[] a)
	{
		float c =0;
		int d =0;
		for(int i=0; i<a.length; i++)
		{
			d=d+a[i];
		}
		c = d/a.length;
		return c;
	}
}
