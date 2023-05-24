
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author Italo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del hospital: ");
        String nombreHospital = scanner.nextLine();

        System.out.print("Ingrese la ciudad del hospital: ");
        String nombreCiudad = scanner.nextLine();

        System.out.print("Ingrese la provincia de la ciudad: ");
        String provinciaCiudad = scanner.nextLine();

        System.out.print("Ingrese el número de especialidades: ");
        int numeroEspecialidades = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el número de médicos: ");
        int numeroMedicos = scanner.nextInt();
        scanner.nextLine();

        Medico[] medicos = new Medico[numeroMedicos];
        for (int i = 0; i < numeroMedicos; i++) {
            System.out.printf("Ingrese el nombre del médico %d: ", i + 1);
            String nombreMedico = scanner.nextLine();

            System.out.printf("Ingrese la especialidad del médico %d: ", i + 1);
            String especialidadMedico = scanner.nextLine();

            System.out.printf("Ingrese el sueldo mensual del médico %d: ", i + 1);
            double sueldoMedico = scanner.nextDouble();
            scanner.nextLine();

            medicos[i] = new Medico(nombreMedico, especialidadMedico, sueldoMedico);
        }

        System.out.print("Ingrese el número de enfermeros(as): ");
        int numeroEnfermeros = scanner.nextInt();
        scanner.nextLine();

        Enfermero[] enfermeros = new Enfermero[numeroEnfermeros];
        for (int i = 0; i < numeroEnfermeros; i++) {
            System.out.printf("Ingrese el nombre del enfermero(a) %d: ", i + 1);
            String nombreEnfermero = scanner.nextLine();

            System.out.printf("Ingrese el tipo del enfermero(a) %d (nombramiento/contrato): ", i + 1);
            String tipoEnfermero = scanner.nextLine();

            System.out.printf("Ingrese el sueldo mensual del enfermero(a) %d: ", i + 1);
            double sueldoEnfermero = scanner.nextDouble();
            scanner.nextLine();

            enfermeros[i] = new Enfermero(nombreEnfermero, tipoEnfermero, sueldoEnfermero);
        }

        Ciudad ciudad = new Ciudad(nombreCiudad, provinciaCiudad);
        EntidadHospitalaria entidadHospitalaria = new EntidadHospitalaria(nombreHospital,
                ciudad, numeroEspecialidades, medicos, enfermeros);

        entidadHospitalaria.imprimirInformacion();
    }
}
    
    

