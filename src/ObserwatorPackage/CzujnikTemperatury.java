package ObserwatorPackage;

public class CzujnikTemperatury implements InterfejsObserwowany {

    private double temperatura;
    private java.util.ArrayList<InterfejsObserwujacy> listaObserwatorow = new java.util.ArrayList<>();

    @Override
    public void ustaw(double nowaWartosc) {
        temperatura = nowaWartosc;
    }

    @Override
    public void dodajObserwatora(InterfejsObserwujacy obiektObserwatora) {
        listaObserwatorow.add(obiektObserwatora);
    }

    @Override
    public void usunObserwatora(InterfejsObserwujacy obiektObserwatora) {
        listaObserwatorow.remove(obiektObserwatora);
    }

    @Override
    public void powiadomObserwatorow() {
        for (InterfejsObserwujacy wartosc : listaObserwatorow) {
            wartosc.ustaw(temperatura);
        }
    }

}
