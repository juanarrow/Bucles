package Ejercicio12;


public class Ejercicio12 {
    private static String fibonacci(int valores){
        String resultado = "0 1";
        int n1 = 0;
        int n2 = 1;
        for(int i = 0 ; i < valores-2; i++){
            int n3 = n1+n2;
            resultado += " "+n3;
            n1 = n2;
            n2 = (n3);
        }
        return resultado;
    }
    public static void main(String[] args) {
        try {
            System.out.print("""
                Este programa muestra los n primeros números de la serie de Fibonacci.
                Por favor, introduzca n: """);
            int valores = Integer.parseInt(System.console().readLine());    
            switch(valores){
                case 0:
                    System.out.println("Debe indicar al menos un valor");
                    break;
                case 1:
                    System.out.println("0");
                    break;
                case 2:
                    System.out.println("0 1");
                    break;
                default:
                    if(valores > 0)
                        System.out.println(fibonacci(valores));
                    else
                        System.out.println("Error. Debe introducir un valor positivo mayor que 0");
            }

        } catch(NumberFormatException e){
            System.out.println("Error: debe introducir un número");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error%"+e);
        }
        
    }
    
}
