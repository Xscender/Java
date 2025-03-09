package array;

public class ArrayReferenceObject {

	public static void main(String[] args) {

		// String 타입의 배열을 선언하고, 크기가 3인 배열을 생성
		String[] strArray = new String[3];
		/*
		String[] strArray;
		→ 문자열을 저장할 수 있는 배열을 선언
		→ strArray라는 이름의 문자열 배열 변수를 생성

		= new String[3];
		→ 크기가 3인 새로운 문자열 배열을 생성
		→ 초기값은 null (String은 참조형 타입이므로 기본값 null이 들어감)

		최종적으로 strArray는 String 값을 3개 저장할 수 있는 배열이 됨.
		 */
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1] );
		System.out.println( strArray[0] == strArray[2] );
		System.out.println( strArray[0].equals(strArray[2]) );
		
	}

}
