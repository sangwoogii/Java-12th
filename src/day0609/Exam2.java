package day0609;

import java.util.Random;

// 주사위를 던지는 클래스
class Game {
	private int sides;	// 주사위 면의 개수
	private static Random rand = new Random();
	
	public Game(int sides) {
		this.sides = sides;
	}
	
	public int roll() { // 게임을 실행하는 메서드생성
//		return (int)(Math.random() * 6) +1; // 1부터 6까지 나와야하기 때문에 +1
		return rand.nextInt(sides) + 1;
	}
}

public class Exam2 {

	public static void main(String[] args) {

		// 두 개의 주사위를 던져 그 합을 출력하는 프로그램 작성
		// 두 주사위를 100번 던졌을 때
		// 주사위의 합을 출력하시오.

		Game gameA = new Game(6); // 총 6개의 면을 던질 수 있는 gameA변수 생성
		Game gameB = new Game(6); // 총 6개의 면을 던질 수 있는 gameB변수 생성
			
		// 주사위 A와 B의 합계를 계산할 배열 생성 (0 ~ 12까지의 배열 수)
		int [] counts = new int [13]; 
		
		// 주사위를 100번 던지는 코드 (for문)
		for (int i=0; i<100; i++) {
			int a = gameA.roll();
			int b = gameB.roll();
			int sum = a + b;
			counts[sum]++;
		}
		
		// 결과 출력 코드 (for문)
		// 두 수의 합이 최소 2이기 때문에 2로 시작
		for (int i=2; i<counts.length; i++) {
			// 숫자로 결과 값 표시
			// System.out.printf("%d : %d\n", i, counts[i]);
			
			// 결과 횟수만큼 "#" 표시
			// printf %2d는 두자리수 자리 맞추기 (%d사이에 맞출 글자 수 입력)
			System.out.printf("%2d : ", i);
			
			for (int j=0; j<counts[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
