
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class EjecutorEntidadFinanciera {

    public static Cheque cheque;

    public static void main(String[] args) {
        System.out.println("Información:");

        cheque = new Cheque();
        cheque.valorCheque = (Math.random() * 1000) + 1;
        cheque.nombreC = "Diego Espinosa";
        cheque.nombreB = "Banco Nacional";

        cheque.calcularComision();

        System.out.println(cheque);
    }
}

class Cheque {

    public double valorCheque;
    public double comisionC;
    public String nombreC;
    public String nombreB;

    public Cheque() {

    }

    public void calcularComision() {
        this.comisionC = valorCheque * 0.003;
    }

    @Override
    public String toString() {
        return String.format("Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f",
                nombreC, nombreB, valorCheque, comisionC);
    }
}
