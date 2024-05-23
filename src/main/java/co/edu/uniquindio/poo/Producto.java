package co.edu.uniquindio.poo;


public class Producto {

    public String nombre;

    public String descripcion;

    public double valor;

    public Producto(String nombre, String descripcion, double valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;

        assert nombre != null && !nombre.isBlank();
        assert descripcion != null && !descripcion.isBlank();
        assert valor > 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }    
    
}
