package ejercicios;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class eduardoArayaTest {

    private eduardoAraya objeto;

    @Before
    public void setUp(){
        objeto = new eduardoAraya();
    }

    /**
     * Contar vocales en una palabra
     */
    @Test
    public void contarVocalesPalabra(){
        try {
            Assert.assertEquals(3, objeto.contarVocales("solera"));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Contar vocales en un string sin vocales
     */
    @Test
    public void contarSinVocales(){
        try {
            Assert.assertEquals(0, objeto.contarVocales("rt"));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Contar vocales con tilde
     */
    @Test
    public void contarVocalesTildadas(){
        try {
            Assert.assertNotEquals(2, objeto.contarVocales("ñandú"));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Contar vocales en caracteres numéricos
     */
    @Test
    public void contarVocalesNumeros(){
        try {
            Assert.assertEquals(0, objeto.contarVocales("515110"));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Obtener caracteres medios en una palabra par
     */
    @Test
    public void obtenerMedioPar(){
        try {
            Assert.assertEquals("rd", objeto.obtenerMedio("jardin"));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Obtener caracteres medios en ua palabra impar
     */
    @Test
    public void obtenerMedioImpar(){
        try {
            Assert.assertEquals("o", objeto.obtenerMedio("sol"));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Se espera no obtener los caracteres medios erróneos, de una palabra impar
     */
    @Test
    public void obtenerMedioImparNegativo(){
        try{
            Assert.assertNotEquals("un", objeto.obtenerMedio("JUnit"));
        }catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * Al no ingresar texto, no debería retornar vacío
     */
    @Test
    public void obtenerMedioVacío(){
        try {
            Assert.assertNotEquals("", objeto.obtenerMedio(""));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Al ingresar texto, no debe retornar nulo
     */
    @Test
    public void obtenerMedioNoNulo(){
        try {
            Assert.assertNotNull(objeto.obtenerMedio("hola"));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void obtenerMedioNulo(){
        try {
            Assert.assertNull(objeto.obtenerMedio(""));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
