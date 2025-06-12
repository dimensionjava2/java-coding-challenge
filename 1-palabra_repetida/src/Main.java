import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        palabraMasRepetida();
    }

    //EN LA FRASE ENCONTRAR LA PALABRA MAS REPETIDA
    public static void palabraMasRepetida(){

        String frase = "Hola mundo mundo mundo Hola Hola Hola";
        String[] arrPalabras = frase.split(" ");

        Map<String, Integer> mapPalabras = new HashMap<>();
        int cantMax = 0, cantActual;
        String palMasUsada="";

        for(String palabra : arrPalabras){
            cantActual = mapPalabras.getOrDefault(palabra,0)+1;
            mapPalabras.put(palabra, cantActual);

            if(cantActual > cantMax){
                cantMax = cantActual;
                palMasUsada = palabra;
            }
        }

        System.out.println(palMasUsada);
    }
}