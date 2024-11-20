package Ejercicio55;

public class Ejercicio55 {
    private static int longitud(int valor){
        int _longitud = 0;
        while(valor!=0){
            _longitud++;
            valor /=10; 
        }
        return _longitud;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int valor = Integer.parseInt(System.console().readLine());
        valor = (valor % 10)*(int)Math.pow(10,longitud(valor)-1) + 
                (valor / 10);
        System.out.println("El número resultado es "+ valor);
    }
    
}
