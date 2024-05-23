package co.edu.uniquindio.poo;

public class Entradas extends Producto {

    public Entradas(String nombre,String descripcion,double valor){
        super(nombre,descripcion,valor);
    }
    public String toString() {
        return nombre + " - " + descripcion + " ($" + valor + ")";
    }
}
