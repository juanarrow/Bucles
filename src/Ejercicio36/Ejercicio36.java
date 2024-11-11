package Ejercicio36;

public class Ejercicio36 {   
    public static long voltea(long valor){
        long volteado = 0;
        while(valor!=0){
            volteado = (volteado*10) + (valor % 10);
            valor /= 10;
        }
        return volteado;
    }
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long valor = Long.parseLong(System.console().readLine());
        long valorInicial = valor;
        valor = valor*10+1;
        valor = voltea(valor)*10+1;
        long volteado = voltea(valor);
        boolean capicua = true;
        while(valor!=0 && capicua){
            if((valor%10)!=(volteado%10))
                capicua = false;
            valor/=10;
            volteado/=10;
        }
        System.out.printf("El %d %s",valorInicial, capicua?"es capicúa":"no es capicúa");
    }
    
}
