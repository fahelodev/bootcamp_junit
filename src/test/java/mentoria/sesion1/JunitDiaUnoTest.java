package mentoria.sesion1;

import static org.junit.Assert.*;

import mentoria.sesion1.JunitDiaUno;
import org.junit.Test;

public class JunitDiaUnoTest {

    @Test
    public void cuacradoDeDigitoExitoso(){

        JunitDiaUno obj = new JunitDiaUno();
        int numeroavalidar = obj.cuadradoDeDigitos(255);
        assertEquals(42525,numeroavalidar);

    }


}
