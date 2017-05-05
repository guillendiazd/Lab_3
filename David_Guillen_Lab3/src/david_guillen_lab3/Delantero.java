package david_guillen_lab3;
public class Delantero extends Jugador{
    private double definicion;
    private double altura;
    private double velocidad;
    private double prom_gol_part;

    public Delantero() {
        super();
    }

    public Delantero(double definicion, double altura, double velocidad, double prom_gol_part, String nombre, String apellido, int edad, String estado, String pais_naci, String pie_pre, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo);
        this.definicion = definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.prom_gol_part = prom_gol_part;
    }

    public double getDefinicion() {
        return definicion;
    }

    public void setDefinicion(double definicion) {
        this.definicion = definicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getProm_gol_part() {
        return prom_gol_part;
    }

    public void setProm_gol_part(double prom_gol_part) {
        this.prom_gol_part = prom_gol_part;
    }

    @Override
    public String toString() {
        return super.toString() + "Delantero{" + "definicion=" + definicion + ", altura=" + altura + ", velocidad=" + velocidad + ", prom_gol_part=" + prom_gol_part + '}';
    }
    
}
