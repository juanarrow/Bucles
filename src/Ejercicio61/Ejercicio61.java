package Ejercicio61;

public class Ejercicio61 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura >= 3){
            for(int fila=altura; fila>=1; fila--){
                for(int espacios=1;espacios<=altura-fila; espacios++)
                    System.out.print(" ");
                System.out.print("***");
                for(int espacios=1; espacios<=2*(fila-1); espacios++)
                    System.out.print(" ");
                System.out.println("***");
            }
        }
        else{
            System.out.println("La altura debe ser mayor o igual que 3");
        }
        

    }
    
}
