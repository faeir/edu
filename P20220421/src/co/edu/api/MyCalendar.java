package co.edu.api;

import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {
		String y = "2022";
		String m = "07";

		showCal(y, m);

	}

	public static void showCal(String year, String month) {
		// 달력 출력
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("\t[" + year + "년 " + month + "월]");
		System.out.println(" Sun Mon Tue Wed Thr Fri Sat");
		System.out.println("===========================");

		for (int i = 0; i < week; i++) {
			System.out.printf("%3s","");
				}
		for (int j = 0; j < cal.getActualMaximum(cal.DATE); j++) {
			System.out.printf("%4d", j+1);
			if (week % 7 == 0)
			System.out.println("");
			week++;
		}
	}

}
