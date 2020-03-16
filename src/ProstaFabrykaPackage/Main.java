package ProstaFabrykaPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("FABRYKA\nWpisz wyraz: ");
        String wyraz = in.nextLine();

        System.out.print("Wybierz znacznik:\n1 - <p>\n2 - <strong>\n3 - <em>\n4 - <mark>\n/> ");
        Short opcja = in.nextShort();

        Fabryka fabryka = new Fabryka();
        System.out.println("\n" + fabryka.stworz(opcja).edytuj(wyraz));

    }

}
