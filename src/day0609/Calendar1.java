package day0609;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		// 연,월,일을 떼오기 위해서 각각의 필드를 이용해 출력
		// 값을 가져오는 것이기 때문에 'get' 사용
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1; 	// 월은 0부터 1월이기 때문에 +1을 해주어야함
		int day = now.get(Calendar.DAY_OF_MONTH);	// DAY_OF_MONTH와 DATE는 거의 동일함 
		
		System.out.printf("%d년 %d월 %d일 ", year, month, day);

		
		// 요일 확인
		int week = now.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week); // -> 이렇게만 쓰면 5가 나옴 (일 월 화 수 목 = 5)
		
		// 숫자 말고 '목요일' 로 출력하고 싶을 때
		String strWeek = null;	// String 타입의 strWeek 변수를 null로 설정
		switch (week) { // 1부터 일요일로 시작하기 때문에 case 1부터 작성
		case 1:
			strWeek = "일요일";
			break;
		case 2:
			strWeek = "월요일";
			break;
		case 3:
			strWeek = "화요일";
			break;
		case 4:
			strWeek = "수요일";
			break;
		case 5:
			strWeek = "목요일";
			break;
		case 6:
			strWeek = "금요일";
			break;
		case 7:
			strWeek = "토요일";
			break;
		}
		
		System.out.print(strWeek);
		
		// 오전, 오후 확인하는 필드
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			System.out.print(" 오전 ");
		} else {
			System.out.print(" 오후 ");
		}
		
		// 시, 분, 초 확인하는 필드
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%d시 %d분 %d초 ", hour, minute, second);
	}

}
