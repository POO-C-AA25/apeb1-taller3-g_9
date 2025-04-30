
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class EjecutorEmprendimiento {

    public static Emprendimiento emprendimiento;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Información del Emprendimiento ");

        emprendimiento = new Emprendimiento();
        emprendimiento.actualizarInfo(entrada);
        emprendimiento.calcularAntiguedad();
        emprendimiento.determinarTipoNegocio();

        System.out.println("\n Resultado ");
        System.out.println(emprendimiento);

    }
}

class Emprendimiento {

    public String nombreComercial;
    public int ruc;
    public String sectorEconomico;
    private String propietario;
    public String ubicacion;
    public int fechaInicio;
    private double capitalInicial;
    public int antiguedad;
    public String tipoNegocio;

    public Emprendimiento() {

    }

    public void actualizarInfo(Scanner entrada) {
        System.out.print("Ingrese el nombre del propietario"
                + " y continue con la actualizacion: ");
        propietario = entrada.nextLine();

        System.out.print("Ingrese el nombre comercial: ");
        nombreComercial = entrada.nextLine();

        System.out.print("Ingrese el RUC: ");
        ruc = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Ingrese el sector económico: ");
        sectorEconomico = entrada.nextLine();

        System.out.print("Ingrese la ubicación: ");
        ubicacion = entrada.nextLine();

        System.out.print("Ingrese el año de inicio de actividades: ");
        fechaInicio = entrada.nextInt();

        System.out.print("Ingrese el capital inicial: ");
        capitalInicial = entrada.nextDouble();
    }

    public void calcularAntiguedad() {
        antiguedad = 2025 - fechaInicio;
    }

    public void determinarTipoNegocio() {
        if (capitalInicial < 1000) {
            tipoNegocio = "Micro";
        } else if (capitalInicial <= 10000) {
            tipoNegocio = "Pequeño";
        } else {
            tipoNegocio = "Mediano";
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre comercial: %s\n"
                + "Propietario: %s\n"
                + "RUC: %d\n"
                + "Sector económico: %s\n"
                + "Ubicación: %s\n"
                + "Año de inicio: %d\n"
                + "Antigüedad: %d años\n"
                + "Capital inicial: %.2f\n"
                + "Tipo de negocio: %s",
                nombreComercial, propietario, ruc, sectorEconomico,
                ubicacion, fechaInicio, antiguedad,
                capitalInicial, tipoNegocio);
    }
}
