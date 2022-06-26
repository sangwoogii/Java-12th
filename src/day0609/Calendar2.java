package day0609;

import java.util.Calendar;

public class Calendar2 {

	public static void main(String[] args) {
		
		// 요일표시 (일요일부터 1번으로 표시하는데 배열이기 때문에 0번자리엔 공백으로 선언)
		final String [] WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
//		System.out.println(date1);
		
		// 어떠한 날짜를 설정하기 위해선 초기화를 사용하는 것이 좋음
		// 날짜를 초기화 하는 방법, 초기화하면 time부분에 ?로 표시됨
		date1.clear();  
//		System.out.println(date1);
		
		
		// 가져오는 것 = get
		// 설정하는 것 = set
		
		
		// 날짜 '설정' => 'set' 사용, 타입은 int형
		date1.set(2022, 3, 10); // 2022년 4월 10일
		System.out.println("date1은 " + toString(date1) + WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
		System.out.println("오늘(date2)은 " + toString(date2) + WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		
		System.out.println("오늘(date2)는 올해가 시작하고 난 뒤 " + date2.get(Calendar.WEEK_OF_YEAR) + "번째 주 입니다.");
		
		// 두 날짜의 차이
		// 밀리초로 변환하여 계산
		// 큰 날짜 - 작은 날짜
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("date1에서 date2까지 " + diff + "초가 지났습니다.");
		System.out.println("일 수로 계산하면 " + diff / (60*60*24) + "일입니다.");
	}
	
	public static String toString(Calendar date) {
		// 메서드로 사용하는 것이기 때문에 main 메서드 밖에서 사용
		// 오버라이딩
		return date.get(Calendar.YEAR) + "년 " +
			   (date.get(Calendar.MONTH)+1) + "월 " +
		       date.get(Calendar.DATE) + "일 ";
	}

}
