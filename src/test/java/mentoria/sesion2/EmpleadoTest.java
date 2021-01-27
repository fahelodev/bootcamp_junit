package mentoria.sesion2;

import mentoria.sesion2.Empleado;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmpleadoTest {

    @Test
    public void contratarPersonaComoEmpleado(){
        Empleado empleado1 = new Empleado("Jose",23,100.0, "Automatizador");
        empleado1.setEstadoContrato(true);
        assertEquals("Contrato vigente",empleado1.getEstadoContrato());
    }

    @Test
    public void DesvincularContratoEmpleado(){
        Empleado empleado1 = new Empleado("Carlos",30,100.0,"Administrativo");
        empleado1.setEstadoContrato(false);
        assertEquals("Contrato Caduco",empleado1.getEstadoContrato());
    }
}
