package DekoratorPackage;

public class DekoratorEm extends Dekorator {

    DekoratorEm(Interfejs interfejs) {
        super(interfejs);
    }

    @Override
    public String write() {
        String linia = super.write();

        linia = "<em>" + linia + "</em>";
        return linia;
    }

}
