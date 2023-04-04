import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creazione di un oggetto quadrato
        Quadrato quadrato = new Quadrato(0, 0, "nero", 5);

        // Output dell'area e del perimetro del quadrato
        System.out.println("Area: " + quadrato.area());
        System.out.println("Perimetro: " + quadrato.perimetro());

        // Spostamento del quadrato di una quantità data
        System.out.print("Inserisci la quantità di spostamento (x,y): ");
        int spostamentoX = scanner.nextInt();
        int spostamentoY = scanner.nextInt();
        quadrato.sposta(spostamentoX, spostamentoY);

        // Output della posizione del quadrato dopo lo spostamento
        System.out.println("Posizione dopo lo spostamento: (" + quadrato.getX() + "," + quadrato.getY() + ")");
    }
}
