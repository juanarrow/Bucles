package Ejercicio48;

public class Ejercicio48 {
    private static String obtenerValores(int origen, boolean estan){
        String result = "";
        for(int i=0;i<=9;i++){
            int aux = origen;
            boolean noesta = true;
            while(aux!=0){
                int digito = aux%10;
                if(estan){
                    if((digito==i)){
                        result += digito + " ";
                        if(estan)
                            break;
                    }
                }
                else{
                    if((digito==i)){
                        noesta = false;
                    }
                }
                aux/=10;
            }
            if(!estan && noesta)
                result += i + " ";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.print("Dígitos que aparecen en el número: "+ obtenerValores(valor, true)+"\n");
        System.out.print("Dígitos que no aparecen en el número: "+ obtenerValores(valor, false)+"\n");
    }
    
}
