package co.edu.uniquindio.poo;

public class Postres extends Producto {

    public Postres(String nombre,String descripcion,double valor){
        super(nombre,descripcion,valor);
    }

    public String toString() {
        return nombre + " - " + descripcion + " ($" + valor + ")";
    }
}

