package day04.ex;

/*
 * 문제 1]
 * 		숫자 3개를 랜덤하게 발생시켜서
 * 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 * 
 * 		단, 3항 연산자를 사용해서 처리하세요.
 */
public class ex01 {
	public static void main(String...args) {
	//숫자1 생성
	int num00 = (int)(Math.random() * (100 - 1 + 1) + 1);
	//숫자2 생성
	int num01 = (int)(Math.random() * (100 - 1 + 1) + 1);
	//숫자3 생성
	int num02 = (int)(Math.random() * (100 - 1 + 1) + 1);
	
	//생성된 숫자 출력
	System.out.println("생성된 세 숫자는 : " + num00 + ", " + num01 + ", " + num02);
	
	//비교 3항 연산자
	int max = 0;
	max = ((num00 > num01) && (num00 > num02)) ? num00 : ((num01 > num00) && (num01 > num02)) ? num01 : num02;
	
	System.out.println("생성된 세 숫자중 가장 큰 숫자는 : " + max);
	}
}
