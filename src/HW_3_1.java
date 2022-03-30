import java.sql.SQLOutput;

public class HW_3_1 {

    public static void main(String[] args) {

        int a = 41;
        int b = 15;

        System.out.println("Задача №1");

        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("");

        System.out.println("Задача №2");

        int sumAB = a + b;
        if (sumAB % 2 == 1) {
            System.out.println("some variable is odd");
        } else {
            System.out.println("maybe a and b are even");
        }
        System.out.println("");

        System.out.println("Задача №3");

        if (a > 10) {
            System.out.println("больше 10");
        }
        if (a < 100) {
            System.out.println("меньше 100");
        }
        if (a / (2 * 1.0) > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
}
}

