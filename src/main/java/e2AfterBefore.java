public class e2AfterBefore {

   private int numero;

   //Constructor
    public e2AfterBefore(){
        numero = 555;
    }

    public int numCuadrados (int numero){

        //Separar el numero en un Array de Numeros
        String concatenar= "";
        String convertirInt = Integer.toString(numero);
        for (int i = 0; i < convertirInt.length() ; i++) {
                char cabezal =  convertirInt.charAt(i);
                int conversor = Character.getNumericValue(cabezal);
                conversor = conversor * conversor;
                concatenar = concatenar+Integer.toString(conversor);
        }
        numero = Integer.parseInt(concatenar);
        //System.out.println("valor de los digitos al cuadrado : " +concatenar);
        return numero;
    }

    public int setNumero(int num){
        numero = num;
        return numero;
    }

    public int getNumero(){
        return this.numero;
    }

}
