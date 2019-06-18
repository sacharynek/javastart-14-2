import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Integer> mapa = new HashMap<>();
        File file = new File("liczby.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            int key = sc.nextInt();

            if (mapa.containsKey(key)) {
                int currentValue = mapa.get(key);
                mapa.put(key, ++currentValue);
            } else {
                mapa.put(key, 1);
            }
        }

        Set keys = mapa.keySet();

        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            int actualKey = iterator.next();
            System.out.println(actualKey + " - liczba wystąpień: " + mapa.get(actualKey));
        }


    }
}
