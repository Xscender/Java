package loop;

public class Continue {

	public static void main(String[] args) {

		// 1에서 10 사이의 수 중에서 짝수만 출력
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 2로 나눈 나머지가 0이 아닐 경우
				continue;
			}
			
			System.out.println(i); // 홀수 실행되지 않음
		}
	}

}
