
import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir cadena al usuario
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        // Usar StringBuilder para invertir
        String invertida = new StringBuilder(cadena).reverse().toString();

        // Mostrar resultado
        System.out.println("Cadena invertida: " + invertida);

        sc.close();
    }
}