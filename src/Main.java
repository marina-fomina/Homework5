public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача №1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("");
    }

        // Задача 1 (второй вариант решения)
        System.out.println("Задача №1 (второй вариант решения)");
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
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }

        // Задача 3
        System.out.println("Задача №3");
        int year = 1952;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }


        // Задача 4
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        byte deliveryTerm = 1;
        if (deliveryDistance > 20) {
            deliveryTerm++;
        }
        if (deliveryDistance > 60) {
            deliveryTerm++;
        }
        System.out.println("Потребуется дней: " + deliveryTerm);

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

        // Задача 6
        System.out.println("Задача №6"); // повышенная сложность
        byte age = 25;
        int salary = 60_000;
        if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей.");
        }
        if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей.");
        }
        if (age < 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.5) + " рублей.");
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.2) + " рублей.");
        }
        if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.5) + " рублей.");
        }
        else if (age>= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.2) + " рублей.");
        }

        // Задача 7
        System.out.println("Задача №7"); // повышенная сложность
        int wantedSum = 330_000;
        double yearLoanRate = 0.1;
        double monthLoanRate = yearLoanRate / 12;
        byte loanTerm = 12;
        double maxMonthlyPayment = salary * 0.5;


        if (age < 23 && salary > 80_000) {
            monthLoanRate = (yearLoanRate + 0.01 - 0.007) / 12;
        } else if (age < 23 && salary <= 80_000) {
            monthLoanRate = (yearLoanRate + 0.01) / 12;
        }
        if (age >= 23 && age < 30 && salary > 80_000) {
            monthLoanRate = (yearLoanRate + 0.005 - 0.007) / 12;
        } else if (age >= 23 && age < 30 && salary <= 80_000) {
            monthLoanRate = (yearLoanRate + 0.005) / 12;
        }
        if (age >= 30 && salary > 80_000) {
            monthLoanRate = (yearLoanRate - 0.007) / 12;
        } else if (age >= 30 && salary <= 80_000) {
            monthLoanRate = yearLoanRate / 12;
        }
        double x = 1 + monthLoanRate; // вспомогательная переменная для расчетов
        double y = 12; // вспомогательная переменная для расчетов
        double monthlyPayment = wantedSum * (monthLoanRate * Math.pow(x,y) / (Math.pow(x,y) - 1));

        System.out.println("Максимальный платеж при зарплате в " + salary + " руб. равен " + maxMonthlyPayment + " руб. Платеж по кредиту равен " + monthlyPayment + " руб.");

        if (maxMonthlyPayment > monthlyPayment) {
            System.out.println("Одобрено.");
        } else {
            System.out.println("Отказано.");
        }

    }}