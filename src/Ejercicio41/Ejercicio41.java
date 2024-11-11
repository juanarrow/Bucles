package Ejercicio41;

public class Ejercicio41 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long valor = Long.parseLong(System.console().readLine());
        long valorInicial = valor;
        int pares = 0;
        int impares = 0;
        while(valor!=0){
            if(((valor%10)%2)==0)
                pares++;
            else
                impares++;
            valor/=10;
        }
        System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares.", valorInicial, pares, impares);
    }
}
