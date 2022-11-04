package yseony.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDays(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalendar(int month) {
		int maxDays = getMaxDays(month);
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("------------------");
		for(int day = 1; day <= maxDays; day++) {
			System.out.printf("%3d", day);
			if(day % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print("> ");
			int month = keyboard.nextInt();

			if (month == -1) {
				System.out.println("Have a nice day!");
				break;
			} 
			if (month < 1 || month > 12) {
				System.out.println("1에서 12까지의 숫자를 입력하세요.");
				continue;
			} 
			cal.printCalendar(month);
		}
		
		keyboard.close();
	}

}