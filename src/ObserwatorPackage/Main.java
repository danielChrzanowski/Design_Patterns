package ObserwatorPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double temperatura;
        short kontynuuj;

        Scanner in = new Scanner(System.in);
        CzujnikTemperatury czujnik = new CzujnikTemperatury();

        Celsjusz celsjusz = new Celsjusz();
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin = new Kelvin();

        czujnik.dodajObserwatora(celsjusz);
        czujnik.dodajObserwatora(fahrenheit);
        czujnik.dodajObserwatora(kelvin);

        do {
            System.out.print("OBSERWATOR\nPodaj temperature w stopniach Celsjusza: ");
            temperatura = in.nextDouble();

            //formatowanie wyniku na 5 cyfr i 3 po przecinku w obserwatorach
            czujnik.ustaw(temperatura);
            czujnik.powiadomObserwatorow();

            System.out.print("Wpisz '0', aby wyjsc lub '1', aby kontunuowac: ");
            kontynuuj = in.nextShort();

            System.out.println();
        } while (kontynuuj >= 1);
    }

}
