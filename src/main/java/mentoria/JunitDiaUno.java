package mentoria;

public class JunitDiaUno {

    /*
        ¡¡Requisito de Programacion!!
            funcion: cuadradoDeDigitos(int numero)
            -- funcion que obtiene el numero cuadrado de los digitos de un numero entero
                Ej: 259
                RES: 42581
     */

    public JunitDiaUno(){

    }

    public int cuadradoDeDigito(int numero){

        //1. transformar el numero a un String
        int resultadoInt;
        String resultadoString ="";
        String arrayDigitos = Integer.toString(numero);

        //2. Ciclo for para poder recorrer los caracteres del String y aplicar la funcionalidad
        for (int i = 0; i < arrayDigitos.length(); i++) {
            //obtengo el caracter-digito
            char cabezal = arrayDigitos.charAt(i);
            int obtenercuadradoDigito = Character.getNumericValue(cabezal);
            obtenercuadradoDigito = obtenercuadradoDigito*obtenercuadradoDigito;
            resultadoString = resultadoString+Integer.toString(obtenercuadradoDigito);
        }
        resultadoInt =Integer.parseInt(resultadoString);
        return resultadoInt;
    }

    public static void main(String[] fae){

        JunitDiaUno obj = new JunitDiaUno();

        System.out.println("Resultado: "+obj.cuadradoDeDigito(259));
        System.out.println("Resultado: "+obj.cuadradoDeDigito(111));
        System.out.println("Resultado: "+obj.cuadradoDeDigito(999));
    }


}
