package mentoria.sesion2;

public class Persona {

    //atributos
     private String nombre;
     private int edad;

     //Constuctores
    public Persona(){

    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
