package yseony.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.");
		int userNum1 = keyboard.nextInt();
		int userNum2 = keyboard.nextInt();
		
		// 출력 : 화면에 두 수의 합을 출력한다.
		System.out.printf("두 수의 합은 %d입니다.", userNum1 + userNum2);
		
		keyboard.close();
	}

}
