package co.edu.uniquindio.poo;

public class PlatosFuertes extends Producto {

    public PlatosFuertes(String nombre,String descripcion,double valor){
        super(nombre,descripcion,valor);
    }
    public String toString() {
        return nombre + " - " + descripcion + " ($" + valor + ")";
    }
}
