package ejercicios.bootcamp.eduara.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TecladoTest {

    @Test
    public void creacionTecladoClasePadre(){
        DispositivoEntrada tecladoTest = new Teclado("USB","HP");
        System.out.println(tecladoTest.toString());
        assertEquals("Teclado", tecladoTest.getClass().getSimpleName());

    }

    @Test
    public void creacionTecladoClaseHija(){
        Teclado tecladoTest = new Teclado("Wireless","Kensington");
        System.out.println(tecladoTest.toString());
        assertEquals("Teclado", tecladoTest.getClass().getSimpleName());
    }

    @Test
    public void validacionDeIds(){
        Teclado tecladoTest = new Teclado("Wireless","Kensington");
        System.out.println(tecladoTest.toString());
        assertEquals(1,tecladoTest.getContadorTeclado());
    }

    @Test
    public void validacionDeIdsCorrelativos(){
        Teclado tecladoTest = new Teclado("Wireless","Kensington");
        Teclado tecladoTest2 = new Teclado("Wireless","Kensington");
        Teclado tecladoTest3 = new Teclado("Wireless","Kensington");
        Teclado tecladoTest4 = new Teclado("Wireless","Kensington");
        Teclado tecladoTest5 = new Teclado("USB","PlayPlay");
        System.out.println(tecladoTest5.toString());
        assertEquals(5,tecladoTest5.getContadorTeclado());
    }

    @Test(timeout = 500)
    public void creacionTecladoClaseHijaEn1Segundo(){

    }

    @Test
    public void nombreTest6(){

    }

}
