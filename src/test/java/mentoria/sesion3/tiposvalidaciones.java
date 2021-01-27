package mentoria.sesion3;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class tiposvalidaciones {

    //numeros
    @Test
    public void validacionNumerosEnteros() throws Exception{
        try {
            int numeroAValidar =10;
            assertEquals(10,numeroAValidar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //cadenas
    @Test
    public void validacionCadenas() throws Exception{
        try {
            String cadena1 = "Hola compañeros del BC";
            String cadena2 = "Hola compañeros del BC";
            assertEquals("validacion de cadenas",cadena1,cadena2);
            System.out.println("Se valida que cadenas de texto son iguales: "+cadena1);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Arrays
    @Test
    public void validacionesArraysString() throws Exception{
        try {
            ArrayList<String> arrayUno = new ArrayList<>();
            ArrayList<String> arrayDos = new ArrayList<>();

            //llenar arrays
            for (int i = 0; i < 10; i++) {
                arrayUno.add(i,""+(i+1));
                arrayDos.add(i,""+(i+1));
            }

            //Arrays de Strings
            String[] array1 = arrayUno.toArray(new String[10]);
            String[] array2 = arrayDos.toArray(new String[10]);

            assertArrayEquals(array1,array2);

            //validacion ArrayList
            //assertEquals(arrayUno,arrayDos);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Objetos
    @Test
    public void validacionesEnObjetos() throws Exception{
        Date fechaUno = new Date();
        Thread.sleep(500);
        Date fechaDos = new Date();

        try {
            assertSame(fechaUno,fechaDos);
            //assertEquals(fechaUno,fechaDos);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //Parametros @Test
    @Test(expected = ArithmeticException.class)
    public void testExcepcionEsperada(){
        int numero = 20;
        int numero2 =0;
        int divCero = numero/numero2;
    }

    @Test(timeout = 1032)
    public void testConTiempoLimite() throws Exception{
        try {
            Thread.sleep(999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}