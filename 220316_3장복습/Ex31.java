
public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		char ch = ' ';
		
		x = 15;
		System.out.printf("x=%2d, 10<x && x<20 =%b\n", x, 10<x && x<20);
		
		ch = '1';
		System.out.printf("ch='%c', '0'<=ch && ch <= '9'=%b\n", ch, '0' <= ch && ch <= '9');
		
		ch = 'a';
		System.out.printf("ch='%c', 'a'<=ch && ch <= 'z'=%b\n", ch, 'a' <= ch && ch <= 'z');
		
		ch = 'A';
		System.out.printf("ch='%c', 'A'<=ch && ch <= 'Z'=%b\n", ch, 'A' <= ch && ch <= 'Z');
		
		ch = 'q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q'=%b\n", ch, ch=='q' || ch=='Q');
		
		int y = 0;
		
		y = 15;
		System.out.printf("y=%2d, 10 < y && y < 20=%b\n", y, 10<y && y<20);
		
		y = 6;
		System.out.printf("y=%2d, y%%2==0 || y%%3==0 && y%%6!=0 =%b\n", y, y%2==0||y%3==0&&y%6!=0);
		System.out.printf("y=%2d, (y%%2==0 || y%%3==0) && y%%6!=0 =%b\n", y, (y%2==0||y%3==0)&&y%6!=0);
		
	}

}
