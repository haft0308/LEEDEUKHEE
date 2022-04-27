
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(300);
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp(-50);
		myCar.speedUp(50);
		myCar.speedDown(-30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedUp(100);
		myCar.speedUp(300);
	}

}
class Car
{
	int maxSpeed;
	int speed;
	
	Car()
	{
		
	}
	Car(int maxSpeed)
	{
		speed=0;
		this.maxSpeed = maxSpeed;		
	}
	
	void speedUp()
	{		
		speed +=5;
		System.out.println("speedUp()호출 : 최대속도 : "+maxSpeed+" 현재속도 : "+speed);	
	}
	void speedUp(int a)
	{
		if(a>=0)
		{			
			if((speed+a)<maxSpeed)
			{
				speed+=a;
				System.out.println("speedUp("+a+")호출 : 최대속도 : "+maxSpeed+" 현재속도 : "+speed);
			}
			else
			{
				speed=maxSpeed;
				System.out.println("speedUp("+a+")호출 : 최대속도보다 높아 최대속도로 지정. 최대속도 : "+maxSpeed+" 현재속도 : "+speed);
			}			
		}
		else
		{
			System.out.println("speedUp("+a+")호출 : 오류 : 속도가 음수이므로 0으로 지정. 최대속도 : "+maxSpeed+" 현재속도 : "+speed);
		}
	}
	void speedDown()
	{
		speed -=5;
		System.out.println("speedDown()호출 : 최대속도 : "+maxSpeed+" 현재속도 : "+speed);
	}
	void speedDown(int a)
	{
		if(a>=0)
		{
			if((speed-a)>=0)
			{
				speed-=a;
				System.out.println("speedUp()호출 : 최대속도 : "+maxSpeed+" 현재속도 : "+speed);
			}
			else
			{
				System.out.println("speedDown("+a+")호출 : 속도가 0보다 작아 0으로 지정. 최대속도 : "+maxSpeed + " 현재속도 : "+speed);
			}			
		}
		else
		{
			System.out.println("speedDown("+a+")호출 : 오류 : 속도가 음수이므로 0으로 지정. 최대속도 : "+maxSpeed+"현재속도 : "+speed);
		}
	}
}