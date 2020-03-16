package DekoratorPackage;

abstract class Dekorator implements Interfejs {

    private final Interfejs interfejs;

    Dekorator(Interfejs interfejs) {
        this.interfejs = interfejs;
    }

    @Override
    public String write() {
        return interfejs.write();
    }
}
