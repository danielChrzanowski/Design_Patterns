package DekoratorPackage;

public class PlainText implements Interfejs {

    private final String linia;

    public PlainText(String linia) {
        this.linia = linia;
    }

    @Override
    public String write() {
        return linia;
    }

}
