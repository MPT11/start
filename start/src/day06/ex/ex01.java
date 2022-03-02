package day06.ex;

/*
 *  문제 1 ]
 *  	3 ~ 100 사이의 정수를 입력 받아서
 *  	이 정수가 소수인지 판단하는 프로그램을 작성하세요.
 *  	
 *  	참고 ]
 *  		소수 : 1과 자신으로만 나누어지는 수
 *  
 *  	보너스 ]
 *  		3 ~ 100사이의 숫자 중에서 소수만 모두 출력하세요.
 */

import java.util.*;

public class ex01 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("3 ~ 100 사이의 정수를 입력해주세요 : ");
		
		prime(s.nextInt());
	}
	
	public static void prime(int num)
	{
		if(num < 2)
		{
			System.out.println(num + "은 소수가 아닙니다");
			return;
		}
		if(num == 2)
		{
			System.out.println(num + "은 소수가 맞습니다");
			return;
		}
		
		for(int i = 2 ; i < num ; i++)
		{
			if(num % i == 0)
			{
				System.out.println(num + "은 소수가 아닙니다");
				return;
			}
			System.out.println(num + "은 소수가 맞습니다");
			return;
		}
	}

}
