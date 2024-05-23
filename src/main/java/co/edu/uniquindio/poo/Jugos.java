package co.edu.uniquindio.poo;

public class Jugos extends Bebidas {

    // Atributo adicional para definir el tipo de jugo (agua o leche)
    private String tipo;

    // Constructor que inicializa los atributos
    public Jugos(String nombre, String descripcion, double valor, String tipo) {
        super(nombre, descripcion, valor);
        this.tipo = tipo;
    }

    // Método booleano que determina si el jugo es con leche
    public boolean esConLeche() {
        return tipo == "leche";
    }

    // Método booleano que determina si el jugo es con agua
    public boolean esConAgua() {
        return tipo == "agua";
    }    // Otros métodos y atributos de la clase Jugos pueden ir aquí
}
