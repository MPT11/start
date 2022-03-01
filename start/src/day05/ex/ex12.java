package day05.ex;

import java.util.Scanner;

/*
 * 	문제 12 ]
 * 		5자리 숫자 하나를 입력받아서
 * 		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요
 * 		
 * 		참고 ] 
 * 			회문수란 ?
 * 				첫번째 자리수와 마지막 자리수
 * 				두번째 자리수와 마지막에서 두번째 자리수
 * 				...
 * 				가 동일한 수를 말한다.
 */

public class ex12 {

	public static void main(String[] args) 
	{
		System.out.print("다섯자리 숫자를 입력해주세요 : ");
		Scanner s = new Scanner(System.in);
		String str = s.next();		
		
		if(str.charAt(0) == str.charAt(4))
		{
			if(str.charAt(1) == str.charAt(3))
			{
				System.out.println(str + "은 회문수입니다");
			}
			else
			{
				System.out.println(str + "은 회문수가 아닙니다");
			}
		}
		else
		{
		System.out.println(str + "은 회문수가 아닙니다");
		}
	}

}
