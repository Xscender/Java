package loop;

public class BreakOutter {

	public static void main(String[] args) {

		// lower 변수가 'g'를 갖게 되면 바깥쪽 for문까지 빠짐
		
		Outter : for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		
		System.out.println("프로그램 실행 종료");
	}

}
