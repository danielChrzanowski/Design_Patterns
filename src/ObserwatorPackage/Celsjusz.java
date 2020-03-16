package ObserwatorPackage;

public class Celsjusz implements InterfejsObserwujacy {

    @Override
    public void ustaw(double nowaWartosc) {
        System.out.printf("Celsjusz: %5.3f\n", nowaWartosc);
    }
}
