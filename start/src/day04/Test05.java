package day04;

/*
 * 1 ~ 25 사이의 정수를 랜덤하게 발생시켜서
 * 그 숫자가 짝수인지 홀수인지를 판별해서
 * 출력하세요
 * 
 * 참고 ]
 * 		특정 범위 내의 랜덤한 숫자 발생시키는 방법
 * 		Math 클래스 내에 0 이상 1 미만 실수를 발생시켜주는 함수
 * 			Math.random()
 * 
 * 형식 ]
 * 		
 * 		a ~ b 사이에 랜덤한 정수 (a<b)
 * 		(int)(Math.random() * ( b - a + 1) + a)
 */

public class Test05 {
	public static void main(String...args) {
		//임의의 정수 생성
		int num = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 숫자 판별
		String re = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(num +"은 " + re +"입니다");
		
		// 출력
				
	}
}
