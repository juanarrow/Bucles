package Ejercicio69;

public class Ejercicio69 {
    public static void main(String[] args) {
        
        try {
            System.out.print("Introduzca la altura de la pirámide maya: ");
            int altura = Integer.parseInt(System.console().readLine());    
            for(int i = 1; i <= altura; i++){
                //Pinto los espacios
                for(int j=1; j<= altura-i; j++)
                    System.out.print(" ");
                //Pinto los asteriscos de la izquierda
                for(int j=1; j<=i; j++)
                    System.out.print("*");
                if(i%2==0)
                    System.out.print("    ");
                else
                    System.out.print("****");
                //Pinto los asteriscos de la izquierda
                for(int j=1; j<=i; j++)
                    System.out.print("*");
                System.out.println();
                
            }
        } catch(NumberFormatException e){
            System.out.print("Error. Debe introducir un número");
        } catch (Exception e) {
            System.out.print("Error. Ocurrió un error inesperado");
        }
        
    }
    
}
