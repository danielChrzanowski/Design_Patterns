package KompozytPackage;

public class Podrozdzial extends Wzorzec {

    protected java.util.List<Wzorzec> lista = new java.util.ArrayList();

    public Podrozdzial(String tytul) {
        super(tytul);
    }

    @Override
    public void wypiszInfo(int numer, int podnumer) {
        short podPodnumer = 1;

        System.out.println(this.tytul);
        for (Wzorzec k : lista) {
            System.out.print("      " + numer + "." + podnumer + "." + podPodnumer + ". ");

            k.wypiszInfo(numer, podnumer);
            podPodnumer++;
        }
    }

    void dodaj(Wzorzec k) {
        lista.add(k);
    }

}
