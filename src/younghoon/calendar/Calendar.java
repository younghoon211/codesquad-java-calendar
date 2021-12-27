package younghoon.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		System.out.println(" 일 월  화 수  목 금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 달의 최대 일수를 출력하는 프로그램
		System.out.println("궁금한 최대 일수의 달을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		int[] d = {30, 31, 29, 30, 30, 31, 29, 28, 29, 30, 31, 31};
		//int day = d[month-1];
		System.out.printf("%d월의 최대 일수는 %d일 입니다." ,month,d[month-1]);
		
		
	}
}
