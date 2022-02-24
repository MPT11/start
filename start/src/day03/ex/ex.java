package day03.ex;


/*
 * 문제 1 ]
 * 	두개의 숫자를 입력받은 후 (가로,세로)
 * 	그 숫자를 이용해서 삼각형의 넓이와 삼각형의 넓이를 구해서
 * 	결과를 출력하시오.
 * 
 * 	출력형식 ]
 * 		
 * 		가로 : XXXXXX
 * 		세로 : XXXXXX
 * 		사각형 넓이 : XXXXXXX
 * 		삼각형 넓이 : XXXX.X
 * 
 * 	참고 ]
 * 		자바에서 *기호의 의미
 * 			연산자로서 곱하기 의미
 * 			모든것을 의미하기도함
 */

import java.util.*;



public class ex {
	public static void main(String...args) {
		//입력 도구
		Scanner sc = new Scanner(System.in);
		
		//입력 메시지 출력
		System.out.print("가로 : ");
		//String width01 = sc.nextLine(); //문자열로 받음
		//정수 형태의 문자열을 정수로 변환하는 방법
		//Integer.parseInt(문자열);
		
		int width = sc.nextInt();
		
		System.out.println("입력된 정수 가로 : " + width);
		
		System.out.println("세로 : ");
		
		int length = sc.nextInt();
		
		System.out.println("입력된 정수 세로 : " + length);
		
		int square = width * length;
		
		float tri = width * length * (float)0.5;
		
		System.out.println("사각형의 넓이는 : " + square);
		System.out.println("삼각형의 넓이는 : " + tri);
		
		
		
		
		//int width = Integer.parseInt(width01);
		//출력
		//System.out.println("입력된 가로 : " + width01);
		//System.out.println("입력된 가로 : " + (width01+20));
		//System.out.println("입력된 가로 : " + (width+20));
		
		
	}

}
