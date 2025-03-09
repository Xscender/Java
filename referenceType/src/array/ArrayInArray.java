package array;

public class ArrayInArray {
    
    public static void main(String[] args) {
        
        // 1️⃣ **고정 크기 2차원 배열 mathScores 생성**
        // - 2개의 행, 각 행에 3개의 열 (2x3 크기의 배열)
        int[][] mathScores = new int[2][3];

        // mathScores 배열 출력 (초기값: 0)
        for (int i = 0; i < mathScores.length; i++) { // 행 반복 (0~1)
            for (int k = 0; k < mathScores[i].length; k++) { // 열 반복 (0~2)
                System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
                // 모든 요소의 기본값은 0
            }
        }
        System.out.println(); // 줄 바꿈

        // 2️⃣ **가변형 2차원 배열 engScores 생성**
        // - 행의 개수(2개)만 먼저 지정
        int[][] engScores = new int[2][];

        // - 각 행의 크기를 다르게 설정
        engScores[0] = new int[2]; // 첫 번째 행(0번 행)은 길이 2
        engScores[1] = new int[3]; // 두 번째 행(1번 행)은 길이 3

        // engScores 배열 출력 (초기값: 0)
        for (int i = 0; i < engScores.length; i++) { // 행 반복 (0~1)
            for (int k = 0; k < engScores[i].length; k++) { // 열 반복 (각 행의 길이만큼 반복)
                System.out.println("engScores[" + i + "][" + k + "]=" + engScores[i][k]);
                // 모든 요소의 기본값은 0
            }
        }
        System.out.println(); // 줄 바꿈

        // 3️⃣ **값을 직접 할당하는 2차원 배열 javaScores 생성**
        // - 행마다 다른 길이를 가진 배열을 직접 초기화
        int[][] javaScores = { {95, 80}, {92, 96, 80} };

        // javaScores 배열 출력 (이미 값이 들어 있음)
        for (int i = 0; i < javaScores.length; i++) { // 행 반복 (0~1)
            for (int k = 0; k < javaScores[i].length; k++) { // 열 반복 (각 행의 길이만큼 반복)
                System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);            
                // 각 요소는 이미 값이 할당됨
            }
        }
    }
}
