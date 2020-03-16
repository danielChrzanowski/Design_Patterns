package DekoratorPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("DEKORATOR\nWpisz wyraz: ");
        String wyraz = in.nextLine();

        System.out.print("Wybierz znacznik:\n1 - <p>\n2 - <strong>\n3 - <em>\n4 - <mark>\n5 - koniec\n/> ");
        Short opcja = in.nextShort();

        Interfejs tekst = new PlainText(wyraz);

        while (opcja <= 4) {
            switch (opcja) {
                case 1:
                    tekst = new DekoratorP(new PlainText(wyraz));
                    wyraz = tekst.write();

                    wypisz(wyraz);
                    opcja = in.nextShort();
                    break;

                case 2:
                    tekst = new DekoratorStrong(new PlainText(wyraz));
                    wyraz = tekst.write();

                    wypisz(wyraz);
                    opcja = in.nextShort();
                    break;

                case 3:
                    tekst = new DekoratorEm(new PlainText(wyraz));
                    wyraz = tekst.write();

                    wypisz(wyraz);
                    opcja = in.nextShort();
                    break;

                case 4:
                    tekst = new DekoratorMark(new PlainText(wyraz));
                    wyraz = tekst.write();

                    wypisz(wyraz);
                    opcja = in.nextShort();
                    break;
            }
        }

    }

    static void wypisz(String wyraz) {
        System.out.println("\n" + wyraz);
        System.out.print("\nWybierz znacznik:\n1 - <p>\n2 - <strong>\n3 - <em>\n4 - <mark>\n5 - koniec\n/> ");
    }
}
