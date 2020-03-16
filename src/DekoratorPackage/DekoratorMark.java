package DekoratorPackage;

public class DekoratorMark extends Dekorator {

    DekoratorMark(Interfejs interfejs) {
        super(interfejs);
    }

    @Override
    public String write() {
        String linia = super.write();

        linia = "<mark>" + linia + "</mark>";
        return linia;
    }
}
