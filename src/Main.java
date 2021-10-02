import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        System.out.println("Logiczne");
        //logiczne
        boolean liczbaa = true;
        boolean liczbab = false;
        System.out.println(liczbaa && liczbab);
        System.out.println(liczbaa || liczbab);
        System.out.println(!liczbaa);
        System.out.println(!liczbab);
        System.out.println(!(liczbaa && liczbab));

        System.out.println("Arytmetyczne");
        //arytmetyczne
        int liczbax = 3;
        int liczbay = 3;
        System.out.println(liczbax == liczbay);
        System.out.println(liczbax != liczbay);
        System.out.println(liczbax < liczbay);
        System.out.println(liczbax > liczbay);
        System.out.println(liczbax >= liczbay);


    }
}
