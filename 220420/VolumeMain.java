
public class VolumeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		int[] a = new int[] {0,4};
		int[] b = new int[] {0,5};
		r.area(a,b);
		System.out.println(r.area(a,b));
		Square s = new Square();
		s.area(a,b);
		System.out.println(s.area(a,b));
		s.volume(5);
		System.out.println(s.volume(5));
	}
}

class Rectangle
{
	int[] x = new int[2];
	int[] y = new int[2];
	
	int area(int[] x, int[] y)
	{
		int area;
		area = (x[1]-x[0])*(y[1]-y[0]);
		return area;		
	}
}
class Square extends Rectangle
{
	int h;
	int vol;
	int area;
	int area(int[] x, int[] y)
	{		
		area = (x[1]-x[0])*(y[1]-y[0]);
		return area;
	}
	int volume(int h)
	{
		this.h = h;
		vol = area * h;
		return vol;
	}
}