
public class Method_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruit = {"banana","orange", "peach","strawberry","cherry"};
		
		String storeName = new String("싱싱과일가게");
		//fruit의 배열의 값인 과일 이름의 철자가 가장 긴 과일을 찾는 함수 출력
		
		String max = maxLengthFruit(fruit);
		System.out.println(storeName+"에서 가장 긴 이름을 가진 과일은 "+max);
	}

	//가장 긴 철자를 가지고 있는 과일 이름 찾는 함수
	static String maxLengthFruit(String[] s)
	{
		String result=null; // 과일이름 저장변수
		int max=0; //철자 길이 저장변수
		for(int i=0; i< s.length; i++)
		{
			if(s[i].length()>max) //철자의 길이 돌려주는 함수 호출
			{
				max = s[i].length();
				result = s[i];
			}
		}
		return result;
	}
}
