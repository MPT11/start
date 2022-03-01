package day05.ex;

import java.util.*;

/*문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
*/

public class ex07 {
	public static void main(String[] args) 
	{
		System.out.print("숫자를 입력해주세요 : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int syn = 0;
		
		for(int i = 0 ; i < 5; i++)
		{
			syn = syn + (num%10);
			num = num/10;
		}
		System.out.println("입력하신 숫자의 5자리 합은 : " + syn);
	}

}
