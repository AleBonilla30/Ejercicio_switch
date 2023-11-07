import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner mes= new Scanner(System.in);
        System.out.println("Introduza el mes en numero: ");
        int Meses= mes.nextInt();
        int dias;
        switch (Meses){

            case 1: case 3: case 5: case 7: case 8: case 10 : case 12 :
                dias=31;
                System.out.println(+ Meses+" Tiene "+dias);
                break;
            case 4: case  6: case 11:
                dias=30;
                System.out.println(+ Meses+" Tiene "+dias);
                break;
            case 2:
                dias= 28;
                System.out.println(+ Meses+" Tiene "+dias);
                break;
            default:{
                System.out.println("Numero de mes no valido, introduzca un numero entre 1 y 12");
            }


        }
    }
}
