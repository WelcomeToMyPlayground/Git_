package sec02;

import java.util.Scanner;

public class 관리자접속코드 {

	public static void main(String[] args) {
		// 관리자 접속코드를 입력후 홍길동 1234,
		Scanner s = new Scanner(System.in);
		System.out.println("관리자 코드를 입력하세요");
		// 관리자 코드는 한글 3글자와 숫자 4개의 조합입니다.
		String code = s.next();

		String admin_id = code.substring(0, 3); // 코드의 0번부터 3번전인 2번까지 문자열로 인식
		int admin_pass = Integer.parseInt(code.substring(3, 7)); // 코드의 3번부터 7번전인 6번까지 숫자로 인식

		System.out.println("아이디:");
		String name = s.next();
		String pass = s.next();

		int password = Integer.parseInt(pass);

		if (name.equals(admin_id)) {
			if (password == admin_pass) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("로그인 실패");
			System.out.println("아이디가 존재하지 않습니다.");
		}

	}

}
