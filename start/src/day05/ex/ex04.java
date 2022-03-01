package day05.ex;

/*
 * 문제 4 ]
 * 		전기요금을 계산해주는 프로그램을 작성하세요.
 * 
 * 		전기요금표
 * 
 * 							코드	기본요금	사용요금
 * 					가정용	1		3800		245
 * 					산업용	2		2400		157
 * 					교육용	3		2900		169
 * 					상업용	4		3200		174
 * 
 * 		전기요금은
 * 			기본요금 + 사용량 * 사용요금
 * 
 * 		사용자 코드와 사용량을 입력하면
 * 		전기요금을 게산해서 출력해주는 프로그램을 작성하세요
 */

import java.util.*;

public class ex04 {

	public static void main(String[] args)
	{
		System.out.print("사용자 코드와 사용량을 space바를 이용하여 입력해주세요 : ");
		Scanner s = new Scanner(System.in);
		int code = s.nextInt();
		int use = s.nextInt();
		int total = 0;
		
		switch(code)
		{
		case 1 : total = 3800 + (245 * use);
		case 2 : total = 2400 + (157 * use);
		case 3 : total = 2900 + (169 * use);
		case 4 : total = 3200 + (174 * use);
		}
		
		System.out.println("당신의 이번달 전기료는 : " + total + "원 입니다");
	}

}
