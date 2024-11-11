package Ejercicio40;

public class Ejercicio40 {
    public static void main(String[] args) {
        int altura = 3;
        int fila = 1;
        for(int i=1; i<=altura*2-1;i++){
            for(int j=1;j<=altura-fila;j++)
                System.out.print(" ");
            System.out.print("*");
            if(fila!=1) {
                for(int j=1;j<=2*fila-3;j++)
                    System.out.print(" ");
                System.out.println("*");
            }
            else
                System.out.println();
            if(i<=(altura*2-1)/2)
                fila++;
            else 
                fila--;
        }
    }
    
}
