package mentoria.sesion2;

public class Empleado extends Persona{

    /*atributos*/
    protected double sueldo;
    protected String cargo;
    private boolean estadoContrato;

    /* Constructor */
    public Empleado(){}

    public Empleado(String nombre, int edad, double sueldo, String cargo){
        super("Edu",38);
        this.sueldo = sueldo;
        this.cargo = cargo;

    }

    /*Metodos*/
    public double getSueldo(){
        return this.sueldo;
    }

    public double setSueldo(double sueldo){
        this.sueldo = sueldo;
        return sueldo;
    }

    public String getEstadoContrato(){
        if(estadoContrato){
            return "Contrato vigente";
        }else{
            return "Contrato Caduco";
        }
    }

    public void setEstadoContrato(boolean estadoContrato){
        this.estadoContrato = estadoContrato;
    }




}
