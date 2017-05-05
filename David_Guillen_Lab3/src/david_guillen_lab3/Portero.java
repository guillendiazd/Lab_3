package david_guillen_lab3;
public class Portero extends Jugador{
    private double nivel_juego_aero;
    private double nivel_juego_pies;

    public Portero() {
        super();
    }

    public Portero(double nivel_juego_aero, double nivel_juego_pies, String nombre, String apellido, int edad, String estado, String pais_naci, String pie_pre, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo);
        this.nivel_juego_aero = nivel_juego_aero;
        this.nivel_juego_pies = nivel_juego_pies;
    }

    public double getNivel_juego_aero() {
        return nivel_juego_aero;
    }

    public void setNivel_juego_aero(double nivel_juego_aero) {
        this.nivel_juego_aero = nivel_juego_aero;
    }

    public double getNivel_juego_pies() {
        return nivel_juego_pies;
    }

    public void setNivel_juego_pies(double nivel_juego_pies) {
        this.nivel_juego_pies = nivel_juego_pies;
    }

    @Override
    public String toString() {
        return super.toString() + "Portero{" + "nivel_juego_aero=" + nivel_juego_aero + ", nivel_juego_pies=" + nivel_juego_pies + '}';
    }
    
}
