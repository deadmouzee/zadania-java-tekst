import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class Zad2 {
    public static void main(String[] args) { //1.

        try {
            URL url = new URL("https://www.youtube.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String currentline;
            boolean slowo = false;
//Napisz program, który ze strony internetowej o wskazanym adresie wyświetla tylko te linie, które zawierają znak “@”. [Operacje wejścia-wyjścia + operacja na tekście].
            while ((currentline = br.readLine()) != null) {

                if (currentline.contains("@")) {
                    slowo = true;
                    System.out.println(currentline);
                }
            }
            if (!slowo) {
                System.out.println("Nie znaleziono danego slowa");
            }


            //Napisz program, który ze strony internetowej o wskazanym adresie, wyświetla tylko te linie, które zawierają znak “@”, pod warunkiem że  nie występują w @media [Operacje wejścia-wyjścia + operacja na tekście].
            while ((currentline = br.readLine()) != null) {

                if (currentline.contains("@media")) {
                    continue;
                } else if (currentline.contains("@")) {
                    slowo = true;
                    System.out.println("\n\n" + currentline);
                }
            }
            if (!slowo) {
                System.out.println("Nie znaleziono danego slowa");
            }
        } catch (IOException ex) {
            System.out.println("Błąd");
        }
    }
}
