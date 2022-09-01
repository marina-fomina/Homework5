public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача №1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("");
    }
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
            break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
            break;
            default:
                System.out.println("");
        }

        // Задача 2
        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченнуюверсию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Задача 3
        System.out.println("Задача №3");
        int year = 2021;

        // Задача 4
        System.out.println("Задача №4");
        int deliveryDistance = 10;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки карты потребуется один день.");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Для доставки карты потребуется два дня.");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Для доставки карты потребуется три дня.");
        }

        // Задача 5
        System.out.println("Задача №5");
        byte monthNumber = 7;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
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
            default:
                System.out.println("-");
        }
}}