package verify;

public class SumDiceOf2 {

	public static void main(String[] args) {

		// 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 게속 주사위를 던지고,
		// 눈의 합이 5이면 실행 멈추는 코드 작성
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			
			if ((num1 + num2 == 5)) {
				break;
			}
			
		}
	}

}
