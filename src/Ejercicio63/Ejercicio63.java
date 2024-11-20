package Ejercicio63;

public class Ejercicio63 {
    public static void pintaPiramide(int fila, int altura){
        if(fila>=1){
            //Pinto los espacios de la izquierda
            for(int i = 1; i <=altura-fila; i++)
                System.out.print(" ");
            //Pinto los asteriscos hasta la mitad
            for(int i = 1; i <=fila; i++)
                System.out.print("*");
            //Pinto los asteriscos que quedan
            for(int i = 1; i <=fila-1; i++)
                System.out.print("*");
            //Pinto los espacios de la derecha
            for(int i = 1; i <=altura-fila; i++)
                System.out.print(" ");
        } else {
            //Pinto los espacios de la izquierda
            for(int i = 1; i <=2*altura-1; i++)
                System.out.print(" ");
        }
        
        
    }
    public static void main(String[] args) {
        try {
            System.out.print("Introduzca la altura de la primera pirámide: ");
            int alt1 = Integer.parseInt(System.console().readLine());
            System.out.print("Introduzca la altura de la segunda pirámide: ");
            int alt2 = Integer.parseInt(System.console().readLine());
            int diferenciaAltura = Math.abs(alt1-alt2);
            int altMax = Math.max(alt1, alt2);
            for(int i = 1; i<=altMax; i++){
                if(alt1>=alt2){
                    pintaPiramide(i, alt1);
                    System.out.print("   ");
                    pintaPiramide(i-diferenciaAltura, alt2);
                } else {
                    pintaPiramide(i-diferenciaAltura, alt1);
                    System.out.print("   ");
                    pintaPiramide(i, alt2);
                }
                System.out.println();
            }
        } catch(NumberFormatException e){
            System.out.print("Error. Debe introducir un número");
        }catch (Exception e) {
            System.out.print("Error. Ocurrió un error inesperado");
        }
    }
    
}
