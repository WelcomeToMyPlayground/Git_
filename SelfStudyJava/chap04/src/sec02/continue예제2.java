package sec02;

public class continue����2 {
	/* continue�� ����~ */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // 1���� 10���� 10�� �ݺ�
			if (i % 15!= 0) {   //i�� Ȧ���� continue => ����
				continue;       //if(i%3!=0){continue; if(i%5!=0){continue;}}
			}			        //if(i%3!=0 ||i%5!=0){continue;}
			System.out.println(i);
		}
	}

}
