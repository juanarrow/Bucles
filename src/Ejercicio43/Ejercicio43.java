package Ejercicio43;

public class Ejercicio43 {
    public static long voltea(long valor){
        long volteado = 0;
        while(valor!=0){
            volteado = (volteado*10) + (valor % 10);
            valor /= 10;
        }
        return volteado;
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int aDividir = Integer.parseInt(System.console().readLine());
        long valor1 = 0;
        long valor2 = 0;
        valor = voltea(valor*10+1);
        int posicion = 1;
        while(valor!=0){
            int digito = (int)(valor%10);
            if(posicion < aDividir)
                valor1=valor1*10+digito;
            else
                valor2=valor2*10+digito;
            valor/=10;
            posicion++;
        }
        valor/=10;
        valor2/=10;
        System.out.printf("Los números partidos son el %d y el %d.", valor1, valor2);

    }
    
}
