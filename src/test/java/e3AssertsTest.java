import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class e3AssertsTest {

    @Test
    public void numeros(){

        // Numeros enteros
        assertEquals(4,4);
        assertNotEquals(4,3);
        // Numeros decimales
        assertEquals(2.56,2.59,0.1);

    }

    @Test
    public void cadenas (){
        String s1 = "bootCamp";
        String s2 = "Tsoft";
        String s3 = "Tsoft";
        assertEquals("Correcto",s2,s3);
        assertNotEquals("Correcto",s1,s2);
    }

    @Test
    public void arrays (){

        //declarar ArrayList
        ArrayList<String> al1 = new ArrayList();
        ArrayList<String> al2 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            String elem = ""+(i+1);
            al1.add(i,elem);
            al2.add(i,elem);
        }

        //Convert to string array
        String[] array1 = al1.toArray(new String[al1.size()]);
        String[] array2 = al1.toArray(new String[al1.size()]);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        assertEquals(al1,al2);
        assertArrayEquals(array1,array2);
    }

    @Test
    public void objetos (){

        Date fecha1 = new Date();
        Date fecha2 = new Date();
        assertEquals(fecha1,fecha2);
        //assertSame(fecha1,fecha2);

    }

    @Test(expected = ArithmeticException.class)
    public void esperado (){
        int num1 = 10;
        int num2= 0;
        int divcero = num1/num2;
    }

    @Test(timeout = 2000)
    public void timeout (){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        };

    }
}
