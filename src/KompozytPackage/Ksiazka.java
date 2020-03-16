package KompozytPackage;

public class Ksiazka extends Wzorzec {

    java.util.List<Wzorzec> lista = new java.util.ArrayList();

    public Ksiazka(String tytul) {
        super(tytul);
    }

    @Override
    public void wypiszInfo(int numer, int podnumer) {
        System.out.println(this.tytul);

        for (Wzorzec k : lista) {
            System.out.print("  " + numer + ". ");

            k.wypiszInfo(numer, podnumer);
            numer++;
        }
    }

    void dodaj(Wzorzec k) {
        lista.add(k);
    }

}
