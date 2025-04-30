/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class EjecutorCandidato {

    public static void main(String[] args) {

        CandidatoPresidencial candidato1 = new CandidatoPresidencial(
                "Jafier Vinan", 22, "RC5",
                "Educacion gratuita, reforma migratoria,"
                + " crecimiento economico", 10);

        CandidatoPresidencial candidato2 = new CandidatoPresidencial(
                "Antonio Ojeda", 58, "Orense",
                "Educacion privada, reforma judicial,"
                + " crecimiento agroeconomico", 5);

        System.out.println("\nCandidato 1");
        System.out.println(candidato1);
        System.out.println("Cumple requisitos de edad: "
                + (candidato1.validarEdad()));

        System.out.println("\nCandidato 2");
        System.out.println(candidato2);
        System.out.println("Cumple requisitos de edad: "
                + (candidato2.validarEdad()));

    }
}

class CandidatoPresidencial {

    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numeroPropuestasClave;

    public CandidatoPresidencial() {
    }

    public CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
    }

    public CandidatoPresidencial(String nombre, int edad, String partidoPolitico,
            String planGobierno, int numeroPropuestasClave) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numeroPropuestasClave = numeroPropuestasClave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public int getNumeroPropuestasClave() {
        return numeroPropuestasClave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public void setNumeroPropuestasClave(int numeroPropuestasClave) {
        this.numeroPropuestasClave = numeroPropuestasClave;
    }

    public String validarEdad() {
        if (edad >= 18) {
            return "Si";
        } else {
            return "No";
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\n"
                + "Partido politico: %s\n"
                + "Plan de gobierno: %s\n"
                + "Numero de propuestas clave: %d",
                nombre, edad, partidoPolitico,
                planGobierno, numeroPropuestasClave);
    }
}
