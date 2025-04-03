import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado, documentoEmpleado, diaDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas = 0;
        double valorHora=0;
        double bonificacionEmpleado= 0;
        double valorSalarioMinimo= 1423500;
        double auxilioTransporte=200000;
        double cantidadHorasExtras=0;
        double valorHoraExgtra=0;
        double totalHorasExtras=0;

        System.out.print("ingrese el nombre del empleado:");
        nombreEmpleado = sc.nextLine();
        System.out.print("ingrese el documento del empleado:");
        documentoEmpleado = sc.nextLine();
        System.out.print("Ingrese el dia de descanso:  (Lunes - Viernes)");
        diaDescanso= sc.nextLine();
    }
}
