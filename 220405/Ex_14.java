import java.util.Scanner;
public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//극장예약시스템
		//좌석 10, 예약 전 좌석을 보여준다.
		//예약이 끝난 좌석은 1, 빈 좌석은 0
		//-1 입력시 예약 시스템 종료 (최대한 함수로 분리)
	
		int[] seat = new int[10];//좌석 0
		Scanner sc= new Scanner(System.in);
		
		int number=-2;
		boolean isFull = false;
		System.out.println("======= 극장 예약 시스템 ===========");
		while(number != -1 || isFull ==false)//유저가 -1을 입력하면 종료
		{	
			isFull = isFull(seat);
			if(isFull)
			{
				System.out.println("예약이 모두 완료되었습니다.");
				break;
			}
			viewSeat(seat);
						
			System.out.println("종료하시려면 -1을 입력하시고");
			System.out.println("예약하려면 1~10 사이의 좌석번호를 입력하세요.");
			number=sc.nextInt();
			if((number>=1 && number<=10) || number==-1)
			{
				if(number == -1)
				{
					System.out.println("종료되었습니다.");
					break;
				}
				if(seat[number-1] !=1)//예약되지 않은 좌석의 경우
				{
					seat[number-1]=1;
				}
				else
				{
					System.out.println("이미 예약된 자리입니다.");
				}
			}
					
		}
	}
	static void viewSeat(int[] seat)
	{
		System.out.println("좌석배치표");
		for(int i=0; i<10; i++)
		{
			System.out.print((i+1)+"번 : "+seat[i]+"\t");
		}
	}
	/*
	 * 함수명 : isFull()
	 * parameter(매개변수) : int[] seat
	 * 리턴타입 boolean
	 * 좌석이 다 예약되면 true를 리턴한다.
	 */
	static boolean isFull(int[] seat)
	{
		boolean ret = false;
		int i=0;
		for(i=0; i<10; i++)
		{
			if(seat[i]==0)
			{
				break;
			}			
		}
		if (i==10)
		{
		
			ret=true;
		}
		return ret;
	}

}
