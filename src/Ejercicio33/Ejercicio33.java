package Ejercicio33;

public class Ejercicio33 {

    public static void main(String[] args) {
        try {
            System.out.print("Introduzca la altura de la U: ");
            int altura = Integer.parseInt(System.console().readLine());    
            if(altura>2){
                for(int i=1; i<=altura-1;i++){
                    System.out.printf("* %"+((altura-2)*2+1)+"s%n","*");
                }
                System.out.print("  ");
                for(int i=1; i<=altura-2; i++){
                    System.out.print("* ");
                }
                System.out.print("  ");
            }
            else
                System.out.println("La altura de la U deber ser mínimo 2");
        } catch (Exception e) {
            System.out.println("Error. Ocurrió un error inesperado " + e);
        }
        
    }
}
