import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Zad3 {
    public static void main(String[] args) { //1.

        String obecnaLinia;
        boolean adres = false;

        try {
            URL url = new URL("https://stackoverflow.co/company/contact");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((obecnaLinia = br.readLine()) != null) {
                String[] slowa = obecnaLinia.split(",");

                for (String slowo : slowa) {
                    if (slowo.matches("[a-zA-Z\\d_.+-]+@[a-zA-Z\\d-]+\\\\.[a-zA-Z\\d-]+")) {
                        adres = true;
                        System.out.println(slowo);
                    }
                }
            }
            if (!adres) {
                System.out.println("Nie znaleziono danego slowa");
            }


        } catch (IOException ex) {
            System.out.println("Błąd");
        }
    }
}
