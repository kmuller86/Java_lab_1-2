import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */



        if ((20 % 3) == 0){
            System.out.println("Podzielny przez  3");
        }
         else  {
            System.out.println("Niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int indeks = 10;
        if ((indeks % 2) == 0 & indeks != 0){
            System.out.println("Parzyste");
        }
        else  {
            System.out.println("Nieparzyste");
        }


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz liczbę zmiennoprzecinkową");
        double zmienna = scan.nextDouble();

        if (zmienna == 2.5){
            System.out.println("Liczba to 2.5");

        }
        else {
            System.out.println("Liczba to nie 2.5");
        }
    }
}
