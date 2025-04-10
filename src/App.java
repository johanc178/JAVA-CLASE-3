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
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 1423500;
        double auxilioTransporte = 200000;
        double cantidadHorasExtras = 0;
        double valorHoraExgtra = 0;
        double totalHorasExtras = 0;

        System.out.print("ingrese el nombre del empleado:");
        nombreEmpleado = sc.nextLine();
        System.out.print("ingrese el documento del empleado:");
        documentoEmpleado = sc.nextLine();
        System.out.print("Ingrese el dia de descanso:  (Lunes - Viernes)");
        diaDescanso = sc.nextLine();
        System.out.print("ingrese el valor de la hora:");
        valorHora = sc.nextDouble();
        System.out.print("ingrese la cantidad de horas trabajadas:");
        horasTrabajadas = sc.nextDouble();

        salarioBruto = horasTrabajadas * valorHora;
        if (salarioBruto <= valorSalarioMinimo * 2) {
            /* si recibe auxilio de transporte */
            auxilioTransporte = 200000;
            bonificacionEmpleado = salarioBruto * 0.1;

        } else {
            auxilioTransporte = 0;
            bonificacionEmpleado = 0;
        }
        deduccionPension = salarioBruto * 0.04;
        deduccionSalud = salarioBruto * 0.04;
        if (horasTrabajadas > 96) {
            cantidadHorasExtras = horasTrabajadas - 96;
            valorHoraExgtra = valorHora * 1.25;
            totalHorasExtras = cantidadHorasExtras * valorHoraExgtra;
        } else {
            cantidadHorasExtras = 0;
            valorHora = 0;
            totalHorasExtras = 0;

        }
        if (horasTrabajadas < 24) {
            System.out.print("aun no le puedo pagar, trabaje mas");

        } else
            salarioNeto = salarioBruto - deduccionPension - deduccionSalud + auxilioTransporte + bonificacionEmpleado
                    + totalHorasExtras;

        System.out.print("El nombre del empleado es:" + nombreEmpleado);
        System.out.print("Su numero de documento es:" + documentoEmpleado);
        System.out.println("Horas trabajadas" + horasTrabajadas);
        System.out.println("Su dia de descanso es" + diaDescanso);
        System.out.println("valor de hora trabajada es"+ valorHora);
        System.out.print("El salario neto del empleo es:" + salarioNeto);


    }
}
