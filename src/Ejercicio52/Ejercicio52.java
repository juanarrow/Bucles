package Ejercicio52;

public class Ejercicio52 {
    private static int voltea(int valor){
        int volteado = 0;
        while(valor!=0){
            volteado = volteado * 10 + valor % 10;
            valor /=10; 
        }
        return  volteado;
    }
    private static int longitud(int valor){
        int _longitud = 0;
        while(valor!=0){
            _longitud++;
            valor /=10; 
        }
        return _longitud;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        int volteado = voltea(valor*10+1);
        int digito = volteado % 10;
        volteado /= 10;
        volteado = voltea(volteado) / 10;
        volteado = volteado * 10 + digito;
        System.out.printf("El número resultado es %0"+longitud(valor)+"d", volteado);
    }
    
}
