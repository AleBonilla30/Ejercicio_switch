import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner letra= new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        String letra1= letra.nextLine();


        switch (letra1){
            case "A":
                System.out.println("Es una vocal");
                break;
            case "E":
                System.out.println("Es una vocal");
                break;
            case "I":
                System.out.println("Es una vocal");
                break;
            case "O":
                System.out.println("Es una vocal");
                break;
            case "U":
                System.out.println("Es una vocal");
                break;
            case "a":
                System.out.println("Es una vocal");
                break;
            case "e":
                System.out.println("Es una vocal");
                break;
            case "i":
                System.out.println("Es una vocal");
                break;
            case "o":
                System.out.println("Es una vocal");
                break;
            case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;


        }
        System.out.println("El programa termina");
    }
}
