package test;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° �� :");
		String strNum1 = s.next();
		System.out.println("�� ��° �� :");
		String strNum2 = s.next();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("���� ���:" + result);
	}

}
