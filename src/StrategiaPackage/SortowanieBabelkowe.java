package StrategiaPackage;

public class SortowanieBabelkowe implements Interfejs {

    @Override
    public long sortuj(int[] tab) {
        long czas, suma = 0;

        //powtorzone 10x sortowanie, zwraca sredni czas
        for (int powtorz = 0; powtorz < 10; powtorz++) {
            long czasP = System.nanoTime();
            int pomoc;
            boolean zamien = true;

            while (zamien) {
                zamien = false;

                for (int i = 0; i < tab.length - 1; i++) {
                    if (tab[i] > tab[i + 1]) {
                        pomoc = tab[i + 1];
                        tab[i + 1] = tab[i];
                        tab[i] = pomoc;
                        zamien = true;
                    }
                }
            }
            
            long czasK = System.nanoTime();
            czas = czasK - czasP;
            suma += czas;
        }
        return suma/10;
    }

}
