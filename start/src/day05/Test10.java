package day05;

//구구단 5단을 출력하는데 곱이 5인경우는 제외하고 출력하세요

public class Test10 {

	public static void main(String[] args)
	{
		int num = 5 ;
		
		for(int i = 0 ; i < 9 ; i ++)
		{
			int mul = (i + 1);
			if(mul == 5)
			{
				continue;
			}
			
			System.out.println(num + " x " + mul + " = " + (num * mul));
		}
	}

}
