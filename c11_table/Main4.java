package czwicz11;

public class Main4 {
    public static void main(String[] args) {

        int[] tab = new int[6];
        int k = tab[0];
        int j = 0;
        //4 + (int)(Math.random()*(10-4+1))
        //  int mat = 10+(int)(Math.random()*(15-10+1));
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 10 + (int) (Math.random() * (15 - 10 + 1));
            System.out.println(tab[i]);
        }

        System.out.println("\t");
        for (int i = 0; i < tab.length; i++) {
            if (j < 6) {
                tab[i] = j;
                j++;
                System.out.println(tab[i]);
            }
        }

        System.out.println("\t");
        int o = 5;
        for (int i = 0; i < tab.length; i++) {
            if (o >= 0) {
                tab[i] = o;
                o--;
                System.out.println(tab[i]);

            }

        }

        System.out.println("\t");
        System.out.println("5 2 3 1 4 0");
        tab = new int[]{5, 2, 3, 1, 4, 0};
        for (int i = 0; i < tab.length; i++) {
            for (int r = 0; r < tab.length; r++) {
                if (tab[i] == r) {
                    System.out.print("* ");
                } else
                    System.out.print(". ");


            }
            System.out.println();
        }


    }
}