package array;

public class MainStringArrayArgument {

	public static void main(String[] args) {

		// 실행할 때 2개의 문자열을 주지 않으면 "값의 수가 부족합니다" 출력 -> 강제 종료
		// or 2개의 문자열이 정확히 입력 -> 2개 문자열 정수로 변환 후 덧셈 연산 수행
		
		if (args.length != 2) { // <-- 입력된 데이터 개수가 2개가 아닐 경우
			System.out.println("값의 수가 부족합니다");
			// 프로그램 강제 종료
			System.exit(0); 
		}
		
		String strNum1 = args[0]; // 첫 번째 데이터 얻기
		String strNum2 = args[0]; // 두 번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1); // 문자열 정수 변환
		int num2 = Integer.parseInt(strNum2); // 문자열 정수 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
