package sec01;

import java.util.Scanner;

public class 문자열비교 {

	public static void main(String[] args) {
		String var1 = "홍길동"; // 변수 사용 안해서 경고 
		String var2 = "홍길동";

		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		s.close();
		if (a == b) {
			System.out.println("두 데이터 참조가 같아요");
		} else {
			System.out.println("두 데이터 참조가 달라요"); // 데이터 참조가 다르다. -> neww로 받았기 때문에 참조변수 String a,b의 주소가 각각 다름 

		}
		String var3 = new String("홍길동");
		String var4 = new String("홍길동");
		if (var3 == var4) {
			System.out.println("두 데이터 참조가 같아요");
		} else {
			System.out.println("두 데이터 참조가 달라요");
		}
		
		String t;
		
		
	}

}
