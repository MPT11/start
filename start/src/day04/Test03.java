package day04;

import java.util.*;

public class Test03 {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int no = sc.nextInt();
		//2의 2승으로 곱한 값
		int result = no << 2;
		//2의 2승으로 나눈 값
		int result1 = no >> 2;
		//2의 2승으로 나눈 값(음수부호 안건드림)
		int result2 = no >>> 2;
			
		System.out.println("result : "+result);
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
	}
}
