import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię");
        String imie = scan.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = scan.next();
        System.out.println("Podaj wiek");
        String wiek = scan.next();
        System.out.println("Podaj indeks");
        String indeks = scan.next();

        System.out.println(imie + " " + nazwisko + " " + wiek);
        System.out.printf(indeks);

        //Gotowe



        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

    }
}
