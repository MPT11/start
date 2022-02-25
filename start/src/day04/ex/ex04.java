package day04.ex;

/*
 * 문제 4]
 * 		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서
 * 		이 숫자를 년도로 하는 해는
 * 		운년인지 평년인지를 판별해서 출력해주는
 * 		프로그램을 작성하세요.
 * 
 * 		참고 ]
 * 			윤년은 4로 나누어 떨어지고
 * 			100으로 나누어 떨어지면 안되나
 * 			예외로 400으로 나누어 떨어지는 해를 윤년이라고한다.
 */

public class ex04 {
	public static void main(String...args)
	{
		int num = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
		int max = 0;
		int max4 = num % 4;
		int max100 = num % 100;
		int max400 = num % 400;
		max = ((max4 == 0) && (max100 == 0) && (max400 == 0) ? 1 : (max4 == 0) && (max100 != 0) && (max400 != 0) ? 1 : 0);
		
		if(max == 1)
		{
			System.out.println(num + "년은 윤년입니다");
		}
		else
		{
			System.out.println(num + "년은 평년입니다");
		}
	}

}
