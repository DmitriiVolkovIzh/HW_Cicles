public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 2");
        for (int i = 1; i < 11; i++) {
            System.out.println("Интерация цикла " + i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int n = 11; n > 0; n--) {
            System.out.println("Интерация цикла " + n);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int p = 2; p < 17; p+=2) {
            System.out.println("Интерация цикла " + p);}
        // Задание 4
        System.out.println("Задание 4");
        for (int s = 11; s > -11; s--) {
            System.out.println("Интерация цикла " + s);
        }
        // Задание 5
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
        // Задание 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }
        // Задание 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }
        // Задание 8
        System.out.println("Задание 8");

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12;i++) {
            total = total + salary;
            System.out.println("В месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого " + total);

        // Задание 9
        System.out.println("Задание 9");

        int salary2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12;i++) {
            total2 = total2 + salary2/100;
            total2 = total2 + salary2;
            System.out.println("В месяц " + i + " сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println(total2);
    }
}