package david_guillen_lab3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class David_Guillen_Lab3 {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        ArrayList<Equipo> equipos = new ArrayList();
        ArrayList<Jugador> juga_dis = new ArrayList();
        ArrayList<Integer> numeros = new ArrayList();
        String opcion = "";
        while(!opcion.equalsIgnoreCase("f")){
            
            opcion = JOptionPane.showInputDialog("Ingrese Opcion\n"
                    + "a). Crear Jugador\n"
                    + "b). Modificar Jugador\n"
                    + "c). Eliminar Jugador\n"
                    + "d). Listar Jugador\n"
                    + "e). Crear Equipo\n"
                    + "f). Modificar Equipo\n"
                    + "g). Eliminar Equipo\n"
                    + "h). Listar Equipo\n"
                    + "i). Hacer Compras\n"
                    + "j). Organizar Equipos\n");
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
                juga_dis = jugadores;
            }
            if (opcion.equalsIgnoreCase("b")) {
                int pos;
                for (Jugador t : jugadores) {
                    System.out.println(jugadores.indexOf(t) + ". " + t);
                }
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Jugador a Modificar"));
                if (jugadores.get(pos) instanceof Delantero) {
                    String nombre, apellido, estado="libre", pais_naci, pie_pre, equipo="", op_mod="";
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
                    System.out.println(jugadores.indexOf(t) + ". " + t);
                }
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Jugador a Eliminar"));
                jugadores.remove(pos);
            }
            if (opcion.equalsIgnoreCase("d")) {
                for (Jugador t : jugadores) {
                    System.out.println(jugadores.indexOf(t) + ". " + t);
                }
            }
            if (opcion.equalsIgnoreCase("e")) {
                String nombre, ciudad;
                int palmares;
                double presupuesto;
                nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                palmares = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Palmares"));
                ciudad = JOptionPane.showInputDialog("Ingrese Ciudad");
                presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Presupuesto"));
                equipos.add(new Equipo(nombre, palmares, ciudad, presupuesto));
            }
            if (opcion.equalsIgnoreCase("f")) {
                String nombre, ciudad;
                int palmares;
                double presupuesto;
                String op_mod_e="";
                int pos;
                for (Equipo t : equipos) {
                    System.out.println(equipos.indexOf(t) + ". " + t);
                }
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Equipo a Modificar"));
                while(!op_mod_e.equalsIgnoreCase("")){
                    op_mod_e= JOptionPane.showInputDialog("Que Desea Modificar\n"
                            + "a). Nombre\n"
                            + "b). Palmares\n"
                            + "c). Ciudad\n"
                            + "d). Presupuesto\n"
                            + "e). Salir\n");
                    if (op_mod_e.equalsIgnoreCase("a")) {
                        nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                        equipos.get(pos).setNombre(nombre);
                    }
                    if (op_mod_e.equalsIgnoreCase("b")) {
                        palmares = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Palmares"));
                        equipos.get(pos).setPalmares(palmares);
                    }
                    if (op_mod_e.equalsIgnoreCase("c")) {
                        ciudad = JOptionPane.showInputDialog("Ingrese Ciudad");
                        equipos.get(pos).setCiudad(ciudad);
                    }
                    if (op_mod_e.equalsIgnoreCase("d")) {
                        presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Presupuesto"));
                        equipos.get(pos).setPresupuesto(presupuesto);
                    }
                }
            }
            if (opcion.equalsIgnoreCase("g")) {
                int pos;
                for (Equipo t : equipos) {
                    System.out.println(equipos.indexOf(t) + ". " + t);
                }
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Equipo a Eliminar"));
                equipos.remove(pos);
            }
            if (opcion.equalsIgnoreCase("h")) {
                for (Equipo t : equipos) {
                    System.out.println(equipos.indexOf(t) + ". " + t);
                }
            }
            if (opcion.equalsIgnoreCase("i")) {
                numeros.add(0);
                String op_compra="";
                int numero=0;
                while(!op_compra.equalsIgnoreCase("no")){
                    int pos=0, pos_j=0;
                    double fac=0;
                    for (Equipo t : equipos) {
                        System.out.println(equipos.indexOf(t) + ". " + t);
                    }
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Equipo que hara la Compra"));
                    for (Jugador t : juga_dis) {
                        System.out.println(juga_dis.indexOf(t) + ". " + t);
                    }
                    pos_j = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Jugador que desea comprar"));
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero que tendra el jugador"));
                    for (Integer t : numeros) {
                        if (numero == t) {
                            JOptionPane.showInputDialog("Numero ya Existe");
                        }else{
                            numeros.add(numero);
                            juga_dis.get(pos_j).setNumero(0);
                        }
                    }
                    equipos.get(pos).getJugadores().add(juga_dis.get(pos_j));
                    fac = equipos.get(pos).getPresupuesto() - juga_dis.get(pos_j).getPrecio();
                    equipos.get(pos).setPresupuesto(fac);
                    juga_dis.get(pos_j).setEquipo(equipos.get(pos).getNombre());
                    juga_dis.remove(pos_j);
                    op_compra = JOptionPane.showInputDialog("Desea Seguir Comprando?\n"
                            + "si\n"
                            + "no\n");
                }
            }
            if (opcion.equalsIgnoreCase("j")) {
                ArrayList tem = new ArrayList();
                ArrayList titu = new ArrayList();
                ArrayList supe = new ArrayList();
                int pos, can_def, can_med, can_del, cont_def=0, cont_med=0, cont_del=0;
                String op_organizar="";
                for (Equipo t : equipos) {
                        System.out.println(equipos.indexOf(t) + ". " + t);
                    }
                pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Equipo a Organizar"));
                can_def = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Defensas"));
                can_med = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Medios"));
                can_del = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Delanteros"));
                if (can_def + can_med + can_del != 11) {
                    JOptionPane.showMessageDialog(null, "La alineacion es incorrecta");
                }
                tem = equipos.get(pos).getJugadores();
                for (Object t : tem) {
                    if (t instanceof Delantero) {
                        cont_del++;
                    }
                    if (t instanceof Medio) {
                        cont_med++;
                    }
                    if (t instanceof Defensa) {
                        cont_def++;
                    }
                }
                if (can_def >= cont_def || can_med >= cont_med || can_def >= cont_def) {
                    JOptionPane.showMessageDialog(null, "La Alineacion no se puede reaizar por falta de jugadores");
                }
                
                while(!op_organizar.equalsIgnoreCase("no")){
                    for (Object t : tem) {
                    System.out.println(tem.indexOf(t) + ". " + t);
                    }
                    
                    op_organizar = JOptionPane.showInputDialog("Desea Seguir\n"
                            + "si\n"
                            + "no\n");
                }
            }
        }
    }
    
}
