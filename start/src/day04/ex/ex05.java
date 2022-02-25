package day04.ex;

/*
 * 3자리 숫자(100~999)를 받아서
 * 이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 * 얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요
 * 
 * 예 ]
 * 		241은 200에 가까우므로 41을 빼야한다.
 * 		777은 800에 가까우므로 23을 더해야된다.
 */


//절대값함수이용 가까운수 판별 얼마인지 계산해서 출력
//절대값함수 = abs();
public class ex05 {
	public static void main(String...args)
	{
		int num = (int)(Math.random() * (999 - 100 + 1) + 100);
		int num100 = num / 100;
		int num1 = Math.abs(num100 * 100 - num);
		int num2 = Math.abs((num100+1) * 100 - num);
				
		if(num1 < num2)
		{
			System.out.println("생성된 숫자 " + num + "은 " + (num100*100) + "에 가깝고");
			System.out.println(num1 + "의 숫자를 빼야 합니다");
		}
		else
		{
			System.out.println("생성된 숫자 " + num + "은 " + ((num100+1)*100) + "에 가깝고");
			System.out.println(num2 + "의 숫자를 더해야 합니다");
		}
		
	}

}
