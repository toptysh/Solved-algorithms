package czwicz14;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        boolean wykonuj = true;
        int k = 20 + (int) (Math.random() * (40 - 20 + 1));
        int n = 20;
        int[] tab = new int[k];
        System.out.println(k);
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 10 + (int) (Math.random() * (100 - 10 + 1));
            System.out.print(tab[i] + " ");
        }
        System.out.println();


        int losowaLiczbaTablicy = tab[(int) (Math.random()*tab.length)];
        System.out.println(losowaLiczbaTablicy);

        while (true) {


            if (tab[0] < losowaLiczbaTablicy || losowaLiczbaTablicy < tab[tab.length - 1]) {
                System.out.println("twerdzenie jest poprawne");
               // wykonuj = false;
            } else {
                tab[0] = tab[0] + 1;
                tab[tab.length - 1] = tab[tab.length - 1];

            }


            break;
        }
    }

}
