
public class Ex19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[10];
		int key = 8;
		//�ʱ�ȭ
		for (int i =0; i<10; i++)
		{
			a[i] =i;
		}
		
		for (int i = 0; i<10; i++)
		{
			System.out.println(a[i]);
			if (key == a[i])
			{
				System.out.println("key ã��");
				break;
			}
		}
		
		//int �迭 a�� ������ 0~9���� 10���� ���� �Ҵ�Ǿ� ����
		// �迭 a�� ������� ����ϴٰ� key ���� 8�� ������ "key ã��"�� ����ϰ� ���α׷��� �����Ѵ�.
	}

}
