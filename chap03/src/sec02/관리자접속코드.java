package sec02;

import java.util.Scanner;

public class �����������ڵ� {

	public static void main(String[] args) {
		// ������ �����ڵ带 �Է��� ȫ�浿 1234,
		Scanner s = new Scanner(System.in);
		System.out.println("������ �ڵ带 �Է��ϼ���");
		// ������ �ڵ�� �ѱ� 3���ڿ� ���� 4���� �����Դϴ�.
		String code = s.next();

		String admin_id = code.substring(0, 3); // �ڵ��� 0������ 3������ 2������ ���ڿ��� �ν�
		int admin_pass = Integer.parseInt(code.substring(3, 7)); // �ڵ��� 3������ 7������ 6������ ���ڷ� �ν�

		System.out.println("���̵�:");
		String name = s.next();
		String pass = s.next();

		int password = Integer.parseInt(pass);

		if (name.equals(admin_id)) {
			if (password == admin_pass) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����");
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("�α��� ����");
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}

	}

}
