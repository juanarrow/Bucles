package Ejercicio9;

public class Ejercicio9 {
    public static void ejercicio9(){
        try {
            System.out.println("Introduzca un número entero y le diré cuántos dígitos tiene: ");
            long numero = Long.parseLong(System.console().readLine());     
            int digitos = 0;
            long temporal = numero;
            do {
                temporal = temporal/10;
                digitos++;
            } while (temporal!=0);
            System.out.printf("%d tiene %d dígito/s.", numero, digitos);
        } catch (Exception e) {
            System.out.println("Ocurrió un error");
        }
        
    }
    
}
