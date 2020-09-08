import org.junit.*;

public class e2AfterBeforeTest {

   private e2AfterBefore ob1;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass");
    }

   @Before
   public void setUp(){
       ob1 = new e2AfterBefore();
       System.out.println("@Before");
   }

    //3 casos de pruebas
    @Test
    public void probarNumBaseConstructor(){
        System.out.println("test1");
        Assert.assertEquals(252525,ob1.numCuadrados(ob1.getNumero()));
    }

    @Test
    public void probarNumUno(){
        System.out.println("test2");
        Assert.assertEquals(1,ob1.numCuadrados(ob1.setNumero(1)));
    }

    @Test
    public void probarNumCero(){
        System.out.println("test3");
        Assert.assertEquals(0,ob1.numCuadrados(ob1.setNumero(0)));
    }

    @After
    public void after(){
        System.out.println("@After");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass");
    }


}
