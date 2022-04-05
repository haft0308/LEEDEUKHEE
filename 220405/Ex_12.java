import java.util.Scanner;
public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10명의 몸무게, 키, 신발 사이즈 입력받기, 가장 큰 몸무게, 가장 큰 키, 가장 큰 신발사이즈 출력
			
		Scanner sc=new Scanner(System.in);
		
		int[][] stu = new int[10][3];
		for(int i=0; i<10; i++)
		{			
			System.out.println("학생"+(i+1)+" : 몸무게, 키, 신발 사이즈를 순서대로 입력하세요");
			for(int j=0; j<3; j++)
			{
				stu[i][j] = sc.nextInt();
			}			
		}
		
		int max_weight = weight(stu);
		System.out.println("가장 큰 몸무게는 : "+max_weight);
		
		int max_height = height(stu);
		System.out.println("가장 큰 키는 : "+max_height);
		
		int max_shoe = shoe(stu);
		System.out.println("가장 큰 신발 사이즈는 : "+max_shoe);
	}

	static int weight(int[][] a)
	{
		int max = a[0][0];
		for(int i=1; i<10; i++)
		{
			if(max<a[i][0])
			{
				max=a[i][0];
			}
		}		
		return max;
	}
	
	static int height(int[][] a)
	{
		int max = a[0][1];
		for(int i=1; i<10; i++)
		{
			if(max<a[i][1])
			{
				max=a[i][1];
			}
		}		
		return max;
	}
	
	static int shoe(int[][] a)
	{
		int max = a[0][2];
		for(int i=1; i<10; i++)
		{
			if(max<a[i][2])
			{
				max=a[i][2];
			}
		}		
		return max;
	}
}
