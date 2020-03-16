package KompozytPackage;

public class Rozdzial extends Wzorzec {

    protected java.util.List<Wzorzec> lista = new java.util.ArrayList();

    public Rozdzial(String tytul) {
        super(tytul);
    }

    @Override
    public void wypiszInfo(int numer, int podnumer) {
        System.out.println(this.tytul);
        for (Wzorzec k : lista) {
            System.out.print("    " + numer + "." + podnumer + ". ");

            k.wypiszInfo(numer, podnumer);
            podnumer++;
        }
    }

    void dodaj(Wzorzec k) {
        lista.add(k);
    }

}
