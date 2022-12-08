import java.time.LocalDate;

public class Main {
    // метод к 1 задаче:
    public static boolean checkYearOnLeap( int year ) {
        boolean isYearleap;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isYearleap = true;
        } else {
            isYearleap = false;
        }
        return isYearleap;
    }
    //
    // метод к 2 задаче:
    public static String checkPhoneSystemYear( int system, int phoneYear ) {
        int currentYear = LocalDate.now().getYear();
        String a;
        if (system == 0) {
            if (phoneYear < currentYear) {
                a = "Установите облегченную версию приложения для Android по ссылке";
            } else {
                a = "Установите версию приложения для Android по ссылке";
            }
        } else {
            if (phoneYear < currentYear) {
                a = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                a = "Установите версию приложения для iOS по ссылке";
            }
        }
        return a;
    }
    //
    // метод к 3 задаче:
    public static String checkDistance(int distance){
        String deliveryDays;
        if (distance > 0 && distance < 20) {
            deliveryDays = "Потребуется дней: 1";
        } else if (distance >= 20 && distance < 60) {
            deliveryDays = "Потребуется дней: 2";
        } else if (distance > 60 && distance <= 100) {
            deliveryDays = "Потребуется дней: 3";
        } else {
            deliveryDays = "Извините, доставка в ваш регион не может осуществиться на данный момент.";
        }
        return deliveryDays;
    }
    public static void main( String[] args ) {
        task1();
        task2();
        task3();
    }
    // задача 1
    public static void task1(){
        System.out.println("Задача 1");
        int year = 2003;
        if (checkYearOnLeap(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
    // задача 2
    public static void task2(){
        System.out.println("задача 2");
        int year2 = 2021;
        int system2 = 0;
        System.out.println(checkPhoneSystemYear(system2, year2));
    }
    // задача 3
    public static void task3(){
        System.out.println("задача 3");
        int delivery = 95;
        System.out.println(checkDistance(delivery));
    }
}