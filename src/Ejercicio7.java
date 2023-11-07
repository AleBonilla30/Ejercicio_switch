import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        int nota= numero.nextInt();

        switch (nota){

            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Aporbado");
                break;
            case 3:
                System.out.println("Notable");
                break;
            case 4:
                System.out.println("Sobresaliente");
                break;
            case 5:
                System.out.println("Matricula de Honor");
                break;
            default:
                System.out.println("No esta dentro del rango de nota");
                break;

        }
        System.out.println("Programa terminado");
    }
}
