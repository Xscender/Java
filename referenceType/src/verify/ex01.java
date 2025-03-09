package verify;

public class ex01 {

	public static void main(String[] args) {

		// 문제: for 문 이용해서 주어진 배열의 항목에서 최대값 구하기
		// --> 배열 array 의 각 요소를 순차적으로 확인하면서, max 변수에 현재까지 발견한 가장 큰 값을 저장하여, 최종적으로 max 출력
		
		// 최대값을 저장할 변수 max 선언, 초기값 0으로 설정
		int max = 0; 
		int[] array = {1, 5, 3, 8, 2};
		
		// array 의 모든 요소를 순차적으로 탐색하면서 최대값을 찾는다
		for (int i = 0; i < array.length; i++) { 
			
			if (max < array[i]) {
				max = array[i];
			}
			
		}
		
		System.out.println("max : " + max);
	}

}
