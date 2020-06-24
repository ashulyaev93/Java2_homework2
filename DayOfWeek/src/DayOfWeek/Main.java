package DayOfWeek;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        Scanner in = new Scanner(System.in);//ввод дня недели;
        System.out.print("Введите день недели (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY): ");
        String n = in.nextLine();

        if (n.equals("MONDAY")) {
            System.out.println(DayOfWeek.MONDAY.getDay() + ": осталось " + DayOfWeek.MONDAY.getWorkingHours() + " рабочих часа(ов)");
        } if (n.equals("TUESDAY")) {
            System.out.println(DayOfWeek.TUESDAY.getDay() + ": осталось " + DayOfWeek.TUESDAY.getWorkingHours() + " рабочих часа(ов)");
        } if (n.equals("WEDNESDAY")) {
            System.out.println(DayOfWeek.WEDNESDAY.getDay() + ": осталось " + DayOfWeek.WEDNESDAY.getWorkingHours() + " рабочих часа(ов)");
        } if (n.equals("THURSDAY")) {
            System.out.println(DayOfWeek.THURSDAY.getDay() + ": осталось " + DayOfWeek.THURSDAY.getWorkingHours() + " рабочих часа(ов)");
        } if (n.equals("FRIDAY")) {
            System.out.println(DayOfWeek.FRIDAY.getDay() + ": осталось " + DayOfWeek.FRIDAY.getWorkingHours() + " рабочих часа(ов)");
        } if(n.equals("SATURDAY")) {
            System.out.println(DayOfWeek.DayOfWeekRest.SATURDAY.getDay() + ": " + DayOfWeek.DayOfWeekRest.SATURDAY.getWorkingHours());
        } if(n.equals("SUNDAY")) {
            System.out.println(DayOfWeek.DayOfWeekRest.SUNDAY.getDay() + ": " + DayOfWeek.DayOfWeekRest.SUNDAY.getWorkingHours());
        }
    }
}
