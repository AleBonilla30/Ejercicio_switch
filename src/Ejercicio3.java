import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Numero= new Scanner(System.in);

        System.out.println("Introduce un numero ");

        int num= Numero.nextInt();
        int reultado=0;

        switch (reultado ){
            case 0:
                reultado= num%2;
                System.out.println("Es par");
                break;
            case 1:
                System.out.println("Es impar");
                break;
        }

        }
        }


