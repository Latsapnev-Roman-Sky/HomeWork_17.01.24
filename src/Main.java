public class Main {
    public static void main(String[] args) {

        //Task 1
        int year = 2024;
        checkLeapYear(year);
    }
    public static void checkLeapYear (int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}