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




    }
}
