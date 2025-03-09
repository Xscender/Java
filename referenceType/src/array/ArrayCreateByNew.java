package array;

public class ArrayCreateByNew {

	public static void main(String[] args) {

		int[] arr1 = new int[3]; // 길이가 3인 arr1 배열(int[]) 생성 후 기본값 0으로 초기화
		for (int i = 0; i < 3; i++) {
			System.out.println("arr[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		
	}

}
