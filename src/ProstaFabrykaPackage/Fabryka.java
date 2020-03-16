package ProstaFabrykaPackage;

public class Fabryka {

    public Interfejs stworz(short opcja) {

        if (opcja <= 4) {
            switch (opcja) {
                case 1:
                    return new P();
                case 2:
                    return new Strong();
                case 3:
                    return new Em();
                case 4:
                    return new Mark();
            }
        } else {
            System.out.println("Miales tylko 4 opcje do wyboru!");
            System.exit(0);
        }
        return null;
    }
}
