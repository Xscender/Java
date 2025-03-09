package array;

public class AdvancedFor {

	public static void main(String[] args) {

		// int타입 배열 scores 선언하고 5개의 값들 초기화
		// 배열에 각 5개의 값들 저장
		int[] scores = {95, 71, 84, 93, 87};
		
		// int타입 변수 sum 선언하고 초기값 0으로 설정
		int sum = 0;
		
		// 배열 scores의 모든 요소를 하나씩 가져온다
		// score 변수에 배열의 각 요소가 순차적으로 저장
		for (int score : scores) { 
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
		
		// -> scores 배열에 저장된 5개의 정수를 하나씩 가져와 sum 변수에 더하며,
		// 최종적으로 배열의 모든 요소를 합산하여 sum을 구한다.
	}

}
