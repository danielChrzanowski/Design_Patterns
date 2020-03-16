package ObserwatorPackage;

public class Fahrenheit implements InterfejsObserwujacy {

    @Override
    public void ustaw(double nowaWartosc) {
        nowaWartosc = ((nowaWartosc * 9) / 5) + 32;
        System.out.printf("Fahrenheit: %5.3f\n", nowaWartosc);
    }

}
