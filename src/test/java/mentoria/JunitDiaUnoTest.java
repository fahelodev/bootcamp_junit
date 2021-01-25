package mentoria;

import static org.junit.Assert.*;
import org.junit.Test;

public class JunitDiaUnoTest {

    @Test
    public void cuacradoDeDigitoExitoso(){

        JunitDiaUno obj = new JunitDiaUno();
        int numeroavalidar = obj.cuadradoDeDigitos(255);
        assertEquals(42525,numeroavalidar);

    }


}
