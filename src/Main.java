import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        chekLeapYear(2025);
        chekLeapYear(2024);
        chekLeapYear(2020);
        printVersion(1, 2021);
        printVersion(0, 2024);
        int days = calculationOfDelivery(20, 0);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }


    }

    public static void chekLeapYear(int year) {
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
            int currentYear = LocalDate.now().getYear();
            String type;
            if (osType == 1) {
                type = "Android";
            } else {
                type = "iOS";
            }
            String appType;
            if (year < currentYear) {
                appType = "облегченную ";
            } else {
                appType = "";
            }
            System.out.println("Установите " + appType + " версию для системы " + type);
        }
    }

    public static int calculationOfDelivery(int deliveryDistance, int days) {
        if (deliveryDistance > 100) {
            return -1;
        }
        if (deliveryDistance < 20) {
            days++;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days++;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days++;
        }
        return days;
    }
}