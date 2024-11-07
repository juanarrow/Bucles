package Ejercicio30;
/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana. 
 * No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir como un número 
 * (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce los datos 
 * correctamente y que el segundo día es posterior al primero.
 */
public class Ejercicio30 {
    private static int solicitarDia(){
        int dia = 0;
        boolean diaCorrecto = false;
        while(!diaCorrecto){
            try {
                System.out.print("Día: ");
                String diaSemana = System.console().readLine();    
                dia = switch(diaSemana.toLowerCase()){
                    case "lunes"->1;
                    case "martes"->2;
                    case "miercoles", "miércoles"->3;
                    case "jueves"->4;
                    case "viernes"->5;
                    case "sabado", "sábado"->6;
                    case "domingo"->7;
                    default->0;                    
                };
                diaCorrecto = dia!=0;
                    
            } catch (Exception e) {
                System.out.println("Error: Ha ocurrido un error inesperado " + e);
            } finally{
                if(!diaCorrecto)
                    System.out.println("""
                        No se ha introducido correctamente el día de la semana.
                        Los días válidos son: lunes, martes, miércoles, jueves, viernes, sábado y domingo.
                        """);
            }
        }
        return dia;
    }

    private static int solicitarHora(){
        int hora = 0;
        boolean horaCorrecta = false;
        while(!horaCorrecta){
            try {
                System.out.print("Hora: ");
                hora = Integer.parseInt(System.console().readLine());
                horaCorrecta = hora>=0 && hora <=24;  
            } catch(NumberFormatException e){
                System.out.println("Error: Debe introducir un número");
            } catch (Exception e) {
                System.out.println("Error: Ha ocurrido un error inesperado " + e);
            } finally{
                if(!horaCorrecta)
                    System.out.println("No se ha introducido correctamente la hora del día.");
            }
        }
        return hora;
    }

    private static int horasTranscurridas(int dia, int hora){
        return (dia-1)*24+hora;
    }

    private static String diaSemana(int dia){
        return switch(dia){
            case 1->"lunes";
            case 2->"martes";
            case 3->"miércoles";
            case 4->"jueves";
            case 5->"viernes";
            case 6->"sábado";
            case 7->"domingo";
            default->"";
        };
    }

    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la primera hora.");
        int diaInicial = solicitarDia();
        int horaInicial = solicitarHora();
        System.out.println("Por favor, introduzca la segunda hora.");
        int diaFinal = solicitarDia();
        int horaFinal = solicitarHora();
        System.out.printf(
            "Entre las %02d:00 del %s y las %02d:00h del %s hay %d hora/s.",
            horaInicial, diaSemana(diaInicial), horaFinal, diaSemana(diaFinal),
             horasTranscurridas(diaFinal, horaFinal)-
             horasTranscurridas(diaInicial, horaInicial));
        
    }
    
}
