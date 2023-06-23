package sec01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		int F = s.nextInt();

		int result;
		if (A > B) {
			System.out.println(">");
		}
		if (A == B) {
			System.out.println("==");
		}
		if (A < B) {
			System.out.println("<");
		}
	}

}
