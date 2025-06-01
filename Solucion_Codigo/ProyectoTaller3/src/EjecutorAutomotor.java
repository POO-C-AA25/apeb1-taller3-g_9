
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class EjecutorAutomotor {

    public static Auto auto;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cedula del dueño: ");
        int cedula = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = entrada.nextLine();

        System.out.print("Ingrese el año de fabricacion: ");
        int anoFabricacion = entrada.nextInt();

        System.out.print("Ingrese el valor del vehiculo: ");
        double valorVehiculo = entrada.nextDouble();

        auto = new Auto(marca, valorVehiculo, anoFabricacion, cedula);

        auto.calcularAnoDeAntiguedad();
        auto.calcularValorMatricula();

        System.out.println("\nInformacion del Vehiculo: ");
        System.out.println(auto);

    }
}

class Auto {

    public int cedula;
    public int anoFabricacion;
    public double valorVehiculo;
    public String marca;
    public double valorMatricula;
    public int anoDeAntiguedad;

    public Auto(String marca, double valorVehiculo,
            int anoFabricacion, int cedula) {
        this.marca = marca;
        this.valorVehiculo = valorVehiculo;
        this.anoFabricacion = anoFabricacion;
        this.cedula = cedula;
    }

    public void calcularAnoDeAntiguedad() {
        this.anoDeAntiguedad = 2025 - this.anoFabricacion;
    }

    public void calcularValorMatricula() {
        this.valorMatricula = 0.002 * this.valorVehiculo * this.anoDeAntiguedad;
    }

    @Override
    public String toString() {
        return String.format("Marca del vehiculo: %s\n"
                + "Cedula del propietario: %d\n"
                + "Año de fabricacion: %d\n"
                + "Años de antigüedad: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f",
                marca, cedula, anoFabricacion,
                anoDeAntiguedad, valorVehiculo, valorMatricula);
    }
}
