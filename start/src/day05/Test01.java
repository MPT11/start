package day05;

/*
 *  정수를 입력받아서
 *  그 숫자가 짝수인지 홀수인지 판별해서 출력하세요.
 */
import java.util.*;

public class Test01 {
	public static void main(String...args)
	{
		//입력 메시지 출력
		System.out.print("정수를 입력해주세요 : ");
		
		//입력 도구
		Scanner s = new Scanner(System.in);
				
		//입력 받아서 변수에 기억
		int num = s.nextInt();
		
		//판별
		String re = "정수";
		
		/*
		 * if(num == 0) { re = "0"; } if(num != 0 && num % 2 == 0) { re = "짝수"; } if(num
		 * != 0 && num % 2 == 1) { re = "홀수"; }
		 */
		if(num != 0)
		{
			if(num % 2 == 0)
			{
				re = "짝수";
			}
			if(num % 2 == 1)
			{
				re = "홀수";
			}
		}
		else
		{
			re = "0";
		}
		
		//결과 출력
		System.out.println("입력받은 정수는 : " +re );
		
		
	}

}
