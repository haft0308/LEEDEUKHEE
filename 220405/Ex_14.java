import java.util.Scanner;
public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//극장예약시스템
		//좌석 10, 예약 전 좌석을 보여준다.
		//예약이 끝난 좌석은 1, 빈 좌석은 0
		//-1 입력시 예약 시스템 종료 (최대한 함수로 분리)
	
		Scanner sc = new Scanner(System.in);
		
		int[] theater = new int[10];
		System.out.println("예약할 좌석의 숫자를 입력하세요");
		seatPrint(theater);
		
		int seat = sc.nextInt();
		for(int i=0; i<theater.length; i++)
		{
			if(i+1==seat)
			{
				theater[i]=1;
			}
			if(seat==-1)
			{
				break;
			}
		}
				
		seatPrint(theater);
				
	}

	static void seatPrint(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print("[좌석"+(i+1)+"]:"+a[i]+" \t");
		}
		System.out.println();
	}
}
