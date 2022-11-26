/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_samuelzorto;

public class avion {

    public String modelo;
    public String codigo;
    public int fabri;
    public int capacidad;
    public int peso;
    public String aerolinea;
    public int Estado;
    public int act;

    public avion(String modelo, String codigo, int fabri, int capacidad, int peso, String aerolinea, int Estado, int act) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.fabri = fabri;
        this.capacidad = capacidad;
        this.peso = peso;
        this.aerolinea = aerolinea;
        this.Estado = Estado;
        this.act = act;
    }

    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getFabri() {
        return fabri;
    }

    public void setFabri(int fabri) {
        this.fabri = fabri;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getAct() {
        return act;
    }

    public void setAct(int act) {
        this.act = act;
    }
    
    
    
    public void Estado(int Estado){
        switch(act){
                case 1:
                    if(Estado == 3){
                        if(act == 3 || act == 2){
                            System.out.println("Ya esta estacionado");
                        }else if(act == 1){
                            System.out.println("~~~" + modelo + " ahora esta despegando~~~");
                            Estado = 1;
                        }
                    }else if(Estado == 2){
                        if(act == 1 || act == 2){
                            System.out.println("Ya esta aterrizando");
                        }else if(act == 3){
                            System.out.println("~~~" + modelo + "ahora esta estacionado");
                            Estado = 3;
                        }
                    }else if(Estado == 1){
                        if(act == 1 || act == 3){
                            System.out.println("Ya esta despegando");
                        }else if(act == 2){
                            System.out.println("~~~" + modelo + "ahora esta aterrizado");
                            
                        }
                    }else{
                        System.out.println("NUMERO NO VALIDO");
                    }
                case 2:
                    if(Estado == 3){
                        if(act == 3 || act == 2){
                            System.out.println("Ya esta estacionado");
                        }else if(act == 1){
                            System.out.println("~~~" + modelo + " ahora esta despegando~~~");
                            Estado = 1;
                        }
                    }else if(Estado == 2){
                        if(act == 1 || act == 2){
                            System.out.println("Ya esta aterrizando");
                        }else if(act == 3){
                            System.out.println("~~~" + modelo + "ahora esta estacionado");
                            Estado = 3;
                        }
                    }else if(Estado == 1){
                        if(act == 1 || act == 3){
                            System.out.println("Ya esta despegando");
                        }else if(act == 2){
                            System.out.println("~~~" + modelo + "ahora esta aterrizado");
                            
                        }
                    }else{
                        System.out.println("NUMERO NO VALIDO");
                    }
                case 3:
                    if(Estado == 3){
                        if(act == 3 || act == 2){
                            System.out.println("Ya esta estacionado");
                        }else if(act == 1){
                            System.out.println("~~~" + modelo + " ahora esta despegando~~~");
                            Estado = 1;
                        }
                    }else if(Estado == 2){
                        if(act == 1 || act == 2){
                            System.out.println("Ya esta aterrizando");
                        }else if(act == 3){
                            System.out.println("~~~" + modelo + "ahora esta estacionado");
                            Estado = 3;
                        }
                    }else if(Estado == 1){
                        if(act == 1 || act == 3){
                            System.out.println("Ya esta despegando");
                        }else if(act == 2){
                            System.out.println("~~~" + modelo + "ahora esta aterrizado");
                            
                        }
                    }else{
                        System.out.println("NUMERO NO VALIDO");
                    }
                default:
                    System.out.println("El numero no es valido");
                    break;
            }
    }
}
