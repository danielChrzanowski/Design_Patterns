package KompozytPackage;

public class PodPodrozdzial extends Wzorzec {

    public PodPodrozdzial(String tytul) {
        super(tytul);
    }

    @Override
    public void wypiszInfo(int numer, int podnumer) {
        System.out.println(tytul);
    }

}
