import java.util.Scanner;

public class EntradaSwitch {
    public static void main(String[] args) {
        System.out.println("Inciando Programa");
        //aqui evaluamos un valor : int, char, string
        Scanner scanner =new Scanner(System.in);
        System.out.println("Intrudice numero");
        int numero = scanner.nextInt();
        //String palabra ="Hola";
        //char letra = 'R';
        //En este caso no pregunta sino dirrectamente hace el caso en concreto que le toca. Va directo al grano
        //6
        // 1 ->
        //4 ->
        //6 ->
        // otro ->
        switch (numero){
            case 1:
                System.out.println("El valor es 1");
                break;
            case 2:
                System.out.println("El valor es 4");
                break;
            case 3:
                System.out.println("El valor es 6");
                break;
            default:
                System.out.println("No contemplado");
                break;
        }
        System.out.println("Terminando programa");
    }
}
