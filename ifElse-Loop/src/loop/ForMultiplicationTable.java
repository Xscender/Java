package loop;

public class ForMultiplicationTable {

	public static void main(String[] args) {

		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			
			// 바깥쪽 for문 한 번 실행할 때마다 안 쪽 for문 지정된 횟수만큼 실행
			for (int n = 1; n <= 9; n++) { 
				System.out.println(m + " x " + n + " = " + (m + n));
			}
		}
	}

}
