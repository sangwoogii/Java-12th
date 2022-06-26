package day0609;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar4 {

	public static void main(String[] args) {
		
		// Date -> Calendar로 변환
		// (= 하위 호환성에 대한 내용)
		
		// 1. 현재 날짜 date 구하는 객체 생성
		Date date1 = new Date();
		
		// 2. Calendar 객체 생성
		Calendar cal1 = Calendar.getInstance();
		
		// 3. Date객체를 Calendar로 변환 (변환하기 위해선 setTime() 사용)
		// cal1.setTime(date1) : date1 객체를 cal1 객체에 설정하여
		//					  	 date1 객체가 나타내는 날짜와 cal1이 나타내는 날짜가 같도록 함
		cal1.setTime(date1);
		
		// 4. date객체, cal 객체 출력
		System.out.println(date1);
		System.out.println(cal1.getTime());
		
		System.out.println("---------------------------------");
		
		// Calendar -> Date로 변환
		
		// 1. 원하는 날짜로 객체 생성
		// 2022년 6월 9일 (GregorianCalendar : 서양력 달력에 해당 / import 필요)
		Calendar cal2 = new GregorianCalendar(2022, 5, 9);
		
		// 2. Calendar를 Date로 변경
		Date date2 = cal2.getTime();
		
		// 3. Date 출력
		// 현재날짜를 기준으로 값을 출력해야 하기 때문에 date1 입력
		System.out.println(date1);
	}

}
