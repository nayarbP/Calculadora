
package calcualdorapruebas;
import java.util.Scanner;


public class CalcualdoraPruebas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecciona la operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();
        String operador = "";

        switch (opcion) {
            case 1:
                operador = "+";
                break;
            case 2:
                operador = "-";
                break;
            case 3:
                operador = "*";
                break;
            case 4:
                operador = "/";
                break;
            default:
                System.out.println("Opción no válida");
                scanner.close();
                return;
        }

        String expresion = numero1 + operador + numero2;
        double resultado = OperacionesBasicas.calcularexpresion(expresion);

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
    
}
