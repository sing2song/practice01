package practice01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "수를 입력하세요 : " );
		int number = scanner.nextInt();
		
		if( number % 3 == 0 ) {
			System.out.println( "3의 배수 입니다." );
			System.out.println("그렇습니다");
		}
		
		scanner.close();
	}
}
