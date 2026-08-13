package model;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDuenio;

    public Animal(String nombre, int edad, String nombreDuenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDuenio = nombreDuenio;
    }

    // Método abstracto: obliga a cada especie a definir su cálculo de costo
    public abstract double calcularCostoConsulta();
    {

    }

    // Método concreto heredado igual por todas las subclases
    public void imprimirFicha() {{
    }
        System.out.println("-------------------");
        System.out.println("Mascota: " + nombre + " | Edad: " + edad + " años | Dueño: " + nombreDuenio);
        System.out.println("Costo de Consulta: $" + calcularCostoConsulta());
        System.out.println("-------------------");
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getNombreDuenio() { return nombreDuenio; }
}