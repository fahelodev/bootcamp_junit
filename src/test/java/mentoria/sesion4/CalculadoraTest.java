package mentoria.sesion4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculadoraTest {
    //atributos
    private int num1,num2,resultado;

    //Constructor
    public CalculadoraTest(int num1, int num2, int resultado){
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    //metodo para iterar
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[] {5,5,25});
        return obj;
    }

    @Test
    public void signosAlMultiplicar(){
        /*  Pruebas a realizar para metodo Multiplicacion
            +*+ = +
            +*- = -
            -*+ = -
            -*- = +
         */
        Calculadora calculadoraTest = new Calculadora();
        int operacion = calculadoraTest.Multiplicacion(num1,num2);
        assertEquals(operacion,resultado);
    }


}
