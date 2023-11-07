import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Dia= new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7: ");
        int diaSemana= Dia.nextInt();
        switch (diaSemana){
            case 1:
                System.out.println("Es el día lunes");
                break;
            case 2:
                System.out.println("Es el día Martes");
                break;
            case 3:
                System.out.println("Es el día miercoles");
                break;
            case 4:
                System.out.println("Es el día jueves");
                break;
            case 5:
                System.out.println("Es el día viernes");
                break;
            case 6:
                System.out.println("Es el día sabado");
                break;
            case 7:
                System.out.println("Es el día domingo");
                break;
        }
        System.out.println("El programa termina");

    }
}
