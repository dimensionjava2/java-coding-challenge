
public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 1000:");

        for (int i = 2; i <= 1000; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        // Verificamos divisibilidad hasta la raíz cuadrada del número
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}