package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StudentPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("src/test1/data_utf8.txt");
		try {			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str = null;
			ArrayList<Singer> al = new ArrayList<Singer>();
			
			while((str=br.readLine()) != null)
			{
				System.out.println(str);
				String[] strArray = str.split(","); //strArray[0],[1]...
				
				Singer singer = new Singer(Integer.valueOf(strArray[0]),strArray[1],
						Integer.valueOf(strArray[2]),Integer.valueOf(strArray[3]),
						Integer.valueOf(strArray[4]));
				
				al.add(singer);				
			}
			br.close();
			fr.close();
			System.out.println("==================");
			
			//박봄의 점수를 알고 싶어요
			//ArrayList에서 이름의 값을 읽어 박봄인지 확인후 일치하면 점수를 프린트한다.

			for(int i =0; i<al.size(); i++)
			{				
				Singer s = al.get(i);
				if(s.getName().equals("박봄"))
				{
					System.out.println(s);
				}
			}					
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			try {
				file.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		catch(IOException e)
		{
			System.out.println("읽던 중 에러발생");
		}		
	}
}
class Singer
{
	int no;
	String name;
	int kor;
	int eng;
	int math;
	
	Singer()
	{
		
	}
	
	Singer(int no, String name, int kor, int eng, int math)
	{
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Singer [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
}
