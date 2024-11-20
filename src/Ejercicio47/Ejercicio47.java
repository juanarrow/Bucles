package Ejercicio47;

public class Ejercicio47 {
    private static void imprimirFilas(int altura){
        for(int i = 1; i<=(altura-3)/2; i++)
            System.out.println("M    M");
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = Integer.parseInt(System.console().readLine());   
        if(altura % 2 != 0 && altura >=5){
            System.out.println("MMMMMM");
            imprimirFilas(altura);
            System.out.println("MMMMMM");
            imprimirFilas(altura);
            System.out.println("MMMMMM");
        }
        else{
            System.out.println("La altura introducida no es correcta");
        }
    }
    
}
