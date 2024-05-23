package co.edu.uniquindio.poo;

public class Jugos extends Bebidas {
    private boolean conLeche;
    private boolean conAgua;

    public Jugos(String nombre, String descripcion, double precio, boolean conLeche, boolean conAgua) {
        super(nombre, descripcion, precio);
        this.conLeche = conLeche;
        this.conAgua = conAgua;
    }

    public boolean esConLeche() {
        return conLeche;
    }

    public boolean esConAgua() {
        return conAgua;
    }

    public void setConLeche(boolean conLeche) {
        this.conLeche = conLeche;
        this.conAgua = !conLeche;
    }

    public void setConAgua(boolean conAgua) {
        this.conAgua = conAgua;
        this.conLeche = !conAgua;
    }

    @Override
    public String toString() {
        return super.toString() + (conLeche ? " (con leche)" : (conAgua ? " (con agua)" : ""));
    }
}
