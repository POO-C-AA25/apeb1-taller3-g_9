/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
import java.util.Scanner;

public class EjecutorSueldo {

    public static SueldoBasico sueldo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el apellido del profesor: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese el sueldo basico del profesor: ");
        double sueldoB = entrada.nextDouble();

        sueldo = new SueldoBasico(nombre, apellido, sueldoB);

        sueldo.calcularSueldoTotal();

        System.out.println("\nInformacion de pagos");
        System.out.println(sueldo);
    }
}

class SueldoBasico {

    public String nombre;
    public String apellido;
    public double sueldoB;
    public double sueldoT;

    public SueldoBasico() {
    }

    public SueldoBasico(String nombre, String apellido, double sueldoB) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoB = sueldoB;
    }

    public void calcularSueldoTotal() {
        this.sueldoT = this.sueldoB + this.sueldoB * 0.2;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n",
                nombre, apellido, sueldoB, sueldoT);
    }
}
