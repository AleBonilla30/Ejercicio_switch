import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner calculo= new Scanner(System.in);

        System.out.println("Que opcion quieres realizar (+,-,*,/)");
        char caracter= calculo.next().charAt(0);


        System.out.println("Introduce el numero1:");
          int operando1= calculo.nextInt();
        System.out.println("Introduce el numero2:");
        int operando2= calculo.nextInt();
        int resultado= 0;


        switch (caracter){
            case '+':
                System.out.println("Vas a sumar");
                resultado= operando1+operando2;

                break;
            case '-':
                System.out.println("Vas a restar");
                resultado= operando1-operando2;
                break;
            case '/':
                System.out.println("Vas a dividir");
                resultado=  operando1/operando2;
                break;
            case '*':
                System.out.println("Vas a multiplicar");
                resultado= operando1*operando2;
                break;
            default:
                System.out.println("La opcion no es valida ");
                break;
        }
        System.out.println("El resultado es: "+resultado);



    }


    }

