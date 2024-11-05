package Ejercicio11;

public class Ejercicio11 {

    private static int longitud(long valor){
        int _longitud = 0;
        while(valor!=0){
            valor = valor / 10;
            _longitud++;
        }
        return _longitud;
    }
    public static void main(String args[]){
        try {
            final int MAX_ELEMENTOS = 20;
            System.out.println("Introduzca un número: ");    
            int valor = Integer.parseInt(System.console().readLine());
            int max = valor + MAX_ELEMENTOS - 1; 
            long long1 = longitud(max); 
            long long2 = longitud((long)Math.pow(max,2));
            long long3 = longitud((long)Math.pow(max,3));
            System.out.printf("| %-"+long1+"s | %-"+long2+"s | %-"+long3+"s%n", "n", "n2", "n3");
            for(int i = 1; i<=9+long1+long2+long3;i++)
                System.out.print("-");
            System.out.println();
            for(int i = 0; i<MAX_ELEMENTOS; i++)
                System.out.printf("| %-"+long1+"d | %-"+long2+"d | %-"+long3+"d%n",
                    valor+i, 
                    (long)Math.pow(valor+i,2), 
                    (long)Math.pow(valor+i, 3));
            
        } catch(NumberFormatException e){
            System.out.println("Error: debe introducir un número");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error%"+e);
        }
        
    }
    
}
