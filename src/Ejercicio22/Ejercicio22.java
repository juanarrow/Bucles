package Ejercicio22;

public class Ejercicio22 {
    private static boolean esPrimo(int valor){
        boolean _esPrimo = true;
        for(int i=2; i < valor/2; i++){
            if(valor % i == 0){
                _esPrimo = false;
                break;
            }
        }
        return _esPrimo;
    }
    public static void main(String[] args) {
        for(int i = 2; i<=100; i++){
            if(esPrimo(i)){
                System.out.printf("%d ", i);
            }
        } 
    }
    
}
