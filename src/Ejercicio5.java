import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner mes= new Scanner(System.in);
        System.out.println("Introduzca el mes en número: ");
        int numero= mes.nextInt();

        switch (numero){
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es junio");
                break;
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case  9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
                break;
            default:{
                System.out.println("El numero de mes no es correcto");
            }
        }
    }
}
