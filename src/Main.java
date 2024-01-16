public class Main {
    public static void main(String[] args) {

        //Task 1
        int year = 2024;
        checkLeapYear(year);

        //Task 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        checkClientDeviceYear(clientOS, clientDeviceYear);
    }
    public static void checkLeapYear (int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkClientDeviceYear (int clientOS, int clientDeviceYear) {
        int yearOS = 2015;
        if (clientOS == 0 && clientDeviceYear < yearOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= yearOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < yearOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= yearOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректная ОС");
        }
    }
}