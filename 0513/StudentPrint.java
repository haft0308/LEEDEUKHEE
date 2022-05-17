package test4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class StudentPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("src/data.txt");
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
						Integer.valueOf(strArray[4]), 1);
				
				al.add(singer);				
			}
			br.close();
			fr.close();
			
			System.out.println("==================");
						
			//평균점수 구하기 // 석차 구하기
			float[] arr=new float[al.size()];
			int[] arr2= new int[al.size()];
			
			int i=0;
			int j=0;
			
			for(i=0; i<arr.length; i++)
			{				
				Singer s=al.get(i);
				arr[i] = s.avg();
				
				for(j=0; j<arr.length; j++)
				{					
					Singer s2=al.get(j);
					arr[j] = s2.avg();
					if(arr[i]<arr[j])
					{						
						arr2[i] +=1;
						s.setRank(arr2[i]);
					}
				}			
			}
			// 다른 파일로 저장하기
			File file2 = new File("src/data_plus.txt");
			FileOutputStream fos = new FileOutputStream(file2);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for(i=0; i<al.size(); i++)
			{				
				Singer s = al.get(i);
				oos.writeObject(s);				
			}	
			
			oos.close();
			fos.close();
			System.out.println("==================");
			
			//박봄의 점수를 알고 싶어요
			//ArrayList에서 이름의 값을 읽어 박봄인지 확인후 일치하면 점수를 프린트한다.

			for(i =0; i<al.size(); i++)
			{				
				Singer s = al.get(i);
				if(s.getName().equals("김설현"))
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
class Singer implements Serializable
{
	int no;
	String name;
	int kor;
	int eng;
	int math;
	float avg;
	int rank;
	
	Singer()
	{
		
	}

	Singer(int no, String name, int kor, int eng, int math, int rank)
	{
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
		this.rank = rank;
	}
	public float avg()
	{
		return avg = (kor+eng+math)/3.0f;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Singer [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + 
				", math=" + math +", avg="+avg+", rank="+rank+"]";
	}
}