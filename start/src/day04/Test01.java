package day04;

/*
 * 정수 하나를 입력받아서
 * 이 수가 0인지 홀수인지 짝수인지를 판별하세요.
 * 
 * 참고 ]
 * 		조건문
 * 		
 * 		if(조건식) {
 *				조건식이 참일경우 실행하는부분
 *				실행내용
 *		}
 */

import java.util.*;

public class Test01 {
	public static void main(String...args){
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력받기전에 입력 메시지 출력
		System.out.print("정수 입력 : ");
		// 입력받아서 정수를 변수에 기억
		int num = sc.nextInt();
		// 조건에 따라서 판별
		// 내용 출력
		int remain = num % 2;
		String rem = " ";
		
		if(num != 0) {
				switch(remain) {
				case 1 : rem = "이수는 홀수입니다";
						break;
				case 0 : rem = "이수는 짝수입니다";
						break;
				}
		}
		else {
			rem = "0은 사용할수없습니다";
		}
		System.out.println(rem);
	}

}
