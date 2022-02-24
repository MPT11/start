package day03.ex;

/*
 *  84232원을 지불하려고 한다.
 *  우리나라 화폐단위로 이 금액을 지불하려면
 *  각 단위가 몇개씩 필요한지 계산해서 출력하세요.
 *  
 *  화폐단위
 *  	50000
 *  	10000
 *  	5000
 *  	1000
 *  	100
 *  	50
 *  	10
 *  	1
 */
import java.util.*;

public class ex03 {
	public static void main(String...args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신이 지불해야될 금액은 : ");
		int[] divisor = {50000 , 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		int divied = sc.nextInt();
		//int divisor10 = 10;
		//int divisor50 = 50;
		//int divisor100 = 100;
		//int divisor500 = 500;
		//int divisor1000 = 1000;
		//int divisor5000 = 5000;
		//int divisor10000 = 10000;
		//int divisor50000 = 50000;
		
		for (int i=0; i<divisor.length; i++) {
			System.out.println(divisor[i] + " 원권은 " + (divied / divisor[i]) + "입니다");
			divied = (divied % divisor[i]);
		}
		//System.out.println("5만원권은 " + (divied / divisor50000) + "입니다");
		//divied = (divied % divisor50000);
		//System.out.println("1만원권은 " + (divied / divisor10000) + "입니다");
		//divied = (divied % divisor10000);
		//System.out.println("5천원권은 " + (divied / divisor5000) + "입니다");
		//divied = (divied % divisor5000);
		//System.out.println("1천원권은 " + (divied / divisor1000) + "입니다");
		//divied = (divied % divisor1000);
		//System.out.println("500원 동전은 " + (divied / divisor500) + "입니다");
		//divied = (divied % divisor500);
		//System.out.println("100원 동전은 " + (divied / divisor100) + "입니다");
		//divied = (divied % divisor100);
		//System.out.println("50원 동전은 " + (divied / divisor50) + "입니다");
		//divied = (divied % divisor50);
		//System.out.println("10원동전 은 " + (divied / divisor10) + "입니다");
		//divied = (divied % divisor10);
		//System.out.println("1원동전 은 " + (divied / 1) + "입니다");
	}
}
