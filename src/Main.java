public class Main {
    public static void main(String[] args) {

        { System.out.println("Задания 1");

        int IOS = '0';
        int Android = '1';
        char clientOS = '1';
        if (clientOS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

        {
            System.out.println("Задания 2");
            int yearOfRelease = 2015;
            int IOS = '0';
            char clientOS = '1';
            char clientDeviceYear = 2016;
            if (clientDeviceYear < 2015 && clientOS == '0') {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                if (clientDeviceYear >= 2015 && clientOS == '0') {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            } else if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");}
                else  {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }
        {
            System.out.println("Задания 3");
            int year=2021;
            if (year % 4 ==0 && year % 100 !=0 || year % 400 == 0){
                System.out.println("год является високосным");
            }else {
                System.out.println("год не является високосным");
            }
        }
        {
            System.out.println("Задания 4");
        }
        int deliveryDistance = 95;
        if (deliveryDistance<20){
            System.out.println("Доставка занимает сутки.");
        } else if (deliveryDistance>=20 || deliveryDistance<60){
            System.out.println("К доставка добавляет еще один день доставки.");
        } else if (deliveryDistance>=60 || deliveryDistance<100){
            System.out.println("К доставка  добавляет еще одни сутки.");
        }else {
            System.out.println("Доставки нет");
        }
        {
            System.out.println("Задания 5");
        }
        int monthNumber = 7;
         switch (monthNumber){
             case 12:
             case 1:
             case 2:
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
                 System.out.println("Такого месяца нету");
         }



    }


}



