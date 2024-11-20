package Ejercicio51;

public class Ejercicio51 {
    private static int voltea(int valor){
        int volteado = 0;
        while(valor!=0){
            volteado = volteado * 10 + valor % 10;
            valor /=10; 
        }
        return  volteado;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero (mayor que cero): ");
        int valor = Integer.parseInt(System.console().readLine());
        int aux = voltea(valor*10+1);
        int filtrado = 0;
        while(aux!=0){
            int digito = aux % 10;
            if(digito != 0 && digito != 8)
                filtrado = filtrado * 10 + digito;
            aux /= 10;
        }
        filtrado /= 10;
        System.out.println("Después de haber sido comido por el gusano numérico se queda en "+ filtrado);
    }
    
}
