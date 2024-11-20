package Ejercicio20bis;

public class Ejercicio20bis {
    private static void imprimePiramide(int altura, char simbolo, boolean hueca){
        int fila = 1;
        for(int i=fila; i <=altura; i++){
            for(int j=0;j<altura-i;j++)
                System.out.print(" ");
            int simbolosEnElMedio = 2*i-3;
            System.out.print(simbolo);
            for(int j=0; j<simbolosEnElMedio; j++){
                if(hueca && i!=altura)
                    System.out.print(' ');
                else
                    System.out.print(simbolo);
            }
            if(simbolosEnElMedio>0)
                System.out.print(simbolo);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("Por favor, introduzca la altura de la pirámide: ");
            int altura = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el carácter de relleno: ");
            char simbolo = System.console().readLine().charAt(0);
            System.out.println("¿Hueca? (s/n): ");
            boolean hueca = System.console().readLine().toLowerCase().charAt(0)=='s';
            imprimePiramide(altura, simbolo, hueca);
        } catch(NumberFormatException e){
            System.out.println("Error: debe introducir un número");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error %s"+e);
        }
    }
    
}
