package Objeto_huevito_kinder;

public class Animal {
    //Caracteristicas del animal
    public int patas;
    public double longitud;
    public String nombre, piel, color, cola;


    public int getPatas() { return patas; }
    public double getLongitud() { return longitud; }
    public String getNombre() { return nombre; }
    public String getPiel() { return piel; }
    public String getColor() {return color; }
    public String getCola() { return cola; }



    public boolean setPatas(int patas){
        if(patas > 0){
            this.patas = patas;
            return true;
        } else
            return false;
    }

    public boolean setLongitud(double longitud){
        if(longitud > 0){
            this.longitud = longitud;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setPiel(String piel){
        if(!piel.isEmpty()){
            this.piel = piel;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }

    public boolean setCola(String cola){
        if(!cola.isEmpty()){
            this.cola = cola;
            return true;
        } else
            return false;
    }
}
