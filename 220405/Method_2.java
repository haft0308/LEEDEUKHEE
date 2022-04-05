
public class Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=0;
		//age 값을 28로 할당될 수 있도록 함수 호출
		age = setAge(8);
		System.out.println(age);
	}
	
	static int setAge(int a)
	{
		return a+20;
	}

}
