package epam.learning.ex1_10;

public enum DayOfWeek {
    MONDAY ("Monday"),
    TUESDAY ("Tuesday"),
    WEDNESDAY ("Wednesday"),
    THURSDAY ("Thursday"),
    FRIDAY ("Friday"),
    SATURDAY ("Saturday"),
    SUNDAY ("Sunday");

    public String dayOfWeek;

    private DayOfWeek (String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek () {
        return dayOfWeek;
    }
}
