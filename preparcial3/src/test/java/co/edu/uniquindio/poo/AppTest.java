/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void DatosCompletos() {
        LOG.info("Iniciando Test DatosCompletos");
        Producto producto = new Producto("Bandeja Paisa", "Rica y Deliciosa", 200.000);

        assertEquals("Bandeja Paisa", producto.nombre);
        assertEquals("Rica y Deliciosa", producto.descripcion);
        assertEquals(200.000, producto.getValor());


        assertEquals(LOG, LOG);

        LOG.info("Finalizando test DatosCompletos");
    }

    @Test
    public void DatosNulos(){

        LOG.info("Iniciando Test DatosNulos");

        assertThrows(Throwable.class,()-> new Producto(null,null,200.000));

        LOG.info("Iniciando Test DatosNulos");

    }

    @Test
    public void DatosVacios(){

        LOG.info("Iniciando Test DatosVacios");


        assertThrows(Throwable.class,()-> new Producto(" "," ",200.000));


        LOG.info("Iniciando Test DatosVacios");

    }     

    @Test
    public void DatosNegativos(){
    
        LOG.info("Iniciando Test DatosNegativos");
    
    
        assertThrows(Throwable.class,()-> new Producto("Bandeja Paisa","Rica y Deliciosa",-200.000));
    
    
        LOG.info("Iniciando Test DatosNegativos"); 
    }
}
