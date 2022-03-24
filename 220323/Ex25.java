
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//b배열 10,11,25,38,39,44,50,90,99,100 //10개 값을 순서대로 b 배열에 담기
		
		int[] b= {10,11,25,38,39,44,50,90,99,100};		
		String[] c = {"싸이","트와이스","소녀시대","BTS","아이유","브레이브걸스","로제","에이핑크","저스틴비버","오리"}; // 배열 값이 9개라 아이유의 라이벌 오리 하나 주가했어요.
		
		
		for (int i=0; i<b.length; i++)
		{			
			if (b[i]==100) // 위 배열에서 100점을 찾아 index의 값을 출력하세요.	
			{
				System.out.printf("100점 = b[%d] = ",i);
				System.out.println(c[i]);
			}
			else
			{
				continue;
			}
		}				
		//b 배열에서 찾은 index 값을 c 배열에서 적용해서 해당 인덱스의 값을 읽어와서 출력하라
		// ex)10점은 0번 인덱스에 할당되어 있고, c 배열에서 0번 인데스의 값인 "싸이"를 출력하도록 한다.				
	}

}
