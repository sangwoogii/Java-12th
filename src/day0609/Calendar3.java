package day0609;

import java.util.Calendar;

public class Calendar3 {

	public static void main(String[] args) {
		
		// 둘 다 특정 필드의 값을 증가 또는 감소시키는 메서드
		// add() : 다른 필드에 영향이 있음
		// roll() : 다른 필드에 영향이 없음
		
		Calendar date = Calendar.getInstance();
		date.set(2022, 5, 30); // 2022년 6월 30일
		System.out.println(toString(date)); // 왜 toString을 사용하는 건지 ?
		System.out.println();
		
		System.out.println("-- 1일 후 --");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("-- 8개월 전 --");
		date.add(Calendar.MONTH, -8);
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("-- 31일 후 (roll 사용) --");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

	}
	
	public static String toString(Calendar date) {
		// 메서드로 사용하는 것이기 때문에 main 메서드 밖에서 사용
		// 오버라이딩
		return date.get(Calendar.YEAR) + "년 " +
			   (date.get(Calendar.MONTH)+1) + "월 " +
		       date.get(Calendar.DATE) + "일 ";
	}

}
