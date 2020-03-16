package StrategiaPackage;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort implements Interfejs {

    @Override
    public long sortuj(int[] tab) {
        ArrayList<Integer> liczby = new ArrayList<>();
        long czas = 0, suma = 0;

        for (int i = 0; i < tab.length - 1; i++) {
            liczby.add(tab[i]);
        }

        //powtorzone 10x sortowanie, zwraca sredni czas
        for (int powtorz = 0; powtorz < 10; powtorz++) {
            long czasP = System.nanoTime();
            Collections.sort(liczby);
            long czasK = System.nanoTime();
            
            czas = czasK - czasP;
            suma += czas;
        }

        return czas / 10;
    }
}
