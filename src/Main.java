import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        byte zmienna1 = 10;
        short zmienna2 = 10;
        int zmienna3 = 10;
        double zmienna4 = 10.10;
        char zmienna5 = 'D';
        String zmienna6 = "Dziesięć";

        System.out.println(zmienna1);
        System.out.println(zmienna2);
        System.out.println(zmienna3);
        System.out.println(zmienna4);
        System.out.println(zmienna5);
        System.out.println(zmienna6);


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

          Scanner scan = new Scanner(System.in);
          System.out.print("Podaj liczbę A\n");
          int liczbax = scan.nextInt();
          System.out.print("Podaj liczbę A\n");
          int liczbay = scan.nextInt();

    }
}
