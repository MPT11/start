package day05.ex;

/*
 * 	문제 13 ]
 * 		랜덤한 두 수를 입력한 후 
 * 		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
 * 
 * 		최대 공약수 : 두 인자의 최대 값
 */

import java.util.*;

public class ex13 {
	
	public static int gcd(int num1, int num2) 
	{
        if (num1 % num2 == 0) 
        {
            return num2;
        }
        return gcd(num2, num1%num2);
    }

	static int a,b;
	
	public static void main(String[] args)
	{		
	    Scanner s = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력해주세요 : ");
		a = s.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		b = s.nextInt();
		if(b > a)
		{ 
			int temp = b;
			b = a;
			a = temp; 
		} 
		int result = gcd(a, b); 
		System.out.println("최대공약수 = "+ result);
		System.out.println("최소공배수 = "+ a*b / result);
	}

		
		
		/*	
		int min = ( a < b ) ? a : b;
		int max = ( a > b ) ? a : b;
		int gcd = 0;
		
		
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + a * b / gcd);
	}*/

}
