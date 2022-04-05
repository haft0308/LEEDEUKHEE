
public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1-9까지 중복되지 않는 숫자
		
		int[] c = new int[3];
				
		for(int i=1; i<3; i++)
		{			
			int a = rando();
			c[i] = a;			
		}
		
				
		while(c[0]==0)
		{
			c[0] = rando();
		}
		while(c[1]==0||c[1]==c[0])
		{
			c[1] = rando();
		}
		while(c[2]==0||c[2]==c[0]||c[2]==c[1])
		{
			c[2] = rando();
		}
		
		for(int i=0; i<3; i++)
		{
			System.out.print(c[i]+"\t");
		}
	}
	
	static int rando()
	{
		int rando = (int)(Math.random()*10);
		return rando;
	}

}
