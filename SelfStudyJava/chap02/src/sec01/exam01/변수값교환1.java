package sec01.exam01;

public class ��������ȯ1 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		System.out.println("x:" + x + ", y:" + y);

		int temp = x; // temp ��� ������ ������ x�� ����, = �� ���ٰ� �ƴ� ����
		
		x = y; // ���� x�� ���� y���� ���� 
		y = temp; // ���� y�� ���� temp���� ���Խ�Ŵ 
		
		System.out.println("x:" + x + ", y:" + y);
	}

}
