package czwicz14;

public class Proba {
    public static void main(String[] args) {

        int tab[][]= {
                {1, 2, 3,  4},
                {5, 6, 7,  8},
                {9, 10,11,12},
                {13,14,15,16}
        };

        //Indeks pierwszego wiersza
        int rowFirst = 0;
        //Indeks ostatniego wiersza
        int rowLast = tab.length-1;
        //indeks pierwszej kolumny
        int columnFirst = 0;
        //indeks ostatniej kolumny
        int columnLast = tab.length-1;

        //dopoki cos zostalo do wypisania
        while(rowFirst < rowLast && columnFirst < columnLast){

            //Pierwszy wiersz od lewej do prawej
            for(int i=rowFirst; i < rowLast; i++){
                System.out.print(tab[rowFirst][i] + " ");
            }
            rowFirst++;

            //Ostatnia kolumna od gory do dolu
            for(int i=columnFirst; i < columnLast; i++){
                System.out.print(tab[i][columnLast] + " ");
            }
            columnLast--;


            //Ostatni wiersz od prawej do lewej
            for(int i=rowLast;i>=rowFirst;i--){
                System.out.print(tab[rowLast][i]+" ");
            }
            rowLast--;

            //Pierwsza kolumna od dolu do gory
            for(int i=columnLast+1;i > columnFirst;i--){
                System.out.print(tab[i][columnFirst] +" ");
            }
            columnFirst++;

        }
    }

}
