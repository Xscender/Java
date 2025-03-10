package verify;

import java.util.Scanner;

public class WhileSwitch {

	public static void main(String[] args) {

		boolean run = true; // 프로그램 실행 상태를 나타내는 변수 (while문 계속 실행할지 결정)
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) { // run 변수 true일 동안 계속 실행
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			
			case 1:
				System.out.print("예금액> ");
				balance += Integer.parseInt(sc.nextLine()); // 입력된 금액 balance에 추가
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(sc.nextLine()); // 입력된 금액 balance에서 차감
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			System.out.println();
		}
		
		System.out.println("종료");
	}

}
