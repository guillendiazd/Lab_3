package david_guillen_lab3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class David_Guillen_Lab3 {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        String opcion = "";
        while(!opcion.equalsIgnoreCase("d")){
            opcion = JOptionPane.showInputDialog("Ingrese Opcion\n"
                    + "a). Crear Jugador\n"
                    + "b). Modificar Jugador\n"
                    + "c). Eliminar Jugador\n");
            if (opcion.equalsIgnoreCase("a")) {
                String op_jugador = "";
                while(!op_jugador.equalsIgnoreCase("e")){
                    op_jugador = JOptionPane.showInputDialog("a). Delantero\n"
                            + "b). Medio\n"
                            + "c). Defensa\n"
                            + "d). Portero\n"
                            + "e). Salir\n");
                    if (op_jugador.equalsIgnoreCase("a")) {
                        String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, definicion, altura, velocidad, prom_gol_part;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        definicion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Definición"));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Altura"));
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Velocidad"));
                        prom_gol_part = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio de goles por Partido"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.add(new Delantero(definicion, altura, velocidad, prom_gol_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.add(new Delantero(definicion, altura, velocidad, prom_gol_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                    }
                    if (op_jugador.equalsIgnoreCase("b")) {
                        String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, nivel_crea, nivel_dom, prom_asis_part;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        nivel_crea = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Creatividad"));
                        nivel_dom = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Dominio"));
                        prom_asis_part = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio de asistencia por Partido"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.add(new Medio(nivel_crea, nivel_dom, prom_asis_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.add(new Medio(nivel_crea, nivel_dom, prom_asis_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                    }
                    if (op_jugador.equalsIgnoreCase("c")) {
                        String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, nivel_agre, altura, peso, velocidad;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        nivel_agre = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Definición"));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Altura"));
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Peso"));
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Velocidad"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.add(new Defensa(nivel_agre, altura, peso, velocidad, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.add(new Defensa(nivel_agre, altura, peso, velocidad, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                    }
                    if (op_jugador.equalsIgnoreCase("d")) {
                        String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, nivel_juego_aero, nivel_juego_pies;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        nivel_juego_aero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Juego aero"));
                        nivel_juego_pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Juego de pies"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.add(new Portero(nivel_juego_aero, nivel_juego_pies, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.add(new Portero(nivel_juego_aero, nivel_juego_pies, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                    }
                }
            }
            if (opcion.equalsIgnoreCase("b")) {
                int pos;
                for (Jugador t : jugadores) {
                    System.out.println(jugadores.indexOf(t)+". "+ t);
                }
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Jugador a Modificar"));
                if (jugadores.get(pos) instanceof Delantero) {
                    String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, definicion, altura, velocidad, prom_gol_part;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        definicion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Definición"));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Altura"));
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Velocidad"));
                        prom_gol_part = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio de goles por Partido"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.set(pos, new Delantero(definicion, altura, velocidad, prom_gol_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.set(pos, new Delantero(definicion, altura, velocidad, prom_gol_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                }
                if (jugadores.get(pos) instanceof Medio) {
                    String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, nivel_crea, nivel_dom, prom_asis_part;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        nivel_crea = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Creatividad"));
                        nivel_dom = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Dominio"));
                        prom_asis_part = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio de asistencia por Partido"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.set(pos, new Medio(nivel_crea, nivel_dom, prom_asis_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.set(pos, new Medio(nivel_crea, nivel_dom, prom_asis_part, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                }
                if (jugadores.get(pos) instanceof Defensa) {
                    String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, nivel_agre, altura, peso, velocidad;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        nivel_agre = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Definición"));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Altura"));
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Peso"));
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Velocidad"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.set(pos, new Defensa(nivel_agre, altura, peso, velocidad, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.set(pos, new Defensa(nivel_agre, altura, peso, velocidad, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                }
                if (jugadores.get(pos) instanceof Portero) {
                    String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="";
                        int edad, numero=0;
                        double precio, nivel_juego_aero, nivel_juego_pies;
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
                        pais_naci = JOptionPane.showInputDialog("Ingrese Pais de Nacimiento");
                        pie_pre = JOptionPane.showInputDialog("Ingrese Pie Preferido\n"
                                + "a). Derecha\n"
                                + "b). Izquierda\n");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
                        nivel_juego_aero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Juego aero"));
                        nivel_juego_pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nivel de Juego de pies"));
                        if (pie_pre.equalsIgnoreCase("a")) {
                            pie_pre = "Derecha";
                            jugadores.set(pos, new Portero(nivel_juego_aero, nivel_juego_pies, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else if(pie_pre.equalsIgnoreCase("b")){
                            pie_pre = "Izquierda";
                            jugadores.set(pos, new Portero(nivel_juego_aero, nivel_juego_pies, nombre, apellido, edad, estado, pais_naci, pie_pre, numero, precio, equipo));
                        }else{
                            JOptionPane.showInputDialog("Opcion Invalida");
                        }
                }
            }
            if (opcion.equalsIgnoreCase("c")) {
                int pos;
                for (Jugador t : jugadores) {
                    System.out.println(jugadores.indexOf(t)+". "+ t);
                }
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Jugador a Eliminar"));
                jugadores.remove(pos);
            }
        }
    }
    
}
