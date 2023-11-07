import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        System.out.println("Introduzca un numero del 1 al 4");
        int num= numero.nextInt();
        switch (num){
            case 1:
                System.out.println("La opcion 1 seleccionada");
                break;
            case 2:
                System.out.println("La opcion 2 descartada");
                break;
            case 3:
                System.out.println("La opcion 3 pre-seleccionada");
                break;
            case 4:
                System.out.println("La opcion 4 premio");
                break;
            default:{
                System.out.println("No es un numero correcto. Ingrese del 1 al 4");
            }

        }
        System.out.println("Programa terminado");
    }
}
