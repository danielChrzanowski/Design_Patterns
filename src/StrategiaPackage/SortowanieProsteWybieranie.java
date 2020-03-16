package StrategiaPackage;

public class SortowanieProsteWybieranie implements Interfejs {

    @Override
    public long sortuj(int[] tab) {
        long czas, suma = 0;

        //powtorzone 10x sortowanie; zwraca sredni czas
        for (int powtorz = 0; powtorz < 10; powtorz++) {
            long czasP = System.nanoTime();
            int rozmiarTablicy = tab.length;

            for (int i = 0; i < rozmiarTablicy; i++) {
                int min = tab[i];
                int indeks = i;

                for (int j = i; j < rozmiarTablicy; j++) {
                    if (tab[j] < min) {
                        indeks = j;
                    }
                }
                tab[indeks] = tab[i];
                tab[i] = min;
            }
            long czasK = System.nanoTime();
            czas = czasK - czasP;
            suma += czas;
        }
        return suma/10;
    }
    
}
