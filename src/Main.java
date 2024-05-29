public class Main {
    public static void main(String[] args) {
        checkLeapYear(2025);
        checkLeapYear(2024);
        checkLeapYear(2020);

        printVersion(1, 2021);
        printVersion(0, 2014);
        printVersion(1, 2013);
        printVersion(0, 2023);

        int days = calculationOfDelivery(95);
        if (days > 0) {
            System.out.println("Потребуется дней:" + days);
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - невисокосный");
        }
    }

    public static void printVersion(int osType, int year) {
        if (year < 0) {
            System.out.println("Год не может быть меньше 0");
        } else {
            int currentYear = 2015;
            String type;
            if (osType == 1) {
                type = "Android";
            } else {
                type = "iOS";
            }
            String appType;
            if (year < currentYear) {
                appType = " облегченную ";
            } else {
                appType = "";
            }
            System.out.println("Установите" + appType + " версию для системы " + type);
        }
    }

    public static int calculationOfDelivery(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -100;
        }
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }
}



