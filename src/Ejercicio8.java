import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner calculo= new Scanner(System.in);
        System.out.println("1. caracter +");
        System.out.println("2. Caracter -");
        System.out.println("3. Caracter /");
        System.out.println("4. Caracter *");
        System.out.println("Que opcion quieres realizar:");
        int opcion= calculo.nextInt();
        int operando1= 0, operando2= 0;
        double resultado= 0.0;

        if (opcion>=1 && opcion<=4){
            System.out.println("Introduce el numero1:");
         operando1= calculo.nextInt();
        System.out.println("Introduce el numero2:");
        operando2= calculo.nextInt();
        }

        switch (opcion){
            case 1:
                System.out.println("Vas a sumar");
                resultado= operando1+operando2;

                break;
            case 2:
                System.out.println("Vas a restar");
                resultado= operando1-operando2;
                break;
            case 3:
                System.out.println("Vas a dividir");
                resultado= (double) operando1/operando2;
                break;
            case 4:
                System.out.println("Vas a multiplicar");
                resultado= operando1*operando2;
                break;
            default:
                System.out.println("La opcion no es valida ");
                break;
        }
        if (opcion>=1 && opcion<=4){
            System.out.println("El resultado es: "+resultado);
        }





    }
}
