import java.util.Scanner;

public class SredniaOcen {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Program do obliczania średniej arytmetycznej z ocen.");

    
            System.out.print("Wprowadź ocenę z matematyki: ");
            double matematyka = scanner.nextDouble();

            System.out.print("Wprowadź ocenę z fizyki: ");
            double fizyka = scanner.nextDouble();

            System.out.print("Wprowadź ocenę z chemii: ");
            double chemia = scanner.nextDouble();

  
            double srednia = (matematyka + fizyka + chemia) / 3;

 
            System.out.printf("Średnia arytmetyczna z ocen: %.2f", srednia);
        }
    }
}
