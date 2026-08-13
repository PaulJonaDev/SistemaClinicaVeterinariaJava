package model;

import interfaces.Asegurable;
import interfaces.Vacunable;

 public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private int contadorVacunas = 0;

    public Perro(String nombre, int edad, String nombreDuenio, String raza) {
        super(nombre,
                edad,
                nombreDuenio);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + (3000 * edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
        contadorVacunas++;
    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000.0 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombre.toUpperCase();
    }

    public String getRaza() {
        return raza;
    }
}