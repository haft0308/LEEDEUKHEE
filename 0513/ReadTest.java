package test4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ArrayList<Object> al = new ArrayList<Object>();
		String path ="src/data_plus.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object o;
		while((o=ois.readObject()) !=null)
		{			
			System.out.println(o);
			if(fis.available()==0)
			{
				break;
			}
		}
		ois.close();
		fis.close();	
	}

}