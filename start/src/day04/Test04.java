package day04;

import java.util.*;

/*
 * 정수를 입력받아서
 * 짝수인지 홀수인지를 판별하세요
 * 단, 0은 짝수로 간주한다.
 */

public class Test04 {
	public static void main(String...args) {
		// 입력 도구
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.print("정수 입력 : ");
		// 입력 정수를 변수에 기억
		int num = sc.nextInt();
		// 판별문
		int remain = num % 2;
		
		String re = (remain == 0 ) ? "짝수입니다":"홀수입니다";
		
		System.out.println(num +"은 " + re +"입니다");
		
		
	}

}
