package yseony.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String WEEK_DAYS = "일월화수목금토";

	public int getMaxDays(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		}
		return MAX_DAYS[month - 1];
	}

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public void printCalendar(int year, int month, String weekday) {
		int maxDays = getMaxDays(year, month);
		int weekNum = WEEK_DAYS.indexOf(weekday);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("-------------------------");
		for (int blank = 0; blank < weekNum; blank++) {
			System.out.print("   ");
		}
		for (int day = 1; day <= maxDays; day++) {
			System.out.printf("%3d", day);
			if ((weekNum + day) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("달력을 출력하시겠습니까? y : 출력 / n : 종료");
			String start = keyboard.next();
			if(start.equals("n")) {
				System.out.println("Have a nice day!");
				break;
			}
			System.out.println("연도를 입력하세요.");
			System.out.print("YEAR> ");
			int year = keyboard.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			int month = keyboard.nextInt();
			System.out.println("첫번째 요일을 입력하세요. (월, 화, 수, 목, 금, 토)");
			System.out.print("WEEKDAY> ");
			String weekday = keyboard.next();

			if (month < 1 || month > 12) {
				System.out.println("1에서 12까지의 숫자를 입력하세요.");
				continue;
			}
			System.out.printf("<%d년 %d월 달력>\n",year,month);
			cal.printCalendar(year, month, weekday);
		}

		keyboard.close();
	}

}