package day06.ex;

/*
 * 	문제 2 ]
 * 		두 사람이 등산을 한다.
 * 		한 사람은 산 입구에서 0.54m/s 속도로 등산을 시작하고
 * 		한 사람은 정상에서 1.07m/s속도로 내려온다.
 * 		산의 높이가 7564m라고 한다면
 * 		두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요.
 */

public class ex02 
{
	static double a , b;
	public static void main(String...args)
	{
		a = 0.54;
		b = 1.07;
		double dis = 0;
		
		for(int i = 0 ; ; i++)
		{
			if(dis >= 7564)
			{
				System.out.println(i + "초 이후 만납니다");
				break;
			}
			dis = ((a + b) * i) + dis;
		}
		
	}
}
