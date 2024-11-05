package Ejercicio16;

public class Ejercicio16 {
    private static boolean divisible(int a, int b){
        return a % b == 0;
    }
    public static void main(String[] args) {
        try {
            System.out.println("Introduzca un número entero y le diré si es primo: ");
            int valor = Integer.parseInt(System.console().readLine());
            boolean esPrimo = true;
            for(int i=2; i < valor/2; i++){
                if(divisible(valor, i)){
                    esPrimo = false;
                    break;
                }
            }
            System.out.printf("El número introducido %s", (esPrimo)?"es primo":" no es primo");

        } catch(NumberFormatException e){
            System.out.println("Error: debe introducir un número");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error%"+e);
        }
    }
    
}
