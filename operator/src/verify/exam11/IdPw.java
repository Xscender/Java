package verify.exam11;

import java.util.Scanner;

public class IdPw {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		String strPw = scanner.nextLine();
		
		int pw = Integer.parseInt(strPw);
		
		if (name.equals("java")) {
			if (pw == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
	}

}
