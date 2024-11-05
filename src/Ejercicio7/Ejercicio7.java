package Ejercicio7;

public class Ejercicio7 {
    public static void ejercicio7(){
        final int CLAVE = 8888;
        int intentos = 1;
        boolean acierto = false;
        boolean error = false;
        do{
            System.out.print("Introduzca la clave de la caja fuerte: ");
            try {
                int valor = Integer.parseInt(System.console().readLine());    
                acierto = valor==CLAVE;
                if(!acierto)
                    System.out.println("Clave incorrecta");
            } catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un número");
            } catch (Exception e){
                error = true;
            }     
            intentos++;
        } while(intentos<=4 && !acierto && !error);
        if(!error){
            if(acierto)
                System.out.println("Ha abierto la caja fuerte.");
            else
                System.out.println("Lo siento, ha agotado las 4 oportunidades");
        }
        else
            System.out.println("Ocurrió un error inesperado");
    }
    
}
