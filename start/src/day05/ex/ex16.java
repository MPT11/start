package day05.ex;


/*
	1 부터 정수를 더해갔을때 그합이 5000을 초과하는 수는 몇부터인지 출력하세요.
	
	힌트 ]
		처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/

public class ex16 {
	
	static int num,sum;
	
	public static void main(String...args)
	{
		num = 0 ;
		sum = 0 ;
		
		while(sum <= 5000)
		{
			num++;
			sum = num+sum;
			System.out.println(num + "번째 숫자까지의 합은 : " + sum);
		}
		System.out.println("합이 5000을 넘어가는 첫번째 수는 : " +num);
	}

}
