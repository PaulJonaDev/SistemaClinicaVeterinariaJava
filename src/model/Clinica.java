
package model;

import interfaces.Asegurable;

public class Clinica implements Asegurable {
    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5000000.0; // $5.000.000 fijos al año
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre.toUpperCase().replaceAll("\\s+", "");
    }
}