package example;

public class Ex17_Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5, j;
		j = i++;
		System.out.println("j="+j);
		j=++i;
		System.out.println("j="+j);
		j=i--;
		System.out.println("j="+j);
		j=--i;
		System.out.println("j="+j);
		System.out.println("현재 i = "+i);
		System.out.println("i++ : "+i++); //5출력후 +1 되어 i=6의 값을 가지고 있음
		System.out.println("++i : "+(++i));// 6의 값을 가진 i에 1을 증가 시킨 후 출력, 7
		System.out.println("i-- : "+i--); // 앞줄의 i =7 의 상태에서 출력 후 -1을 시킨 상태 6
		System.out.println("--i : "+(--i)); // 6의 값을 가진 i 에서 -1 실행 후 출력 5
	}

}
