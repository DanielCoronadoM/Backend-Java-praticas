package practicaHarry;

public class Snape {
    public static void main(String[] args) {
        Personaje snape = new Personaje();

        snape.nombre = "Severus Snape";
        snape.alias = "El principe mestizo";
        snape.genero = "Masculino";
        snape.casa = "Slytherin";
        snape.boggart = "?";
        snape.patronus = "Cierva";

        String msg = "Nombre: "+snape.nombre;
        msg += "\nAlias: "+snape.alias;
        msg += "\nGenero: "+snape.genero;
        msg += "\nCasa: "+snape.casa;
        msg += "\nBoggart: "+snape.boggart;
        msg += "\nPatronus: "+snape.patronus;

        System.out.println(msg);
    }
}
