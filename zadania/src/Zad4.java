import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Zad4 {
    public static void main(String[] args) {
        try {

            FileWriter zapisPliku = new FileWriter("C:\\Users\\k1erman\\Desktop\\tekst20.txt");
            BufferedWriter zapis = new BufferedWriter(zapisPliku);
            Random losowanieLiczby = new Random();

            long x;
            int y;

            for (y = 0; y < 16; y++) {
                for (x = 0; x < 20000; x++) {
                    long liczbaWylosowana = losowanieLiczby.nextLong(1999999999) + 1;
                    zapis.write(liczbaWylosowana + " ");
                }
            }
        } catch (Exception e){
            System.out.println("B³¹d");
        }
    }
}
