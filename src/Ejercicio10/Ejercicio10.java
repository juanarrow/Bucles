package Ejercicio10;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("""
                Este programa calcula la media de los números positivos introducidos.
                Para parar, introduzca un número negativo.
                Vaya introduciendo números:
                """);
        int numero = 0;
        double media = 0;
        int numeros = 0;
        do {
            try {
                numero = Integer.parseInt(System.console().readLine());    
                media+=numero;
                numeros++;
            } catch (Exception e) {
                // TODO: handle exception
            }
        } while (numero>=0);
        media -= numero;
        numeros--;
        media = media/numeros;    
        System.out.printf(
            "La media de los números positivos introducidos es %.2f", Double.isNaN(media)?0.0:media);
    }
}
