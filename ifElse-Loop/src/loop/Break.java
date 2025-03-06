package loop;

public class Break {

	public static void main(String[] args) {

		// 주사위 번호 중 하나를 반복적으로 무작위로 뽑되, 6이 나오면 종료
		
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num == 6) {
				break;
				// break 문은 가장 가까운 반복문만 종료
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
