package david_guillen_lab3;
public class Defensa extends Jugador{
    private double nivel_agre;
    private double altura;
    private double peso;
    private double velocidad;

    public Defensa() {
        super();
    }

    public Defensa(double nivel_agre, double altura, double peso, double velocidad, String nombre, String apellido, int edad, String estado, String pais_naci, String pie_pre, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo);
        this.nivel_agre = nivel_agre;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public double getNivel_agre() {
        return nivel_agre;
    }

    public void setNivel_agre(double nivel_agre) {
        this.nivel_agre = nivel_agre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Defensa{" + "nivel_agre=" + nivel_agre + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
}
