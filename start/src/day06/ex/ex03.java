package day06.ex;

/*
 *  문제 3 ]
 *  	1 1 1 1 1
 *  	2 2 2 2 2
 *  	3 3 3 3 3
 *  	4 4 4 4 4
 *  	5 5 5 5 5
 *  
 *  	1 2 3 4 5
 *  	1 2 3 4 5
 *  	1 2 3 4 5
 *  	1 2 3 4 5
 *  	1 2 3 4 5
 *  
 *  	1 2 3 4 5
 *  	2 3 4 5 6
 *  	3 4 5 6 7
 *  	4 5 6 7 8
 *  	5 6 7 8 9
 *  
 *  	 1  2  3  4  5
 *  	 6  7  8  9 10
 *  	11 12 13 14 15
 *  	16 17 18 19 20
 *  	21 22 23 24 25
 *  
 *  	1
 *  	1 2
 *  	1 2 3
 *  	1 2 3 4
 *  	1 2 3 4 5
 *  
 *  	 1
 *  	 2  3
 *  	 4  5  6
 *  	 7  8  9 10
 *  	11 12 13 14 15
 */

public class ex03 
{
	public static void main(String...args)
	{
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j < 6; j ++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j < 6; j ++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j < 6; j ++)
			{
				System.out.print((j+i-1) + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j < 6; j ++)
			{
				System.out.print((j + ((i-1) *5)) + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j <= i; j ++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int sum = 0;
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j <= i; j ++)
			{
				sum++;
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
	}
}
