
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class EjecutorHora {

    public static EquivalenteHora equivalente1;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas que desea convertir: ");
        double horas = entrada.nextDouble();

        equivalente1 = new EquivalenteHora(horas);
        //no usamos getters y setter entonces mandamos directo creando el objeto

        equivalente1.calcularSegundos();

        equivalente1.calcularMinutos();

        equivalente1.calcularDias();

        System.out.println(equivalente1);

    }
}

class EquivalenteHora {

    public double horas;

    public double segundos;

    public double minutos;

    public double dias;

    public EquivalenteHora() {
    }

    public EquivalenteHora(double horas) {
        this.horas = horas;
    }

    public void calcularSegundos() {
        this.segundos = this.horas * 3600;
    }

    public void calcularMinutos() {
        this.minutos = this.horas * 60;
    }

    public void calcularDias() {

        this.dias = this.horas / 24;
    }

    public String toString() {
        return String.format("%s%.2f %s%.2f %s%.2f %s%.4f",
                "Horas ingresadas para calculo =",horas,
                "\n minutos = ", minutos,
                "\n segundos = ", segundos,
                "\n dias = ", dias);
    }

    //Esto igual a un pirntf en formateo
}