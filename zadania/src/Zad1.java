import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) throws IOException {
        File dane1 = new File("C:\\Users\\k1erman\\Desktop\\dane1.txt"); //1.
        File dane2 = new File("C:\\Users\\k1erman\\Desktop\\dane2.txt"); //2.
        File napis = new File("C:\\Users\\k1erman\\Desktop\\napis.txt"); //3.
        RandomAccessFile plik;
        String tekst;

        int suma = 0;
        //1.
        BufferedReader odczyt = new BufferedReader(new FileReader(dane1));

        Scanner scanner = new Scanner(dane1);

        while ((tekst = odczyt.readLine()) != null) {
            System.out.println(tekst);
        }
        //2.
        while (scanner.hasNextInt()) {
            suma = suma + scanner.nextInt();
        }
        System.out.println("\nWynik sumowania to " + suma);

        //3.
        String tekst2 = new String(Files.readAllBytes(Paths.get(String.valueOf(dane2))), StandardCharsets.UTF_8);
        System.out.println("\n" + tekst2);

        //4.
        plik = new RandomAccessFile(napis, "r");
        plik.seek(15464);
        tekst = plik.readLine() + "\n";
        System.out.println("\n"+tekst);
    }
}

