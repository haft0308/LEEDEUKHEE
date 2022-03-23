
public class Array_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열도 선언해야 하나? 순서가 바뀌지 않나?
		
		int[] score;
		score = new int[5];
		for (int i = 0; i<5; i++)
		{
			score[i] = i*10;
		}
		
		System.out.println(score[0]);
		System.out.printf("score[0] = %d\n",score[0]);
		System.out.printf("score[1] = %d\n",score[1]);
		System.out.printf("score[2] = %d\n",score[2]);
		System.out.printf("score[3] = %d\n",score[3]);
		System.out.printf("score[4] = %d\n",score[4]);
		
	}

}
