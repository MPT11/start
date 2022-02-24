package day03.ex;

/*
 * 문제 2 ]
 * 		하나의 숫자를 입력받은 후(원의 반지름)
 * 		그 숫자를 이용해서 원의 넓이와
 * 		원의 둘레를 계산하고 출력하세요
 */

import java.util.*;

public class ex02 {
	public static void main(String...args) {
		//입력 도구
		Scanner sc = new Scanner(System.in);
		//입력 메시지 출력
		System.out.print("반지름 : ");
		//입력 메시지 정수화
		int radius = sc.nextInt();
		//정수화된 메시지 출력
		System.out.println("입력된 정수 반지름 : " + radius);
		//파이값 규정
		double pi = 3.14;
		//원의 넓이 구하는 함수
		double area = radius * radius * pi;
		//원의 둘레 구하는 함수
		double round = radius * 2 * pi; 
		//원의 넓이 출력
		System.out.println("원의 넓이 : " + area);
		//원의 둘레 출력
		System.out.println("원의 둘레 : " + round);
	}

}
