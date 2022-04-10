public class HW_5_2 {

    public static void main(String[] args) {

        System.out.println("Task 1");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 9 - i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



    }
}
