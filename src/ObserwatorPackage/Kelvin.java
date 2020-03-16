package ObserwatorPackage;

public class Kelvin implements InterfejsObserwujacy {

    @Override
    public void ustaw(double nowaWartosc) {
        nowaWartosc = nowaWartosc + 273.15;
        System.out.printf("Kelvin: %5.3f\n", nowaWartosc);
    }
}
