package KompozytPackage;

public class Kompozyt {

    public static void main(String[] args) {

        Ksiazka ksiazka = new Ksiazka("KOMPOZYT\n\"KsiONSZka\"");

        Rozdzial rozdzialPierwszy = new Rozdzial("Rozdział pierwszy");
        Podrozdzial podrozdzialPierwszy = new Podrozdzial("Podrozdział pierwszy");

        Rozdzial rozdzialDrugi = new Rozdzial("Rozdział drugi");
        Podrozdzial podrozdzialDrugi = new Podrozdzial("Podrozdział drugi");
        Podrozdzial podrozdzialTrzeci = new Podrozdzial("Podrozdział trzeci");
        Podrozdzial podrozdzialCzwarty = new Podrozdzial("Podrozdział czwarty");

        Rozdzial rozdzialTrzeci = new Rozdzial("Rozdział trzeci");
        Podrozdzial podrozdzialPiaty = new Podrozdzial("Podrozdział piąty");
        Podrozdzial podrozdzialSzosty = new Podrozdzial("Podrozdział szósty");

        ksiazka.dodaj(rozdzialPierwszy);
        rozdzialPierwszy.dodaj(podrozdzialPierwszy);

        ksiazka.dodaj(rozdzialDrugi);
        rozdzialDrugi.dodaj(podrozdzialDrugi);
        rozdzialDrugi.dodaj(podrozdzialTrzeci);
        rozdzialDrugi.dodaj(podrozdzialCzwarty);

        ksiazka.dodaj(rozdzialTrzeci);
        rozdzialTrzeci.dodaj(podrozdzialPiaty);
        rozdzialTrzeci.dodaj(podrozdzialSzosty);

        podrozdzialPierwszy.dodaj(new PodPodrozdzial("PodPodrozdział pierwszy - 1"));
        podrozdzialDrugi.dodaj(new PodPodrozdzial("PodPodrozdział drugi - 1"));
        podrozdzialDrugi.dodaj(new PodPodrozdzial("PodPodrozdział drugi - 2"));
        podrozdzialTrzeci.dodaj(new PodPodrozdzial("PodPodrozdział trzeci - 1"));
        podrozdzialTrzeci.dodaj(new PodPodrozdzial("PodPodrozdział trzeci - 2"));
        podrozdzialTrzeci.dodaj(new PodPodrozdzial("PodPodrozdział trzeci - 3"));
        podrozdzialPiaty.dodaj(new PodPodrozdzial("PodPodrozdział piąty - 1"));
        podrozdzialPiaty.dodaj(new PodPodrozdzial("PodPodrozdział piąty - 2"));

        ksiazka.wypiszInfo(1, 1);
    }

}
