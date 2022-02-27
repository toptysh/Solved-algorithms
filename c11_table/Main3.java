package czwicz11;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {

        char[] t = {'-', '*', '$'};
        int k = t[0];
        for (int i = 0; i < t.length; i++) {
            if (k < t[i])
                k = t[i];
        }
        System.out.println("najmniejsza wartosc - " + k);
        //3=================================================
        Scanner in = new Scanner(System.in);
        char[] tab = new char[5];
        char znak = (char) ((int) (Math.random() * 26) + 'A');
        for (int i = 0; i < t.length; i++) {
            tab[i] = znak;
            System.out.println(tab[i]);

        }

        boolean dalej = true;
        while (dalej) {
            char c = in.next().charAt(0);
            for (int i = 0; i < t.length; i++) {
                if (tab[i] == c)
                    tab[i] = 0;
            }
        }



    }
}