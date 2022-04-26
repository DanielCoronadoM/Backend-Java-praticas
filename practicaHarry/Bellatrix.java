package practicaHarry;

public class Bellatrix {
    public static void main(String[] args) {
        Personaje bellatrix = new Personaje();

        bellatrix.nombre = "Bellatrix Lestrange";
        bellatrix.alias = "Bella";
        bellatrix.genero = "Femenino";
        bellatrix.casa = "Slytherin";
        bellatrix.boggart = "?";
        bellatrix.patronus = "?";

        String msg = "Nombre: "+bellatrix.nombre;
        msg += "\nAlias: "+bellatrix.alias;
        msg += "\nGenero: "+bellatrix.genero;
        msg += "\nCasa: "+bellatrix.casa;
        msg += "\nBoggart: "+bellatrix.boggart;
        msg += "\nPatronus: "+bellatrix.patronus;

        System.out.println(msg);
    }
}
