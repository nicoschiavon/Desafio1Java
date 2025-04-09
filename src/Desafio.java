import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        int entrada = 0;
        double nuevoMonto;
        double saldo = 1599.99;
        System.out.println("**********************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.printf("Saldo disponible: %.2f$%n", saldo);
        System.out.println("\n**********************************************");

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while(entrada != 9){
            System.out.println(menu);
            entrada = input.nextInt();

            switch (entrada){
                case 1:
                    System.out.printf("El saldo actualizado es: %.2f$%n", saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    nuevoMonto = input.nextDouble();
                    if (nuevoMonto > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= nuevoMonto;
                        System.out.printf("Su nuevo saldo es de: %.2f$%n", saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que deseas depositar?");
                    nuevoMonto = input.nextDouble();
                    saldo += nuevoMonto;
                    System.out.printf("Su nuevo saldo es de %.2f$%n", saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por usar el servicio");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;

        }



        }
    }
}
