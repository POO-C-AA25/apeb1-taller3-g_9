
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class Ejecutor_Instituciones_Educativas {

    public static Instituciones institucion;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la institución: ");

        String nombre = entrada.nextLine();

        System.out.print("Ingrese si es pública o privada: ");
        String tipoInst = entrada.nextLine();

        System.out.print("Ingrese el número de alumnos: ");
        int numeroAlum = entrada.nextInt();

        System.out.print("Ingrese el número de docentes: ");
        int numDocentes = entrada.nextInt();

        System.out.print("Ingrese el número de sedes: ");
        int numSedes = entrada.nextInt();

        System.out.print("Ingrese los gastos proyectados por estudiante: ");
        double gastosPorEstudiante = entrada.nextDouble();

        
        institucion = new Instituciones(nombre, tipoInst, numeroAlum,
                numDocentes, numSedes, gastosPorEstudiante); 
        // se utiliza directamente el contructor ya dandole todo 

        
        institucion.calcularPresupuesto();

        
        System.out.println(institucion);

        
    }
}


class Instituciones {

    public String nombre;
    public String tipoInst;
    public int numeroAlum;
    public int numDocentes;
    public int numSedes;
    public double gastosPorEstudiante;
    public double presupuesto;

    
    public Instituciones() {
    }
    
    public Instituciones(String nombre, String tipoInst,
            int numeroAlum, int numDocentes,
            int numSedes, double gastosPorEstudiante) {
        this.nombre = nombre;
        this.tipoInst = tipoInst;
        this.numeroAlum = numeroAlum;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosPorEstudiante = gastosPorEstudiante;
    }

    public void calcularPresupuesto() {
        this.presupuesto = this.numeroAlum * this.gastosPorEstudiante;
    }

    @Override
    public String toString() {
        return String.format("Nombre de la institucion: %s"
                + " \nTipo: %s"
                + " \nNúmero de alumnos: %d"
                + " \nNúmero de docentes: %d"
                + " \nNúmero de sedes: %d"
                + "\nGastos por estudiante: %.2f"
                + " \nPresupuesto total: %.2f",
                nombre,
                tipoInst,
                numeroAlum,
                numDocentes,
                numSedes,
                gastosPorEstudiante,
                presupuesto);
    }
}
