import java.util.Random;

public class HW_5_1 {

    public static void main(String[] args) {

        HW_5_1_ hw = new HW_5_1_();

        System.out.println(hw.getSum(5, 7));
        System.out.println(hw.getSub(15, 3));
        System.out.println(hw.getDiv(15, 5));
        System.out.println(hw.getMulti(5, 3));

        System.out.println();
        System.out.println("Task 2");

        Random random = new Random();
        int a, b;
        for (int i = 0; i < 10; i++) {
            a = random.nextInt(1 , 10);
            b = random.nextInt(1 , 10);
            System.out.println(a + ", " + b + " -> " + isLove(a, b));
        }

    }

    public static boolean isLove(final int flower1, final int flower2) {
        Integer.toString(flower1);
        int mod1 = flower1 % 2;
        int mod2 = flower2 % 2;
        return mod1 != mod2;


    }
}

















