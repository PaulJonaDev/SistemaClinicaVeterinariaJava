package model;

import interfaces.Asegurable;
import interfaces.Vacunable;

public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private int contadorVacunas = 0;

    public Gato(String nombre, int edad, String nombreDuenio, boolean esEsterilizado) {
        super(nombre, edad, nombreDuenio);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000; // $38.000 fijo
    }

    @Override
    public void registrarVacuna(String nombre) {
        contadorVacunas++;
        System.out.println("Vacuna '" + nombre + "' registrada para el gato " + getNombre());
    }

    @Override
    public int getVacunasAplicadas() {
        return contadorVacunas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return esEsterilizado ? 120000.0 : 200000.0; // $120.000 si está esterilizado, $200.000 si no
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre.toUpperCase();
    }

    public boolean isEsEsterilizado() { return esEsterilizado; }
}