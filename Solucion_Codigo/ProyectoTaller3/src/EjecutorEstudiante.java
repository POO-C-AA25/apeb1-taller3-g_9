
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class EjecutorEstudiante {

    public static Estudiante estudiante;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese la calificacion 1: ");
        double calificacion1 = entrada.nextDouble();

        System.out.print("Ingrese la calificacion 2: ");
        double calificacion2 = entrada.nextDouble();

        System.out.print("Ingrese la calificacion 3: ");
        double calificacion3 = entrada.nextDouble();

       
        estudiante = new Estudiante(nombre, calificacion1,
                calificacion2, calificacion3);

        
        estudiante.calcularPromedio();
        estudiante.calcularCualitativo();

      
        System.out.println("\nInformacion de notas: ");
        System.out.println(estudiante);

        
    }
}

class Estudiante {

    public String nombre;
    public double calificacion1;
    public double calificacion2;
    public double calificacion3;
    public double promedio;
    public String cualitativo;

    public Estudiante(String nombre, double calificacion1,
            double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public void calcularPromedio() {
        this.promedio = (this.calificacion1 + 
                this.calificacion2 + this.calificacion3) / 3;
    }

    public void calcularCualitativo() {
        if (this.promedio < 6.5) {
            this.cualitativo = "Reprobado";
        } else {
            this.cualitativo = "Aprobado";
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n"
                + "Estado del estudiante: %s",
                nombre, calificacion1, calificacion2,
                calificacion3, promedio, cualitativo);
    }
}
