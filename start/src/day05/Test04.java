package day05;

/*
   나이를 입력받아서
   	유년기
   	10대
   	20대
   	30대
   	40대
   	장년층
   으로 구분해서 출력하세요
 */

import java.util.*;

public class Test04 {

	public static void main(String[] args) 
	{
		System.out.print("나이를 입력해 주세요 : ");
		
		Scanner s = new Scanner(System.in);
		
		int age = s.nextInt();
		
		String sage = "장년층";
		
		int gen = age / 10 * 10;
		switch(gen)
		{
		case 0:
			sage = "유년기";
			break;
		case 10:
			sage = "10대";
			break;
		case 20:
			sage = "20대";
			break;
		case 30:
			sage = "30대";
			break;
		case 40:
			sage = "40대";
			break;
		default:
			sage = "장년층";
			break;
		}
		
		System.out.println("당신의 연령층은 " + sage + "입니다");
	}

}
