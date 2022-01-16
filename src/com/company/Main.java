package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // #1
        System.out.println("Задача №1");
        byte clientOS = 0; //0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // #2
        System.out.println("\nЗадача №2");

        int clientDeviceYear = 2015;
        String message = "Установите";

        message += (clientDeviceYear >= 2015) ? " " : " облегченную ";
        message += "версию приложения для ";
        message += (clientOS == 1) ? "Android" : "iOS";
        message += " по ссылке.";

        System.out.println(message);

        // #3
        System.out.println("\nЗадача №3");
        int currentYear = 2100;

        if ( ((currentYear % 100 == 0) && (currentYear % 400 == 0)) || ((currentYear % 100 != 0) && (currentYear % 4 == 0)) )
            System.out.println(currentYear + " год является високосным.");
        else
            System.out.println(currentYear + " год не является високосным.");

        // #4
        System.out.println("\nЗадача №4");

        int deliveryDistance = 195;

        int deliveryDays = 1; // Доставка в пределах 20 км занимает сутки.
        if (deliveryDistance >= 20) //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
            deliveryDays += 1;
        if (deliveryDistance >= 60) //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
            deliveryDays += 1;

        if ( (deliveryDistance > 0) && (deliveryDistance <= 100) )
            System.out.println("Потребуется дней: " + deliveryDays);
        else
            System.out.println("Доставка на такое расстояние невозможна.");

        // #5
        System.out.println("\nЗадача №5");
        byte monthNumber = -12;

        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}