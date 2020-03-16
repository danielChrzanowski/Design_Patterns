package KompozytPackage;

abstract class Wzorzec {

    protected String tytul;

    public Wzorzec(String tytul) {
        this.tytul = tytul;
    }

    public abstract void wypiszInfo(int numer, int podnumer);

}
