
package paqueteuno;

/**
 *
 * @author Italo
 */
import java.util.Scanner;

class Ciudad {
    private String nombre;
    private String provincia;

    public Ciudad(String nomb, String pro) {
        nombre = nomb;
        provincia = pro;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }
}

class Medico {
    private String nombre;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String nom, String espe, double sueldoM) {
        nombre = nom;
        especialidad = espe;
        sueldoMensual = sueldoM;
    }


    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
}

class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldoMensual;

    public Enfermero(String nom, String tip, double sueldoM) {
        nombre = nom;
        tipo = tip;
        sueldoMensual = sueldoM;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
}

class EntidadHospitalaria {
    private String nombreHospital;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;

    public EntidadHospitalaria(String nombreH, Ciudad ciuda, int nEspecialidades,
                               Medico[] med, Enfermero[] enferm) {
        nombreHospital = nombreH;
        ciudad = ciuda;
        numeroEspecialidades = nEspecialidades;
        medicos = med;
        enfermeros = enferm;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double calcularSueldoTotal() {
        double sueldoTotal = 0;

        for (Medico medico : medicos) {
            sueldoTotal += medico.obtenerSueldoMensual();
        }

        for (Enfermero enfermero : enfermeros) {
            sueldoTotal += enfermero.obtenerSueldoMensual();
        }

        return sueldoTotal;
    }

public void imprimirInformacion() {
    System.out.printf("HOSPITAL %s\n", nombreHospital);
    System.out.printf("Dirección: %s\n", ciudad.obtenerNombre());
    System.out.printf("Ciudad: %s\n", ciudad.obtenerNombre());
    System.out.printf("Provincia: %s\n", ciudad.obtenerProvincia());
    System.out.printf("Número de especialidades: %d\n", numeroEspecialidades);

    System.out.println("\nListado de médicos");
    for (Medico medico : medicos) {
        System.out.printf("- %s - sueldo: %.2f - %s\n", medico.obtenerNombre(),
                medico.obtenerSueldoMensual(), medico.obtenerEspecialidad());
    }

    System.out.println("\nListado de enfermeros(as)");
    for (Enfermero enfermero : enfermeros) {
        System.out.printf("- %s - sueldo: %.2f - %s\n", enfermero.obtenerNombre(),
                enfermero.obtenerSueldoMensual(), enfermero.obtenerTipo());
    }

    System.out.printf("\nTotal de sueldos a pagar por mes: %.2f\n", calcularSueldoTotal());
}
}