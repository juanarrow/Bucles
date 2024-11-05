package Ejercicio25;

public class Ejercicio25 {
    private static int longitud(int valor){
        int contador = 0;
        while(valor!=0){
            valor/=10;
            contador++;
        }
        return contador;
    }

    private static int voltear(int valor){
        int volteado = 0;
        while(valor!=0){
            volteado = volteado*10+(valor%10);
            valor/=10;
        }
        return volteado;
    }
    private static String imprimeDigitosDesdeHasta(int valor, int desde, int hasta){
        int volteado = voltear(valor);
        String resultado = "";
        int _longitud = longitud(valor);
        int i = 1;
        while(volteado!=0){
            if(i >= desde && i <= hasta)
                resultado+=""+(volteado % 10);
            i++;
            volteado/=10;
        }

        return resultado;
    }
    public static void main(String[] args) {
        int original = 123456700;
        int _longitud = longitud(original);

        int valor = original*10+1;
        
        int volteado = 0;
        while(valor!=0){
            volteado = volteado*10+(valor%10);
            valor/=10;
        }
        System.out.printf("original: %d volteado: %s",original, imprimeDigitosDesdeHasta(volteado,2,_longitud+1));
    }
    
}
