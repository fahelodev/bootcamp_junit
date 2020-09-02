import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class e1_imprimirCuadradosInt {

    /*
    * Imprimir el cuadrado de los digitos de un numero
    * Ej: 259
    * RES: 42581
    *
    * */

    public static int imprimirCuadradosInt (int numero){

        //Separar el numero en un Array de Numeros
        String concatenar= "";
        String convertirInt = Integer.toString(numero);
        for (int i = 0; i < convertirInt.length() ; i++) {
                char cabezal =  convertirInt.charAt(i);
                int conversor = Character.getNumericValue(cabezal);
                conversor = conversor * conversor;
                concatenar = concatenar+Integer.toString(conversor);
        }
        System.out.println(concatenar);
        numero = Integer.parseInt(concatenar);
        return numero;
    }

    public static void main (String [] args){

        imprimirCuadradosInt(259);
        imprimirCuadradosInt(111);
        imprimirCuadradosInt(555);
    }
}
