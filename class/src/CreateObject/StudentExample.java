package CreateObject;

public class StudentExample { // --> 실행용 클래스

	public static void main(String[] args) {

		Student s1 = new Student(); // new 연산자로 객체 생성하고 리턴된 객체의 번지를 변수에 저장 -> 변수가 객체 참조
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
