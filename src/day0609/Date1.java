package day0609;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		
		Date now = new Date(); // Date객체 생성
		String strNow1 = now.toString();

		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 원하는 형태로 날짜를 출력하고 싶으면 SimpledateFormat을 사용해 SimpledateFormat의 객체 생성 후
		// 원하는 형태를 집어넣고 값을 출력하면됨 now는 현재시간
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
