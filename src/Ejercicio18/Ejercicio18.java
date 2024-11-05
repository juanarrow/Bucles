package Ejercicio18;

public class Ejercicio18 {
    public static void main(String[] args) {
        try {
            System.out.println("Introduzca un número entero: ");
            int v1 = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca otro número entero distinto al anterior: ");
            int v2 = Integer.parseInt(System.console().readLine());
            if(v1 > v2){
                int aux = v1;
                v1 = v2;
                v2 = aux;
            }
            for(int i=v1; i<=v2;i+=7)
                System.out.print(i+" ");
            

        } catch(NumberFormatException e){
            System.out.println("Error: debe introducir un número");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error%"+e);
        }
    }
    
}
