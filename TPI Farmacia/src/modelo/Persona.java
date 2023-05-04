package modelo;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private boolean esEmpleado;
    private int nro_afiliado;
    private ObraSocial obra_social;
    private Domicilio domicilio;

    public Persona(int dni, String nombre, String apellido, boolean esEmpleado, int nro_afiliado,
            ObraSocial obra_social, Domicilio domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esEmpleado = esEmpleado;
        this.nro_afiliado = nro_afiliado;
        this.obra_social = obra_social;
        this.domicilio = domicilio;
    }

    public Persona(int dni, String nombre, String apellido, boolean esEmpleado, Domicilio domicilio){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esEmpleado = esEmpleado;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public boolean isEsEmpleado() {
        return esEmpleado;
    }
    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }
    public int getNro_afiliado() {
        return nro_afiliado;
    }
    public void setNro_afiliado(int nro_afiliado) {
        this.nro_afiliado = nro_afiliado;
    }
    public ObraSocial getObra_social() {
        return obra_social;
    }
    public void setObra_social(ObraSocial obra_social) {
        this.obra_social = obra_social;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    

}
