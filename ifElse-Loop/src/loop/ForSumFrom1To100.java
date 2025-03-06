package loop;

public class ForSumFrom1To100 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합: " + sum);
		// 변수 i를 for문의 초기화 식에서 선언하지 않고 for문 전에 선언하였다면
		// for문 벗어나서도 사용할 수 있다.
		
	}

}
