package day05.ex;

/*
 * 	문제 11 ]
 * 		2x + 4y = 10 의 방정식의 결과를 출력하세요.
 * 		단, x,y는 모두 
 * 			0 <= x , y <= 10
 */

public class ex11 {

	public static void main(String[] args) 
	{
		for(int i = 0 ; i < 6 ; i++)
		{
			for(int j = 0 ; j < 4; j++)
			{
				if((2*i) + (4*j) != 10)
				{
					continue;
				}
				else
				{
					System.out.println("2 *"+ i + " + 4 * " + j + " = 10");
				}
			}
		}
	}

}
