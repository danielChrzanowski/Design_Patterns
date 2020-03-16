package ProstaFabrykaPackage;

public class Mark implements Interfejs {

    @Override
    public String edytuj(String tekst) {
        return "<mark>" + tekst + "</mark>";
    }
}
