package Ejercicio38;

public class Ejercicio38 {
    public static void main(String[] args) {
        int altura = 3;
        int fila = 3;
        for(int i=1; i<=altura*2-1;i++){
            for(int j=1;j<=altura-fila;j++)
                System.out.print(" ");
            for(int j=1;j<=2*fila-1;j++)
                System.out.print("*");
            
            System.out.println("");
            if(i<=(altura*2-1)/2)
                fila--;
            else 
                fila++;

            
        }
    }
    
}
