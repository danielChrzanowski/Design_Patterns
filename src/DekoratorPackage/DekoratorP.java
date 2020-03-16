package DekoratorPackage;

public class DekoratorP extends Dekorator {

    DekoratorP(Interfejs interfejs) {
        super(interfejs);
    }

    @Override
    public String write() {
        String linia = super.write();

        linia = "<p>" + linia + "</p>";
        return linia;
    }
}
