package day05;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 메시지 출력
				System.out.print("정수를 입력해주세요 : ");
				
				//입력 도구
				Scanner s = new Scanner(System.in);
						
				//입력 받아서 변수에 기억
				int num = s.nextInt();
				
				//판별
				String re = "정수";
				
		
				if(num == 0)
				{
					re = "0";
				}
				else
				{
					if(num % 2 == 0)
					{
						re = "짝수";
					}
					else
					{
						re = "홀수";
					}
				}
				
				//결과 출력
				System.out.println("입력받은 정수는 : " +re );
				
	}

}
