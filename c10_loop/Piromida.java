package czwicz10;

public class Piromida {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            int minus = 5 - i;
            for (int j = 0; j < minus; j++) {
                System.out.print("*");

            }
            System.out.print(minus);
            System.out.println("f");

        }
        System.out.println("=================================");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();

        }

        System.out.println("=================================");

        int[] tab = new int[10];
        for (int i = 0; i < 5; i++) {
            tab[i] = 10 - i;
            System.out.println(tab[i]);
        }

        System.out.println("=================================");

        int[] tab1 = new int[]{
                10, 845, 64, 5, 16, 68, 7
        };
        int min = tab1[0];

        for (int i = 0; i < tab1.length; i++) {

            if (tab1[i]< min) {
                min = tab1[i];
                System.out.println("min - " +tab1[i]);
            }


        }
    }
}
