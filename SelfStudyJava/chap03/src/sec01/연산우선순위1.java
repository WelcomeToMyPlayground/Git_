package sec01;

import java.util.Scanner;

public class 연산우선순위1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = s.nextInt();

		System.out.println("두번째 숫자를 입력하세요");
		int num2 = s.nextInt();
		
		int sum = num1 + num2;
		String result = (sum>=50)?"통과":"탈락"; // String 문자열이기 때문에 ?뒤도 문자열로 입력 만약 int일 경우 정수 입력
		System.out.println(result);
		
		
		//삼항 연산자를 사용해 두 수의 합이 50이상이면 "통과"
		//50미만이면 "탈락"을 출력
		

	}

}
