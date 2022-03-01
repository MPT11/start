package day05.ex;

/*
 * 	문제 9 ]
 * 		+ 1 - 2 + 3 - 4 + 5 - 6 ... 했을경우
 * 		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */

public class ex09 {
	public static void main(String[] args) 
	{
		int sum = 0;
		int i = 0;
		while(sum <= 100)
		{
			i++;
			if(i % 2 == 0)
			{
				sum = sum - i;
			}
			else
			{
				sum = sum+i;
			}
			System.out.println(i + "번째에 합은 : " + sum + "입니다" );
		}
		System.out.println(i + "번째에 합이 100이 넘었습니다");
	}

}
