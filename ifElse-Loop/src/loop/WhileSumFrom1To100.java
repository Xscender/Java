package loop;

public class WhileSumFrom1To100 {

	public static void main(String[] args) {

		int sum = 0; // 합게를 저장할 변수
		
		int i = 0; // 루프 카운터 변수
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i - 1) + "합: " + sum);
	}

}
