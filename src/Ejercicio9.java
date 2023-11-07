import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner estacion= new Scanner(System.in);
        System.out.println("Introduce un numero de 1 al 12:");
        int num= estacion.nextInt();

        switch (num){

            case 1: case 2: case 12:
                System.out.println("Es Invierno");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("Es Primavera");
                break;
            case 7: case 8: case 9:
                System.out.println("Es verano");
                break;
            case 10: case 11:
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("El numero no es valido");
        }
    }
}
