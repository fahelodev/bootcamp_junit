package mentoria.sesion4;

import mentoria.sesion2.EmpleadoTest;
import mentoria.sesion2.PersonaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        EmpleadoTest.class,
        PersonaTest.class
})
public class SuiteEjecucion {}
