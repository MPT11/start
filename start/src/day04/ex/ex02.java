package day04.ex;

/*
 * 문제 2]
 * 		알파벳 문자를 임의로 랜덤하게 입력한 후
 * 		그 문자가 대문자이면 소문자로
 * 		소문자이면 대문자로 변환하고
 * 		만약 특수문자이면 그문자 그대로 출력하는
 * 		프로그램을 작성하세요
 */

import java.util.*;

public class ex02 {
	public static void main(String...args) 	
	{
		// 입력 메시지 출력
		System.out.print("문자열 입력 : ");
		// 입력 도구
		Scanner sc = new Scanner(System.in);
		// 변수 저장
		String str = sc.next();
				
		byte[] byte_str = new byte[str.length()];
				
		for(int i = 0; i < str.length(); i++)
		{
			byte_str[i] = (byte)str.charAt(i);
		
			if(byte_str[i] > 64 && byte_str[i] < 91)
			{
				char ch1 = (char)(byte_str[i] + 32);
				System.out.println(str.charAt(i) + " : " + 	ch1);	
			}
			else 
			{
				if(byte_str[i] > 96 && byte_str[i] < 123)
				{
					char ch2 = (char)(byte_str[i] - 32);
					System.out.println(str.charAt(i) + " : " + ch2);
				}
				else
				{
					System.out.println(str.charAt(i) + " : " + str.charAt(i));
				}
			
			}
		}
	}

}
