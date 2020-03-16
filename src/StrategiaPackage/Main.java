package StrategiaPackage;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab99 = new int[99];
        int[] tab999 = new int[999];
        int[] tab9999 = new int[9999];

        wypelnijTablice(tab99);
        wypelnijTablice(tab999);
        wypelnijTablice(tab9999);

        Interfejs strategia;
        System.out.println("STRATEGIA\n< 10 sortowan tablic; czas usredniony - (nanosekundy) >\n");

        System.out.println("Sortowanie Babelkowe:");
        strategia = new SortowanieBabelkowe();
        wykonajSortowanie(strategia, tab99);
        wykonajSortowanie(strategia, tab999);
        wykonajSortowanie(strategia, tab9999);
        System.out.println();

        System.out.println("Sortowanie Proste Wybieranie:");
        strategia = new SortowanieProsteWybieranie();
        wykonajSortowanie(strategia, tab99);
        wykonajSortowanie(strategia, tab999);
        wykonajSortowanie(strategia, tab9999);
        System.out.println();

        System.out.println("Sortowanie Szybkie:");
        strategia = new SortowanieSzybkie();
        wykonajSortowanie(strategia, tab99);
        wykonajSortowanie(strategia, tab999);
        wykonajSortowanie(strategia, tab9999);
        System.out.println();
        
         System.out.println("Sortowanie Kolekcji:");
        strategia = new CollectionsSort();
        wykonajSortowanie(strategia, tab99);
        wykonajSortowanie(strategia, tab999);
        wykonajSortowanie(strategia, tab9999);
        System.out.println();

    }

    static void wypelnijTablice(int[] tab) {
        Random random = new Random();
        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = random.nextInt(99999999);
        }
    }

    static void wykonajSortowanie(Interfejs strategia, int[] tab) {
        System.out.println(tab.length + " elementow: " + strategia.sortuj(tab) + "ns");
    }

}
