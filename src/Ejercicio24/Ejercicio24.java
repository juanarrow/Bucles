package Ejercicio24;

public class Ejercicio24 {
    private static String pintarPiramideInterior(int fila, int digitos){
        String resultado = "";
        int valor = 1;
        for(int i = 1; i<=2*fila-1;i++){
            resultado+=String.format("%"+digitos+"s ",valor);
            if(i>(2*fila-1)/2)
                valor--;
            else   
                valor++;
        }
        return resultado;
    }
    private static String espacios(int fila, int altura, int digitos){
        String resultado = "";
        for(int i=1; i <= altura-fila; i++)

            resultado+=String.format("%"+digitos+"s ", "");
        
        return resultado;
    }

    private static int longitud(int valor){
        return (""+valor).length();
    }
    public static void main(String[] args) {
        int altura = 15;
        int digitos = longitud(altura);
        for(int i=1; i<=altura; i++){
            System.out.printf("%s%s%n",espacios(i, altura, digitos), pintarPiramideInterior(i, digitos));
        }
        
    }
    
}
