package day05.ex;

/*
 * 1~10까지의 합을 구해서 출력해주는 프로그램을 작성하세요.
 */

public class ex01 {
	public static void main(String[] args) 
	{
		int sum = 0;
		
		for(int i = 0 ; i < 10; i ++)
		{
			sum = sum + (i+1);
		}
		
		System.out.println("1~10까지의 합은 " + sum + "입니다");
		
		int mul = 1;
		for(int i = 0 ; i <10 ; i++)
		{
			mul = mul *(i+1);
		}
		
		System.out.println("1~10까지의 곱은 " + mul + "입니다");
	}

}
