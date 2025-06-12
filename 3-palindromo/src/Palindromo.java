import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String cadena) {
        // Eliminar todos los caracteres no alfanuméricos y convertir a minúsculas
        String cadenaLimpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int izquierda = 0;
        int derecha = cadenaLimpia.length() - 1;

        while (izquierda < derecha) {
            if (cadenaLimpia.charAt(izquierda) != cadenaLimpia.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena para verificar si es palíndromo:");
        String entrada = scanner.nextLine();

        if (esPalindromo(entrada)) {
            System.out.println("La cadena ES un palíndromo.");
        } else {
            System.out.println("La cadena NO es un palíndromo.");
        }

        scanner.close();
    }
}