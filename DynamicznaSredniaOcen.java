import java.util.ArrayList;
import java.util.Scanner;

public class DynamicznaSredniaOcen {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Double> oceny = new ArrayList<>();

            System.out.println("Program do obliczania średniej arytmetycznej z dowolnej liczby ocen.");
            System.out.println("Wprowadź oceny (wpisz -1, aby zakończyć):");

            while (true) {
                System.out.print("Wprowadź ocenę: ");
                double ocena = scanner.nextDouble();
                if (ocena == -1) {
                    break; // Warunek zakończenia wprowadzania danych
                } else if (ocena >= 1.0 && ocena <= 6.0) {
                    oceny.add(ocena); // Dodawanie oceny do listy
                } else {
                    System.out.println("Ocena musi być w zakresie od 1.0 do 6.0.");
                }
            }

            if (!oceny.isEmpty()) {
                double suma = 0;
                for (Double ocena : oceny) {
                    suma += ocena; // Sumowanie ocen
                }
                double srednia = suma / oceny.size(); // Obliczanie średniej arytmetycznej
                System.out.println("Średnia arytmetyczna wprowadzonych ocen wynosi: " + srednia);
            } else {
                System.out.println("Nie wprowadzono żadnych ocen.");
            }
        }
    }
}
