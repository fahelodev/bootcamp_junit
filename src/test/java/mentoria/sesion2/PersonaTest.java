package mentoria.sesion2;

import mentoria.sesion2.Persona;
import org.junit.*;

import static org.junit.Assert.*;

public class PersonaTest {

    private Persona persona1;
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("Ejecucion de @BeforeClass");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("Ejecucion de @AfterClass");
    }

    @Before
    public void setUp(){
        persona1 = new Persona();
        System.out.println("Ejecucion de @Before");
    }

    @After
    public void Clean(){
        System.out.println("Ejecucion de @After");
        persona1 = null;
    }

    @Test
    public void CrearPersonaContructorVacio(){
        System.out.println("Ejecucion de Caso 1");
        assertEquals("Persona", persona1.getClass().getSimpleName());
    }

    @Test
    public void AsignarNombreEdad(){
        System.out.println("Ejecucion de Caso 3");
        persona1.setNombre("Edu");
        persona1.setEdad(38);
        assertEquals("Edu",persona1.getNombre());
    }

    @Test
    public void CrearPersonaContructorArgs(){
        System.out.println("Ejecucion de Caso 2");
        persona1 = new Persona("Edu",38);
        assertEquals(38,persona1.getEdad());
    }




}
