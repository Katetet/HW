import java.util.Locale;

public class HW_4_2 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Task 1");
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о')
                System.out.print('o');
        }

        System.out.println();
        System.out.println("Task 2");
        String s1 = "Перевыборы выбранного президента";
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                a++;
            }
        }
        System.out.println(a);

        System.out.println();
        System.out.println("Task 3");

        String s2 = "Посмотрите как Рите нравится ритм".toLowerCase(Locale.ROOT);

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'р' && s2.charAt(i + 1) == 'и' && s2.charAt(i + 2) == 'т') {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Task 3");
        a = 0;
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
//        s2.contains("e");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    a++;
                }
            }
        }
        System.out.println(a);

    }
}
