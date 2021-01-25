package mentoria;

public class JunitDiaUno {

    /*
        ¡¡Requisito de Programacion!!
            funcion: cuadradoDeDigitos(int numero)
            -- funcion que obtiene el numero cuadrado de los digitos de un numero entero
                Ej: 259
                RES: 42581
     */

    public int cuadradoDeDigitos(int numero){

        //1. Declarar variable
        String concatenar= "";
        String convertirNumero = Integer.toString(numero);

        //2. Ciclo para Separar el String y convertir los digitos y vamos concatenar
        for (int i = 0; i < convertirNumero.length(); i++) {
            char cabezal = convertirNumero.charAt(i);
            int digito = Character.getNumericValue(cabezal);
            digito = digito*digito;
            concatenar =concatenar+Integer.toString(digito);
        }

        System.out.println(concatenar);
        numero = Integer.parseInt(concatenar);
        return numero;

    }



}
