public class Random {

    public static void main(String[] args) {

        int[][][] arr3 = new int[10][10][3];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {

                System.out.println(arr3[i][j][1]);
            }
        }
        System.out.println();


//  _________________________________________________

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print('+');
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('+');
            }
            System.out.println();
        }

//  _________________________________________________

        int t = 10;
        int m = 4;
        System.out.println();
        for (int i = 0; i < t - m; i++) {
            for (int j = 0; j < t - i; j++) {
                System.out.print('+');
            }
            System.out.println();
        }
        for (int i = m; i < t; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('+');
            }
            System.out.println();
        }
        System.out.println();

//__________________________________________________

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = i; j < 7; j++) {
                System.out.print('+');
            }
            System.out.println();
        }

//____________________________________________________

    }
}
