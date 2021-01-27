package ejercicios;

public class eduardoAraya implements EjerciciosJunitBootCamp{

    public String enteroAString(int valor){
        return "";
    }

    public String verdaderoFalso(boolean valor){
        return "";
    }

    /**
     * Función que cuenta las vocales del texto ingresado
     * @param texto String que ingresa a la función
     * @return número de vocales que contiene el texto
     */
    public int contarVocales(String texto){
        int cantidad = 0;
        String vocales = "";
        //el texto que ingresa lo cambio a minúsculas.
        texto.toLowerCase();

        //se usa bucle for
        /*for (int i = 0; i < texto.length(); i++){
            char posicionTexto = texto.charAt(i);
            switch (posicionTexto) {
                case 'a':
                    cantidad++;
                    vocales = vocales+"a";
                    break;
                case 'e':
                    cantidad++;
                    vocales = vocales+"e";
                    break;
                case 'i':
                    cantidad++;
                    vocales = vocales+"i";
                    break;
                case 'o':
                    cantidad++;
                    vocales = vocales+"o";
                    break;
                case 'u':
                    cantidad++;
                    vocales = vocales+"u";
                    break;
            }
        }*/

        //uso del foreach
        for (char c :texto.toCharArray()) {
            switch (c) {
                case 'a':
                    cantidad++;
                    vocales = vocales+"a";
                    break;
                case 'e':
                    cantidad++;
                    vocales = vocales+"e";
                    break;
                case 'i':
                    cantidad++;
                    vocales = vocales+"i";
                    break;
                case 'o':
                    cantidad++;
                    vocales = vocales+"o";
                    break;
                case 'u':
                    cantidad++;
                    vocales = vocales+"u";
                    break;
            }
        }

        System.out.println(texto + " tiene " + cantidad + " vocales: " + vocales);
        return cantidad;
    }

    /**
     * Función que permite obtener los caracteres medios de una cadena de texto
     * @param texto cadena de texto ingresado
     * @return String que contiene el o los caracteres medios
     */
    public String obtenerMedio(String texto){
        String medio = "";

        if (texto.length() > 0){
            //si la palabra es impar, ej.: sol, su largo es 3, la mitad es 1.5, pero al ser int es 1
            //por lo tanto se obtiene la segunda posicion: 1, que corresponde a "o".
            String caracterMedioImpar = String.valueOf(texto.charAt(texto.length()/2));

            //si dividimos el largo del texto por 2, y esto no genera resto (mod), el texto es par
            if (texto.length()%2 == 0){
                medio = String.valueOf(texto.charAt((texto.length()/2)-1)) +
                        caracterMedioImpar;

                //aquí entran los textos impares, cuyo resto es mayor a 0
            } else {
                medio = caracterMedioImpar;
            }

            System.out.println("Palabra: " + texto + ", caracteres medios: " + medio);

        } else {
            medio = null;
            System.out.println("Debe ingresar un texto");
        }

        return medio;
    }



}
