package my2;
import java.util.Scanner;

public class GameMain_my2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PlayGame pg = new PlayGame(new Picachu());
//		PlayGame pg2 = new PlayGame(new Gobook());
//		PlayGame pg3 = new PlayGame(new Lee());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("=====캐릭터 성장 프로그램======");
		System.out.println("==========================");
		System.out.println("캐릭터를 선택하세요. 1. 피카추 2. 꼬부기 3. 이상해씨");
	
		PlayGame pg;		
		
		int a = sc.nextInt();
		Character character = null;
		switch(a)
		{
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			character = new Lee();
			break;
		default:
//			System.out.println("캐릭터를 올바르게(1~3) 선택하세요");
			System.out.println("잘못선택하셨습니다.");
		}
		
		if(character == null)
		{
			System.out.println("게임을 종료합니다.");
			return;
		}
		else
		{
			pg = new PlayGame(character);
		}
		
		while(true)
		{
			pg.printMenu(sc);
			if(pg.isExit()==true)
			{
				System.out.println("게임을 종료합니다.");
				break;
			}
		}		
	}
}

abstract class Character
{
	protected int hp;
	protected int level = 0;
	protected int energy;
	protected int money = 10000;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	
	public abstract boolean buyHp();
	
	public boolean checkEnergy()
	{
		boolean ret = false;
		if(energy <=0|| money<=0)
		{
			ret=true; //에너지가 0이 되어 게임을 종료할 수 있도록
		}
		else
		{
			ret=false;
		}
		return ret;
	}
	public void printInfo()
	{
		System.out.println("현재 캐릭터의 정보 출력");
		System.out.println("hp = "+hp +" / "+"energy = "+energy+" / "+"level = "+level+" / "+"money = "+money);
	}
}
class Picachu extends Character
{
	
	Picachu()
	{
		hp =30;
		energy = 50;
//		money = 10000;
		System.out.println("피카추가 생성되었습니다.");
		printInfo();
	}
	public void eat()
	{
		energy = energy +10;
	}
	public void sleep()
	{
		energy = energy +5;
	}
	public boolean play()
	{
		energy = energy -20;
		hp = hp +5;
		levelUp();
		return checkEnergy();
	}
	public boolean train()
	{
		energy = energy - 15;
		hp = hp + 20;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if(hp>=40)
		{
			level++;
			hp = hp - 40;
		}
	}
	
	public boolean buyHp()
	{
		energy += 50;
		hp += 30;
		money -=1000;
		levelUp();
		return checkEnergy();
	}
}
class Gobook extends Character
{
	Gobook()
	{
		hp =40;
		energy = 50;
//		money = 10000;
		System.out.println("꼬부기가 생성되었습니다.");
		printInfo();
	}
	public void eat()
	{
		energy = energy +15;
	}
	public void sleep()
	{
		energy = energy +10;
	}
	public boolean play()
	{
		energy = energy -30;
		hp = hp +15;
		levelUp();
		return checkEnergy();
	}
	public boolean train()
	{
		energy = energy - 20;
		hp = hp + 30;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if(hp>=50)
		{
			level++;
			hp = hp - 50;
		}
	}
	public boolean buyHp()
	{
		energy += 50;
		hp += 30;
		money -=1000;
		levelUp();
		return checkEnergy();
	}
}
class Lee extends Character
{
	Lee()
	{
		hp =20;
		energy = 30;
//		money = 10000;
		System.out.println("피카추가 생성되었습니다.");
		printInfo();
	}
	public void eat()
	{
		energy = energy +5;
	}
	public void sleep()
	{
		energy = energy +20;
	}
	public boolean play()
	{
		energy = energy -10;
		hp = hp +15;
		levelUp();
		return checkEnergy();
	}
	public boolean train()
	{
		energy = energy - 10;
		hp = hp + 20;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if(hp>=35)
		{
			level++;
			hp = hp - 35;
		}
	}
	public boolean buyHp()
	{
		money -=1000;
		energy += 50;
		hp += 30;
		levelUp();
		return checkEnergy();
	}
}
class PlayGame
{
	private Character character;
	private int menu;
	private boolean exit;	
	
	public boolean isExit() {// 내가 만든게 아니라 마우스 오른쪽버튼, source->Generate getter,setter로,,,
		return exit;
	}
	public void setExit(boolean exit) {
		this.exit = exit;
	}
		
	public PlayGame(Character character)
	{
		this.character = character;
		exit=false;
	}
	public void printMenu(Scanner sc)
	{
		System.out.println("1.밥먹이기 2.잠재우기 3.놀아주기 4.운동시키기 5.경험치구매하기 6.종료");
		menu = sc.nextInt();
		play();
	}
	public void play()
	{
		switch(menu)
		{
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			exit=character.play();
			break;
		case 4:
			exit=character.train();
			break;
		case 5:
			exit=character.buyHp();
			break;
		case 6:
			exit = true;
			break;
		}
		character.printInfo();
	}
}

