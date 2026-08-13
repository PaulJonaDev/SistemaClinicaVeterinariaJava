
import model.*;
import interfaces.Asegurable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gato gatoFuerte = new Gato("Pelusa", 5, "Marta", false);
        // Fichas con referencia polimórfica
        System.out.println("=== 1. FICHAS CON REFERENCIA POLIMÓRFICA ===");
        Animal[] animales = new Animal[] {
        new Perro("Rex", 4, "Carlos", "Labrador"),
        new Gato("Michi", 2, "Ana", true),
        };

        for (Animal animal : animales) {
            animal.imprimirFicha(); // Llama a calcularCostoConsulta()
        }

        // Bloque 2: Vacunar los que aplican
        System.out.println("\n=== 2. VACUNACIÓN ===");
        Perro perroFuerte = new Perro("Firulais", 3, "Pedro", "Pastor Alemán");

        perroFuerte.registrarVacuna("Rabia");
        perroFuerte.registrarVacuna("Parvovirus");
        String tripleFelina = gatoFuerte.toString();

        System.out.println(perroFuerte.getNombre() + " tiene " + perroFuerte.getVacunasAplicadas() + " vacunas.");
        for (String s : Arrays.asList(gatoFuerte.getClass() + " tiene " + gatoFuerte.getClass() + " vacunas.", "\n=== 3. CÁLCULO DE PÓLIZAS (ASEGURABLES) ===")) {
            System.out.println(s);
        }

        // Bloque 3: Calcular pólizas (Mezcla de Animales y Clínica)[
        Asegurable[] asegurables = new Asegurable[] {
        perroFuerte,
                gatoFuerte,
                new Clinica("VetCare Central", "Calle 123 # 45-67")
        };

        for (Asegurable asegurable : asegurables) {
            System.out.println("Póliza: " + asegurable.obtenerNumeroPoliza() +
                    " | Prima Anual: $" + asegurable.calcularPrimaSeguro());
        }
    }
}
