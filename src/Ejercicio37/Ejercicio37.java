package Ejercicio37;

public class Ejercicio37 {
    public static int longitud(int valor){
        int _longitud = 0;
        while(valor!=0){
            valor = valor / 10;
            _longitud++;
        }
        return _longitud;
    }
    public static int voltea(int valor){
        int volteado = 0;
        while(valor!=0){
            volteado = (volteado*10) + (valor % 10);
            valor /= 10;
        }
        return volteado;
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int valor = Integer.parseInt(System.console().readLine());

        int volteado = voltea(valor*10+1);
        int longitudValor = longitud(volteado);
        System.out.printf("El %d en decimal es el ", valor);

        for(int i=1; i<longitudValor; i++){
            for(int j =1; j<=volteado%10;j++){
                System.out.print("|");
            }
            if(i!=longitudValor-1)
                System.out.print("-");
            volteado/=10;
        }
        System.out.printf(" en el sistema de palotes");


    }
    
}
