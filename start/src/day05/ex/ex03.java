package day05.ex;

/*
 * 문제3 ]
 * 		문자열을 입력받아서
 * 		문자를 한글자씩 추출해서 출력하세요
 * 
 * 		참고 ] 
 * 			문자열의 길이를 알아내는 방법
 * 
 * 			int 변수 = 문자열.length();
 */

import java.util.*;

public class ex03 {
	public static void main(String...args)
	{
		System.out.print("문자열 입력 : ");
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
				
		for(int i = 0 ; i < str.length(); i++)
		{
			System.out.print(str.charAt(i) + " ,");
		}
	}

}
