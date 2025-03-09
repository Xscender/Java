package verify;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		
		// 문제: 학생 수와 각 학생들의 점수를 입력 받아서, 최고 점수 및 평균 점수 구하는 프로그램
		
		boolean run = true; // while 문 계속 실행할지 결정하는 플래그 변수, 초기값 true
		
		int studentNum = 0; // 학생 수 저장 변수 0으로 초기값 설정
		int[] score = null; // 점수 저장 할 배열, 처음은 null 로 설정
		
		Scanner sc = new Scanner(System.in); // 객체 sc 생성해서 사용자 입력 받도록 한다.
		
		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				score = new int[studentNum]; // 입력받은 학생 수 크기의 배열 생성 -> 학생들의 점수를 저장할 공간 생김
			} else if (selectNo == 2) {
				// 학생 수 만큼 반복하면서 점수를 입력받아 배열에 저장
				for (int i = 0; i < score.length; i++) {
					System.out.print("score[" + i + "]> ");
					score[i] = Integer.parseInt(sc.nextLine()); // 각 학생의 점수를 배열에 저장
				}
			} else if (selectNo == 3) {
				// 배열의 모든 점수 출력
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "]: " + score[i]); // score[i] 사용하여 각 학생 점수 표시
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < score.length; i++) { 
					max = (max < score[i]) ? score[i] : max; // score[i] 값이 max 보다 크다면, max 값을 score[i]로 변경한다.
					sum += score[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
