import java.util.Arrays;

public class HW_4_1 {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("Task 1");
        System.out.println();
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int a;
        a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        System.out.println(a);

        System.out.println();
        System.out.println("Task 2");
        int b = array[0];
        for (int i = 0; i < array.length; i++) {
            if (b < array[i])
                b = array[i];
        }
        System.out.println(b);

        System.out.println();
        System.out.println("Task 3");

        b = array[0];
        for (int i = 0; i < array.length; i++) {
            if (b > array[i])
                b = array[i];
        }
        System.out.println(b);

        System.out.println();
        System.out.println("Task 4");

        System.out.println(a / array.length);

        System.out.println();
        System.out.println("Task 5");

        a = 0;
        int[][] arr2 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                a = a + arr2[i][j];
            }
        }
        System.out.println(a);

        System.out.println();
        System.out.println("Task 6");
        int s = arr2[0][0];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (s < arr2[i][j])
                    s = arr2[i][j];
            }
        }
        System.out.println(s);

        System.out.println();
        a = 0;
        System.out.println("Task 7");
        for (int i = 0; i < arr2.length; i++) {
            a = a + arr2[i      ].length;
        }
        System.out.println(a);








    }
}
