package Ejercicio48bis;

public class Ejercicio48bis {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        int digitos = 0;
        while(valor!=0){
            digitos = digitos + (int)Math.pow(10, valor%10);
            valor/=10;
        }
        System.out.print("Dígitos que aparecen en el número: ");
        extracted(digitos, true);
        
        System.out.println();
        System.out.print("Dígitos que aparecen en el número: ");
        extracted(digitos, false);
    }

    private static void extracted(int digitos, boolean esta) {
        for(int i = 0; i<=9; i++)
            if(esta && (digitos / (int)Math.pow(10, i)%10)>0 ||
               !esta && (digitos / (int)Math.pow(10, i)%10)==0)
                System.out.print(i+ " ");
    }
    
}
