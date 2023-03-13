package Date;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DateCheck {
	public static void checkDataDate(int year, int month, int day) {
		if (year <= 0 || month < 0 || month > 12 || day < 1 || day > 31) {
			System.out.println("Data invaild");
			return;
		}
		if (month == 2 && (year % 4 == 0 || year % 400 == 0)) {
			if (day > 29) {
				System.out.println("Date invalid");
				return;
			}
			System.out.println("Data valid");
			return;
		}
		if (month == 2) {
			if (day > 28) {
				System.out.println("Data invalid");
				return;
			}
			System.out.println("Data vaild");
			return;
		}
		if (month == 4 || month == 6 || day == 9 || day == 11) {
			if (day > 30) {
				System.out.println("Data invalid");
				return;
			}
			System.out.println("Data valid");
			return;

		}
		if (day > 31) {
			System.out.println("Data invalid");
			return;
		}
		System.out.println("Data valid");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Nam: ");
		int year = sc.nextInt();
		System.out.println("Nhap Thang: ");
		int month = sc.nextInt();
		System.out.println("Nhap Ngay: ");
		int day = sc.nextInt();
		checkDataDate(year, month, day);
	}
}
