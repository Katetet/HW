public class HW_3_2 {

    public static void main(String[] args) {

        System.out.println("Задача №1");

        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача №2");

        for (int i = 5; i < 10000; i = i * 5) {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача №3");

        for (int i = 40; i < 61; i = i + 4) {
            System.out.println(i);
        }
        System.out.println("");

        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }


    }
}
