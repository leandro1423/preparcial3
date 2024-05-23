package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {

        // Creación de instancias de Bebidas y Postres

        Entradas[] entradas= {
            new Entradas("Hamburguesa ", "De la casa ", 2.00),
            new Entradas("PapiPollo", "Con lo que pida ", 22.50),
            new Entradas("Super Churro", "100% Carne ", 13.00),
        };
        Bebidas[] bebidas = {
            new Bebidas("Coca-Cola", "Bebida gaseosa", 1.50),
            new Bebidas("Jugo de naranja", "Jugo fresco de naranja", 2.50),
            new Bebidas("Batido de fresa", "Batido cremoso de fresa", 3.00),
            new Bebidas("Agua", "Agua mineral", 1.00)
        };

        Postres[] postres = {
            new Postres("Helado", "Helado de vainilla", 2.00),
            new Postres("Pastel", "Pastel de chocolate", 3.50),
            new Postres("Fruta", "Ensalada de frutas", 2.50),
            new Postres("Galletas", "Galletas de chocolate", 1.50)
        };
        PlatosFuertes[] platosfuertes = {
            new PlatosFuertes("Salmon ", "Pezcado fino", 2.00),
            new PlatosFuertes("Caviar", "Exclusivo", 22.50),
            new PlatosFuertes("Sopa De mariscos", "De la casa ", 13.00),
        };

        

        // Menú principal para seleccionar el tipo de menú
        String[] opcionesMenu = { "Entradas", "Platos Fuertes","Bebidas","Postres","Salir" };
        boolean continuar = true;

        while (continuar) {
            String seleccionMenu = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción",
                    "Menú Principal",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionesMenu,
                    opcionesMenu[0]
            );

            if (seleccionMenu == null || seleccionMenu.equals("Salir")) {
                continuar = false;
            } else if (seleccionMenu.equals("Bebidas")) {
                seleccionarBebida(bebidas);
            } else if (seleccionMenu.equals("Postres")) {
                seleccionarPostre(postres);
            } else if (seleccionMenu.equals("PlatosFuertes")) {
                seleccionarPlatoFuerte(platosfuertes);
            } else if (seleccionMenu.equals("Entradas")){
                seleccionarEntrada(entradas);
            }          
        }

        JOptionPane.showMessageDialog(null, "Gracias por usar el menú.");
    }
    private static void seleccionarEntrada(Entradas[] entradas) {
        Entradas seleccionEntrada = (Entradas) JOptionPane.showInputDialog(
                null,
                "Seleccione una entrada",
                "Menú de Entradas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                entradas,
                entradas[0]
        );
    
        if (seleccionEntrada != null) {
            JOptionPane.showMessageDialog(null, "Has seleccionado: " + seleccionEntrada);
        }
    }

    // Método para seleccionar una bebida
    private static void seleccionarBebida(Bebidas[] bebidas) {
        Bebidas seleccionBebida = (Bebidas) JOptionPane.showInputDialog(
                null,
                "Seleccione una bebida",
                "Menú de Bebidas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                bebidas,
                bebidas[0]
        );

        if (seleccionBebida != null) {
            JOptionPane.showMessageDialog(null, "Has seleccionado: " + seleccionBebida);
        }
    }

    // Método para seleccionar un postre
    private static void seleccionarPostre(Postres[] postres) {
        Postres seleccionPostre = (Postres) JOptionPane.showInputDialog(
                null,
                "Seleccione un postre",
                "Menú de Postres",
                JOptionPane.QUESTION_MESSAGE,
                null,
                postres,
                postres[0]
        );

        if (seleccionPostre != null) {
            JOptionPane.showMessageDialog(null, "Has seleccionado: " + seleccionPostre);
        }
    }

    private static void seleccionarPlatoFuerte(PlatosFuertes[] platosfuertes) {
        PlatosFuertes seleccionPlatosFuertes = (PlatosFuertes) JOptionPane.showInputDialog(
                null,
                "Seleccione un Plato Fuerte",
                "Menú de Platos fuertes",
                JOptionPane.QUESTION_MESSAGE,
                null,
                platosfuertes,
                platosfuertes[0]
        );

        if (seleccionPlatosFuertes != null) {
            JOptionPane.showMessageDialog(null, "Has seleccionado: " + seleccionPlatosFuertes);
        }
    }
}
