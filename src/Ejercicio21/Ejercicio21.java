package Ejercicio21;

public class Ejercicio21 {
    public static void main(String[] args) {
        try {
            System.out.println("""
                Por favor, vaya introduciendo números enteros.
                Puede terminar mediante la introducción de un número negativo.
                """);
            int valor = 0;
            int impares = 0;
            int sumaImpares = 0;
            int mayorPar = Integer.MIN_VALUE;
            int positivos = 0;
            while((valor = Integer.parseInt(System.console().readLine())) > 0){
                positivos++;
                if(valor%2 != 0)
                {
                    sumaImpares+=valor;
                    impares++;
                }
                else {
                    if(mayorPar < valor)
                        mayorPar = valor;    
                }
            }
            System.out.printf("Ha introducido %d números positivos%n", positivos);
            System.out.printf("La media de los impares es %d%n",(impares>0)?sumaImpares/impares:0); 
            System.out.printf("El máximo de los pares es %d%n", mayorPar); 

        } catch (NumberFormatException e) {
            System.out.println("Error. Debe introducir un número");
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
    }
    
}
