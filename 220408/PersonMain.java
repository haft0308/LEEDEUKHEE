
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1;
		p1= new Person();
		p1.height = 180;
		p1.weight = 80;
		
		p1.P_BMI();
		p1.print();
	}

}
class Person
{
	int height;
	int weight;
	float BMI;
	
	void P_BMI()
	{
		BMI=(float)weight/(height*height/10000);
	}
	
	void print()
	{
		System.out.println(BMI);
		if(BMI<18.5)
		{
			System.out.println("마름");
		}
		else if(BMI<25)
		{
			System.out.println("보통");
		}
		else if(BMI<30)
		{
			System.out.println("가벼운 비만");
		}
		else
		{
			System.out.println("심한 비만");
		}
	}
}
