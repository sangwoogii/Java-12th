package day0609;

public class Wrapper1 {

	public static void main(String[] args) {
		
		// 문자열 -> 기본형으로 바꿀 때
		// 100이라는 문자를 int의 값으로 바꿈
		int i = Integer.parseInt("100");
		
		// 문자열 -> 래퍼클래스로 변환할 때
		// 래퍼클래스는 valueOf 사용 가능
		// 100이라는 문자는 래퍼클래스 Integer타입의 변수 n에 저장
		Integer n = Integer.valueOf("100");

		
		// Boxing : 기본타입 -> 래퍼클래스로 변환하는 것 (포장한다는 의미)
		
		// Integer의 밑줄 : 실행은 가능하지만 사용을 권장하지 않음.
		// Integer 타입의 변수 obj1,2의 객체 생성 (정수, 문자) -> Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		
		// Boxing을 사용할 땐 valueOf 사용
		Integer obj3 = Integer.valueOf("300");
		
		System.out.println(obj1 + obj2 + obj3);
		
		
		// Unboxing : 래퍼 클래스 -> 기본형으로 변환하는 것 (포장을 푼다는 의미)
		// obj 즉 래퍼클래스를 다시 기본형으로 사용한다는 의미
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1 + value2 + value3);
	}

}
