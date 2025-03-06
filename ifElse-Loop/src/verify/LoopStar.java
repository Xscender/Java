package verify;

public class LoopStar {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
				if (j == i) {
					System.out.println();
				}
				
			}
			
		}
		
		System.out.println("================================");
		
		for (int x = 1; x <= 4; x++) {
			
			for (int y = 4; y > 0; y--) {
				
				if (x < y) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
			
		}
	}

}
