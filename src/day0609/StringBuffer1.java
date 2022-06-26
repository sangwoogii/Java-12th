package day0609;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		String result1 = "";	// String형의 result1 값을 공백(아무것도 없는)으로 지정
		result1 += "Hello";		// result1에 Hello라는 값을 더함
		result1 += " ";			// result1에 공백 값을 더함
		result1 += "world";		// result1에 world라는 값을 더함
		
		System.out.println(result1); // result1 값 출력
		
		// 각각 추가가 된다고 생각하면 됨
		
		System.out.println("-------------------");

		// StringBuffer클래스에 값을 집어넣고 싶으면 StringBuffer클래스가 만들어놓은 메서드를 이용해서 값을 집어넣으면 됨
		// -> StringBuffer클래스에 값을 집어넣을 땐 append라는 단어 사용
		// 기본 16글자로 작성이 가능하지만 append를 사용할때마다 값이 연속적으로 추가가되는 것
		// -> ex) sb.append("good");	sb.append(" ");		sb.append("morning");
		// -> 'good morning'으로 출력 : 공백을 포함하여 12글자를 가지게됨
		// 계속해서 추가가 가능하고 16글자가 넘어가도 연속적으로 값이 추가가되어 이어짐
		// 그렇게되면 성능이 느려질 수 있기 때문에 값을 미리 여유롭게 정해주는 것이 좋음
		
		StringBuffer sb = new StringBuffer();	// StringBuffer 객체생성
		sb.append("good");		// StringBuffer 객체의 참조변수 sb에 'good' 문자 추가
		sb.append(" ");			// StringBuffer 객체의 참조변수 sb에 공백 추가
		sb.append("morning");	// StringBuffer 객체의 참조변수 sb에 'morning' 문자 추가
		
		System.out.println(sb);	// sb 값 출력
		
		System.out.println("-------------------");
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("java");			// append는 값을 뒤로 추가하는 것
//		sb1.insert(0, "hello");		// insert는 추가하고 싶은 값을 기존에 있던 값의 앞부분에 추가됨 (append와 반대) 
		sb1.insert(2, "hello ");	// 인덱스이기 때문에 0번째부터 시작 ->
									// 2번째부터가 아니라 2번째 글자뒤부터 시작 즉, 3번째 글자에 hello라는 단어가 추가,
									// 3번째 글자부터 hello라는 단어가 출력됨
		System.out.println(sb1);
		
		System.out.println(sb1.substring(2, 7));	// substring : 지정되어있는 범위 문자열을 반환
													//			    2번째인덱스부터 7번째인덱스미만까지 출력
		System.out.println(sb1.reverse());			// reverse : 저장되어있는 값(글자)이 거꾸로 출력됨
		
		
	}

}
