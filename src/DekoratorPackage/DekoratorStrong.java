package DekoratorPackage;

public class DekoratorStrong extends Dekorator {

    DekoratorStrong(Interfejs interfejs) {
        super(interfejs);
    }

    @Override
    public String write() {
        String linia = super.write();

        linia = "<strong>" + linia + "</strong>";
        return linia;
    }
}
