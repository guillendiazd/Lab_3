package david_guillen_lab3;
public class Medio extends Jugador{
    private double nivel_crea;
    private double nivel_dom;
    private double prom_asis_part;

    public Medio() {
        super();
    }

    public Medio(double nivel_crea, double nivel_dom, double prom_asis_part, String nombre, String apellido, int edad, String estado, String pais_naci, String pie_pre, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo);
        this.nivel_crea = nivel_crea;
        this.nivel_dom = nivel_dom;
        this.prom_asis_part = prom_asis_part;
    }

    public double getNivel_crea() {
        return nivel_crea;
    }

    public void setNivel_crea(double nivel_crea) {
        this.nivel_crea = nivel_crea;
    }

    public double getNivel_dom() {
        return nivel_dom;
    }

    public void setNivel_dom(double nivel_dom) {
        this.nivel_dom = nivel_dom;
    }

    public double getProm_asis_part() {
        return prom_asis_part;
    }

    public void setProm_asis_part(double prom_asis_part) {
        this.prom_asis_part = prom_asis_part;
    }

    @Override
    public String toString() {
        return super.toString() + "Medio\n" + "nivel_crea:" + nivel_crea + "\n" + "nivel_dom:" + nivel_dom + "\n" + "prom_asis_part:" + prom_asis_part + "\n" + "----------\n";
    }
    
}
