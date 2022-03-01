package day05.ex;

import java.util.*;

/*
 * 문제 8 ]
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환후 처리하세요.
		Character.getNumericValue(char) = 문자를 숫자로
*/

public class ex08 {
	public static void main(String[] args) 
	{
		System.out.print("숫자를 입력해주세요 : ");
		Scanner s = new Scanner(System.in);
		String str = s.next();		
		int sum = 0;
				
		for(int i = 0 ; i < 5 ; i++)
		{
			sum = Character.getNumericValue(str.charAt(i)) + sum;
		}
		System.out.println("숫자의 각 자리수의 합은 : " +sum);
		
	}

}
