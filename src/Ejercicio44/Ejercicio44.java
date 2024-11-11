package Ejercicio44;

public class Ejercicio44 {
    public static int longitud(long valor){
        int _longitud = 0;
        while(valor!=0){
            _longitud++;
            valor/=10;
        }
        return _longitud;
    }
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
        System.out.print("Introduzca la posición donde quiere insertar: ");
        int aDividir = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el dígito que quiere insertar: ");
        int aInsertar = Integer.parseInt(System.console().readLine());
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
        long union = (valor1*10+aInsertar)*(long)Math.pow(10, longitud(valor2))+valor2;
        System.out.printf("El número resultante es %d", union);

    }
    
}
