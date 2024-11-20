package Ejercicio8;

public class Ejercicio8 {
    public static void ejercicio8(){
        try {
            System.out.println("Introduzca un número y le mostraré su tabla de multiplicar: ");
            int numero = Integer.parseInt(System.console().readLine());
            for(int i=0;i<=10;i++)
                System.out.printf("%3d x %2d = %3d%n",numero, i,i*numero);    
        } catch(NumberFormatException e){
            System.out.println("Debe introducir un número");
        }catch (Exception e) {
            System.out.println("Error inesperado");
        }
        
    }
    
}
