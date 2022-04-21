
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer b = new Buyer(); //바이어 객체 생성
		
		Product[] p = new Product[3]; //프로덕트의 배열 3개생성
		p[0]=new TV(); //프로덕트 타입에 티비를 업캐스팅하여 0번째 배열에 할당
		p[1]=new Computer();//프로덕트 타입에 컴퓨터를 업캐스팅
		p[2]=new Audio();//프로덕트 타입에 오디오를 업캐스팅
		
		for(int i=0; i<p.length; i++)
		{
			b.buy(p[i]); //바이어가 프로덕트를 순서대로 세번 구매하도록.
		}
		b.print();
	}

}
class Product
{
	int price;
	int bonusPoint;
}
class TV extends Product
{
	int channel;
	int volume;
	TV()
	{
		price=100; //프로덕트를 상속받아 price, bonusPoint 에 오버라이딩
		bonusPoint=100;
	}
}
class Computer extends Product
{
	int cpu;
	int ram;
	Computer()
	{
		price=200;
		bonusPoint=200;
	}
}
class Audio extends Product
{
	int volume;
	int speaker;
	Audio()
	{
		price=50;
		bonusPoint=50;
	}
}
class Buyer
{
	int money=10000;
	int bonusPoint=0;
	void buy(Product p)
	{
		money=money-p.price;
		bonusPoint=bonusPoint+p.bonusPoint;
	}
	void print()
	{
		System.out.println("money = "+money);
		System.out.println("bonusPoint = "+bonusPoint);
	}
}