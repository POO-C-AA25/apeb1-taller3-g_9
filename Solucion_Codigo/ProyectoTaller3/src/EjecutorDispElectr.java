
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class EjecutorDispElectr {

    public static EquipoCelular celulares;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el sistema operativo de su equipo: ");
        String sistemaOp = entrada.nextLine();

        System.out.print("Ingrese el tamaño de su pantalla: ");
        String tamano = entrada.nextLine();

        System.out.print("Ingrese el costo inicial del dispositivo: ");
        double costoI = entrada.nextDouble();

        System.out.print("Ingrese el IVA en porcentaje: ");
        double ivaPorcentaje = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("Ingrese la dirección MAC de su dispositivo: ");
        String dirMac = entrada.nextLine();

        System.out.print("Ingrese el IMEI de su dispositivo móvil: ");
        String imeI = entrada.nextLine();

        celulares = new EquipoCelular(sistemaOp, tamano, costoI,
                ivaPorcentaje, dirMac, imeI);

        celulares.calcularIvaCostoInicial();
        celulares.calcularCostoFinal();

        System.out.println("\n=== Información del Equipo Celular ===");
        System.out.println(celulares);

    }
}

class EquipoCelular {

    public String sistemaOp;
    public String tamano;
    public double costoI;
    public double ivaPorcentaje;
    public double ivaCostoInicial;
    public double costoFinal;
    public String dirMac;
    public String imeI;

    public EquipoCelular() {
    }

    public EquipoCelular(String sistemaOp, String tamano, double costoI, double ivaPorcentaje, String dirMac, String imeI) {
        this.sistemaOp = sistemaOp;
        this.tamano = tamano;
        this.costoI = costoI;
        this.ivaPorcentaje = ivaPorcentaje;
        this.dirMac = dirMac;
        this.imeI = imeI;
    }

    public void calcularIvaCostoInicial() {
        this.ivaCostoInicial = (this.costoI * this.ivaPorcentaje) / 100;
    }

    public void calcularCostoFinal() {
        this.costoFinal = this.costoI + this.ivaCostoInicial;
    }

    @Override
    public String toString() {
        return String.format("Sistema Operativo: %s\n"
                + "Tamaño de Pantalla: %s\n"
                + "Costo Inicial: %.2f\n"
                + "IVA Porcentaje: %.2f%%\n"
                + "IVA sobre Costo Inicial: %.2f\n"
                + "Costo Final: %.2f\n"
                + "Dirección MAC: %s\n"
                + "IMEI: %s",
                sistemaOp,
                tamano,
                costoI,
                ivaPorcentaje,
                ivaCostoInicial,
                costoFinal,
                dirMac,
                imeI);
    }
}
