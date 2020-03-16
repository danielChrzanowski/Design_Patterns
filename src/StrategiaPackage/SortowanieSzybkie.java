package StrategiaPackage;

public class SortowanieSzybkie implements Interfejs {

    @Override
    public long sortuj(int[] tab) {
        long wynik = 0, czas, suma = 0;

        //zastosowana DELEGACJA do 'sortowanieSzybkie'
        //powtorzone 10x sortowanie, zwraca sredni czas
        for (int powtorz = 0; powtorz < 10; powtorz++) {
            long czasP = System.nanoTime();
            sortowanieSzybkie(tab, 0, tab.length - 1);
            long czasK = System.nanoTime();

            czas = czasK - czasP;
            suma += czas;
        }

        return suma / 10;
    }

    private static void sortowanieSzybkie(int[] tab, int pierwsza, int druga) {
        int i = pierwsza, j = druga, h;
        int x = tab[(pierwsza + druga) / 2];

        do {
            while (tab[i] < x) {
                i++;
            }
            while (tab[j] > x) {
                j--;
            }
            if (i <= j) {
                h = tab[i];
                tab[i] = tab[j];
                tab[j] = h;
                i++;
                j--;
            }
        } while (i <= j);

        if (x < j) {
            sortowanieSzybkie(tab, x, j);
        }

        if (i < druga) {
            sortowanieSzybkie(tab, i, druga);
        }
    }

}
