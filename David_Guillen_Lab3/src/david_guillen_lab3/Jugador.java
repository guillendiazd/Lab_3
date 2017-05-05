package david_guillen_lab3;
public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String estado;
    private String pais_naci;
    private String pie_pre;
    private int numero;
    private double precio;
    private String equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, String estado, String pais_naci, String pie_pre, int numero, double precio, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.pais_naci = pais_naci;
        this.pie_pre = pie_pre;
        this.numero = numero;
        this.precio = precio;
        this.equipo = equipo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais_naci() {
        return pais_naci;
    }

    public void setPais_naci(String pais_naci) {
        this.pais_naci = pais_naci;
    }

    public String getPie_pre() {
        return pie_pre;
    }

    public void setPie_pre(String pie_pre) {
        this.pie_pre = pie_pre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "-------------\n" + "nombre:" + nombre + "\n" + "apellido:" + apellido + "\n" + "edad:" + edad + "\n" + "estado:" + estado + "\n" + "pais_naci:" + pais_naci + "\n" + "pie_pre" + pie_pre + "\n" + "numero:" + numero + "\n" + "precio:" + precio + "\n" + "equipo:" + equipo + "\n";
    }
    
}
