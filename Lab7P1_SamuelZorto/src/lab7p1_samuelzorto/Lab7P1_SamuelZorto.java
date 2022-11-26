package lab7p1_samuelzorto;

import java.util.Scanner;
import java.util.Random;

public class Lab7P1_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menunu();
    }

    public static void menunu() {
        Seleccion esp = new Seleccion("Grupo E", "España", "Luis Enrique", 26, "Si", "Primero", 0);
        Seleccion ale = new Seleccion("Grupo E", "Alemania", "Hasi Flick", 26, "Si", "Tercero", 0);
        Seleccion cos = new Seleccion("Grupo E", "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarto", 0);
        Seleccion jap = new Seleccion("Grupo E", "Japón", "Hajime Moriyasu", 26, "No", "Segundo", 0);
        Seleccion bel = new Seleccion("Grupo F", "Bélgica", "Roberto Martínez", 26, "No", "Primero", 0);
        Seleccion cro = new Seleccion("Grupo F", "Croacia", "Zlatko Dalić", 26, "No", "Segundo", 0);
        Seleccion can = new Seleccion("Grupo F", "Canadá", "John Herdman", 26, "No", "Cuarto", 0);
        Seleccion mar = new Seleccion("Grupo F", "Marruecos", "Walid Regragui", 26, "No", "Tercero", 0);
        Scanner entrada = new Scanner(System.in);

        String sele1 = "España";
        String sele2 = "Alemania";
        String sele3 = "Costa Rica";
        String sele4 = "Japón";
        String sele5 = "Bélgica";
        String sele6 = "Croacia";
        String sele7 = "Canadá";
        String sele8 = "Marruecos";
        boolean rep = true;
        do {
            System.out.println("============================================");
            System.out.println("Ingrese un numero para elegir un ejercicio:");
            System.out.println("[1] El calamar Pablo");
            System.out.println("[2] Torre de control");
            System.out.println("[3] Salir");
            System.out.println("============================================");
            int menunu = entrada.nextInt();
            System.out.println("");
            boolean NOSE = true;
            switch (menunu) {
                case 1:
                    do {
                        System.out.println("España | Alemania | Costa Rica | Japón | Bélgica | Croacia | Canadá | Marruecos");
                        System.out.print("Ingrese el nombre de una seleccion: ");
                        String sele = entrada.next();
                        if (sele.equalsIgnoreCase(sele1) || sele.equals(sele2) || sele.equals(sele3) || sele.equals(sele4) || sele.equals(sele5) || sele.equals(sele6) || sele.equals(sele7) || sele.equals(sele8)) {
                            if (sele.equalsIgnoreCase(sele1)) {
                                System.out.println("");
                                System.out.println(esp.NombSel + " pertenece al " + esp.grupo);
                                System.out.println("Su director tecnico es " + esp.Director + ".");
                                System.out.println("Tiene " + esp.Jugadores + " jugadores convocados.");
                                System.out.println(esp.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + esp.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + esp.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            } else if (sele.equalsIgnoreCase(sele2)) {
                                System.out.println("");
                                System.out.println(ale.NombSel + " pertenece al " + ale.grupo);
                                System.out.println("Su director tecnico es " + ale.Director + ".");
                                System.out.println("Tiene " + ale.Jugadores + " jugadores convocados.");
                                System.out.println(ale.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + ale.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + ale.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            } else if (sele.equalsIgnoreCase(sele3)) {
                                System.out.println("");
                                System.out.println(cos.NombSel + " pertenece al " + cos.grupo);
                                System.out.println("Su director tecnico es " + cos.Director + ".");
                                System.out.println("Tiene " + cos.Jugadores + " jugadores convocados.");
                                System.out.println(cos.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + cos.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + cos.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            } else if (sele.equalsIgnoreCase(sele4)) {
                                System.out.println("");
                                System.out.println(jap.NombSel + " pertenece al " + jap.grupo);
                                System.out.println("Su director tecnico es " + jap.Director + ".");
                                System.out.println("Tiene " + jap.Jugadores + " jugadores convocados.");
                                System.out.println(jap.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + jap.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + jap.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            } else if (sele.equalsIgnoreCase(sele5)) {
                                System.out.println("");
                                System.out.println(bel.NombSel + " pertenece al " + bel.grupo);
                                System.out.println("Su director tecnico es " + bel.Director + ".");
                                System.out.println("Tiene " + bel.Jugadores + " jugadores convocados.");
                                System.out.println(bel.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + bel.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + bel.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            } else if (sele.equalsIgnoreCase(sele6)) {
                                System.out.println("");
                                System.out.println(cro.NombSel + " pertenece al " + cro.grupo);
                                System.out.println("Su director tecnico es " + cro.Director + ".");
                                System.out.println("Tiene " + cro.Jugadores + " jugadores convocados.");
                                System.out.println(cro.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + cro.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + cro.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            } else if (sele.equalsIgnoreCase(sele7)) {
                                System.out.println("");
                                System.out.println(can.NombSel + " pertenece al " + can.grupo);
                                System.out.println("Su director tecnico es " + can.Director + ".");
                                System.out.println("Tiene " + can.Jugadores + " jugadores convocados.");
                                System.out.println(can.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + can.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + can.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            } else {
                                System.out.println("");
                                System.out.println(mar.NombSel + " pertenece al " + mar.grupo);
                                System.out.println("Su director tecnico es " + mar.Director + ".");
                                System.out.println("Tiene " + mar.Jugadores + " jugadores convocados.");
                                System.out.println(mar.Ganado + " ha ganado un mundial.");
                                System.out.println("Esta en la " + mar.Posicion + " posicion del grupo.");
                                System.out.println("~~~Se ha creado extosamente la seleccion de " + mar.NombSel + "~~~");
                                System.out.println("");
                                NOSE = false;
                            }
                        } else {
                            System.out.println("La seleccion ingresada no es valida");
                            System.out.println("");
                        }
                    } while (NOSE);
                    int gol = new Random().nextInt((7 - 0) + 1) + 0;
                    int gol1 = new Random().nextInt((7 - 0) + 1) + 0;

                    System.out.println("Juega " + esp.NombSel + " contra " + ale.NombSel);
                    System.out.println(esp.NombSel + " " + gol + " □ " + ale.NombSel + " " + gol1);
                    if (gol > gol1) {
                        System.out.println("Ha ganado " + esp.NombSel + "!");
                    } else if (gol1 > gol) {
                        System.out.println("Ha ganado " + ale.NombSel + "!");
                    } else {
                        System.out.println("Han empatado!");
                    }

                    System.out.println("");
                    gol = new Random().nextInt((7 - 0) + 1) + 0;
                    gol1 = new Random().nextInt((7 - 0) + 1) + 0;

                    System.out.println("Juega " + cos.NombSel + " contra " + jap.NombSel);
                    System.out.println(cos.NombSel + " " + gol + " □ " + jap.NombSel + " " + gol1);
                    if (gol > gol1) {
                        System.out.println("Ha ganado " + cos.NombSel + "!");
                    } else if (gol1 > gol) {
                        System.out.println("Ha ganado " + jap.NombSel + "!");
                    } else {
                        System.out.println("Han empatado!");
                    }

                    System.out.println("");
                    gol = new Random().nextInt((7 - 0) + 1) + 0;
                    gol1 = new Random().nextInt((7 - 0) + 1) + 0;

                    System.out.println("Juega " + bel.NombSel + " contra " + mar.NombSel);
                    System.out.println(bel.NombSel + " " + gol + " □ " + mar.NombSel + " " + gol1);
                    if (gol > gol1) {
                        System.out.println("Ha ganado " + bel.NombSel + "!");
                    } else if (gol1 > gol) {
                        System.out.println("Ha ganado " + mar.NombSel + "!");
                    } else {
                        System.out.println("Han empatado!");
                    }

                    System.out.println("");
                    gol = new Random().nextInt((7 - 0) + 1) + 0;
                    gol1 = new Random().nextInt((7 - 0) + 1) + 0;

                    System.out.println("Juega " + cro.NombSel + " contra " + can.NombSel);
                    System.out.println(cro.NombSel + " " + gol + " □ " + can.NombSel + " " + gol1);
                    if (gol > gol1) {
                        System.out.println("Ha ganado " + cro.NombSel + "!");
                    } else if (gol1 > gol) {
                        System.out.println("Ha ganado " + can.NombSel + "!");
                    } else {
                        System.out.println("Han empatado!");
                    }

                    System.out.println("");
                    System.out.println("");
                    break;
                case 2:

                    break;
                default:
                    rep = false;
                    break;
            }
        } while (rep);
    }

    public static void yanoquiero() {
        Scanner entra = new Scanner(System.in);
        Scanner entr = new Scanner(System.in);
        avion av1 = new avion("", "", 0, 0, 0, " ", 3, 3);
        avion av2 = new avion("", "", 0, 0, 0, " ", 3, 3);
        avion av3 = new avion("", "", 0, 0, 0, " ", 3,3 );
        
        
        
        System.out.println("~~Bienvenido al nuevo sistema de torre de control~~");
        System.out.println("Ingrese el modelo del avion: ");
        av1.modelo = entra.nextLine();
        System.out.println("Ingrese el codigo: ");
        av1.codigo = entra.nextLine();
        System.out.println("Ingrese el anio de fabricacion: ");
        av1.fabri = entr.nextInt();
        System.out.println("Ingrese la capacidad maxima de los pasajeros: ");
        av1.capacidad = entr.nextInt();
        System.out.println("Ingrese el peso del avion: ");
        av1.peso = entr.nextInt();
        System.out.println("Ingrese el nombre de la aerolinea: ");
        av1.aerolinea = entra.nextLine();
        System.out.println("~~Se ha agregado el avion exitosamente~~");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Ingrese el modelo del avion: ");
        av2.modelo = entra.nextLine();
        System.out.println("Ingrese el codigo: ");
        av2.codigo = entra.nextLine();
        System.out.println("Ingrese el anio de fabricacion: ");
        av2.fabri = entr.nextInt();
        System.out.println("Ingrese la capacidad maxima de los pasajeros: ");
        av2.capacidad = entr.nextInt();
        System.out.println("Ingrese el peso del avion: ");
        av2.peso = entr.nextInt();
        System.out.println("Ingrese el nombre de la aerolinea: ");
        av2.aerolinea = entra.nextLine();
        System.out.println("~~Se ha agregado el avion exitosamente~~");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Ingrese el modelo del avion: ");
        av3.modelo = entra.nextLine();
        System.out.println("Ingrese el codigo: ");
        av3.codigo = entra.nextLine();
        System.out.println("Ingrese el anio de fabricacion: ");
        av3.fabri = entr.nextInt();
        System.out.println("Ingrese la capacidad maxima de los pasajeros: ");
        av3.capacidad = entr.nextInt();
        System.out.println("Ingrese el peso del avion: ");
        av3.peso = entr.nextInt();
        System.out.println("Ingrese el nombre de la aerolinea: ");
        av3.aerolinea = entra.nextLine();
        System.out.println("~~Se ha agregado el avion exitosamente~~");
        System.out.println("");
        System.out.println("");
        
        
        System.out.print("Desea cambiarle el estado a un avion [S/N]: ");
        char resp = entra.next().charAt(0);
        while(resp == 's' || resp == 'S'){
            System.out.println("Aviones dosponibles: ");
            System.out.println("1." + av1.modelo);
            System.out.println("2." + av2.modelo);
            System.out.println("3." + av3.modelo);
            System.out.print("Ingrese el numero del avion que le dedea cambiar al estado: ");
            int est = entr.nextInt();
            switch(est){
                case 1:
                    System.out.println("~~~Se ha elegido el " + av1.modelo+ "~~~");
                    System.out.println("1. Despegado");
                    System.out.println("2. Aterrizando");
                    System.out.println("e. Estacionado");
                    est = entra.nextInt();
                    av1.act = est;
                    
                    break;
                case 2:
                    System.out.println("~~~Se ha elegido el " + av2.modelo+ "~~~");
                    System.out.println("~~~Se ha elegido el " + av1.modelo+ "~~~");
                    System.out.println("1. Despegado");
                    System.out.println("2. Aterrizando");
                    System.out.println("e. Estacionado");
                    est = entra.nextInt();
                    av2.act = est;
                    
                    break;
                case 3:
                    System.out.println("~~~Se ha elegido el " + av3.modelo+ "~~~");
                    System.out.println("~~~Se ha elegido el " + av1.modelo+ "~~~");
                    System.out.println("1. Despegado");
                    System.out.println("2. Aterrizando");
                    System.out.println("e. Estacionado");
                    est = entra.nextInt();
                    av3.act = est;
                    
                    break;
                default:
                    System.out.println("El numero no es valido");
                    break;
            }
            
            System.out.print("Desea cambiarle el estado a un avion [S/N]: ");
            resp = entra.next().charAt(0);
        }
    }
}
