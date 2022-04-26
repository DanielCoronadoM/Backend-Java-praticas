package practicaHarry;

public class Tom {
    public static void main(String[] args) {
        Personaje tom = new Personaje();

        tom.nombre = "Tom Marvolo Riddle";
        tom.alias = "Voldemort";
        tom.genero = "Masculino";
        tom.casa = "Slytherin";
        tom.boggart = "Su propia muerte";
        tom.patronus = "?";

        String msg = "Nombre: "+tom.nombre;
        msg += "\nAlias: "+tom.alias;
        msg += "\nGenero: "+tom.genero;
        msg += "\nCasa: "+tom.casa;
        msg += "\nBoggart: "+tom.boggart;
        msg += "\nPatronus: "+tom.patronus;

        System.out.println(msg);
    }
}