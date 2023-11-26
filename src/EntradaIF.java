import java.util.Scanner;

public class EntradaIF {
    public static void main(String[] args) {
        int nota = 10;
        int cantidad = -1;

        //5-10



        // tipo if.elseif.else

        //posible condiciones
        //suspenso - 1a4.99
        //aprobado 5a6.99
        //notable 7a8.99
        //sobresaliente 9a9.99
        //matricula 10
        System.out.println("Estoy ejecutando el programa");
        if(nota>=1 && nota<=10){
            if(nota>=0 && nota<5){
                System.out.println("Has suspendido");
            }else if (nota >=5 &&nota <7) {
                System.out.println("Has Aprobado.");
            } else if (nota >=7 && nota <9) {
                System.out.println("Has aprobado, tienes un Notable");
            } else if (nota >=9 && nota <10) {
                System.out.println("Has aprobado, has sacando un Sobresaliente");
            } else {
                System.out.println("Has sacado MH");
            }

        }else{
            System.out.println("Nota no valida");
        }
        //Ejercicio: saber que un numero es par
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero a evaluar");
        int numero = scanner.nextInt();
        //Condiciones que tiene que cumplir el numero para que sea par
        //Es par el numero?
        //si se puede dividir entre 2 y si el resto de divir entre 2 es 0
        if(numero%2==0){
            System.out.println("numero par");
        }else {
            System.out.println("Numero impar");
        }

        //ternario o condicional? valor_true : valor_false

        String par = numero%2==0 ? "Es par" : "Es Impar";




        System.out.println("Terminado el programa");

    }
}
