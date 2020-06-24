package DayOfWeek;

public enum DayOfWeek {

    MONDAY("Понедельник", 40), TUESDAY("Вторник", 32), WEDNESDAY("Среда", 24), THURSDAY("Четверг", 16), FRIDAY("Пятница", 8);

    private String day;
    private int hours;

    public String getDay() {
        return day;
    }

    public int getWorkingHours() {
        return hours;
    }

    DayOfWeek(String day, int hours) {
        this.day = day;
        this.hours = hours;
    }

    public enum DayOfWeekRest {

        SATURDAY("Суббота", "Выходной"), SUNDAY("Воскресенье", "Выходной");

        private String day;
        private String rest;

        public String getDay() {
            return day;
        }

        public String getWorkingHours() {
            return rest;
        }

        DayOfWeekRest(String day, String rest) {
            this.day = day;
            this.rest = rest;
        }
    }
}
