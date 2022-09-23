package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    // Create a program to check whether a year is a leap year or not
    // ("leap" if true otherwise "not leap").
    // Year will be passed as argument in method parameter:
    public void isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
