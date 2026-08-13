package model;

public class Ave extends Animal {
    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreDuenio, double pesoGramos) {
        super(nombre, edad, nombreDuenio);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        return 28000 + (100 * pesoGramos); // $28.000 base + $100 por gramo
    }

    public double getPesoGramos() { return pesoGramos; }
}
