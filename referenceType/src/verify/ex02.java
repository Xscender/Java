package verify;

public class ex02 {

	public static void main(String[] args) {

		// 문제: 중첩 for 문 이용해서 주어진 배열의 전체 항목의 합과 평균값 구하기
		// --> 2차원 배열 array 의 모든 요소를 하나씩 순회하며 sum 변수에 값을 더하고, count 변수로 요소 개수를 센 후, 총합과 평균을 구한다.
		
		// array 는 3개의 행을 가지고 있고, 가변형 2차원 배열(각 행의 열 개수가 다를 수 있다) 이다.
		// 배열의 요소들은 각각 인덱스(번지)를 가진다.
			// array[0] -> {95, 86} (2개 요소, array[0][0], array[0][1])
			// array[1] -> {83, 92, 96} (3개 요소, array[1][0], array[1][1], array[1][2])
			// array[2] -> {78, 83, 93, 87, 88} (5개 요소, array[2][0] ~ array[2][4])
		int[][] array = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
		
		int sum = 0; // 배열 요소의 합계 저장
		double avg = 0.0;
		
		int count = 0; // 배열 내 숫자의 개수 세는 역할
		for (int i = 0; i < array.length; i++) { // i => 행 번호(번지)
			
			for (int j = 0; j < array[i].length; j++) { // j => 열 번호(번지)
				sum += array[i][j];
				count++;
			}
			
		}
		avg = (double) sum / count;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
