
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4. Test클래스를 하나 만드시오. 
//멤버변수로는 int total을 가지고 있으며, 멤버메소드로 sum()을 가지고 있다.
//sum()함수는 int 1차원배열을 인자로 받으며, 해당 배열의 값들을 모두 더하는 일을 하며,
//모두 더한 값을 돌려준다.
//TestMain클래스를 만들어 Test클래스의 sum()을 호출하여 값을 프린트해주도록 한다.

		Test4 t = new Test4();
		
		int[] array = new int[] {3,4,5,6,7};

		System.out.println(t.sum(array));
	}

}
class Test4
{
	int total;
	
	int sum(int[] arr)
	{
		for(int a: arr)
		{
			total = total +a;
		}
		return total;
	}
}
