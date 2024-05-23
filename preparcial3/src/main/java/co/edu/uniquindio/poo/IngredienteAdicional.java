package co.edu.uniquindio.poo;

public class IngredienteAdicional{

    public String nombre;
    public double valor;

    public IngredienteAdicional(String nombre,double valor) {
        this.nombre = nombre;
        this.valor = valor;    

    }    // Otros métodos y atributos de la clase Jugos pueden ir aquí

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
}
