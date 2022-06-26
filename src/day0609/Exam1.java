package day0609;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		// 문자 맞추기 게임

		// 1. Scanner를 사용하여 내가 입력할 값 선언
		Scanner scan = new Scanner(System.in);
		
		// 2. 단어 목록 만들기 (배열로 선언하여 추측할 수 있는 값 저장)
		// 실행했을 때 6개의 단어 중 무작위로 하나의 단어가 나와야하기 때문에 Math.random을 이용
		// Math.random은 int형으로 작성
		String [] words = {"java", "count", "school", "book", "student", "programmer"};
		int index = (int)(Math.random() * 6);
		// int index1 = (new Random()).nextInt(words.length);
		
		// 3. 글자를 골라오는 코드작성
		// 6개 중 임의의 단어가 String형 text라는 변수에 저장하고
		// StringBuffer를 이용해 text의 길이만큼 객체로 사용하겠다라는 의미
		String text = words[index]; 
		StringBuffer answer = new StringBuffer(text.length());
		
		// 4. 글자의 개수만큼 밑줄 긋기 (for문 사용)
		for (int i=0; i<text.length(); i++) { // i가 text의 길이만큼 
			answer.append("_");
		}
		
		// 5. 게임 실행
		while (true) { // 횟수가 정해져있지 않아 무한반복
			System.out.println("현재의 상태 : " + answer);
			
			if (text.equals(answer.toString())) {
				// text는 String -> 두개의 값을 비교하기 위해 equals 사용
				break;
			}
			
			System.out.print("글자를 맞춰보세요 > ");
			
			// char형의 참조변수 s를 내가 직접 입력하는 것으로 설정하고
			// 한글자씩 맞추어야 하기 때문에 charAt을 사용하여 0번째, 즉 첫번째 글자를 가져온다
			char s = scan.next().charAt(0);
			
			for (int i=0; i<text.length(); i++) {
				if (s == text.charAt(i)) {
					answer.setCharAt(i, s); // setCharAt이란 ?
				}
			}
			
//			scan.close();
		}
	}
}
