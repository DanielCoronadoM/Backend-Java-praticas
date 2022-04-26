package practicaHarry;

public class Hermione {
    public static void main(String[] args) {
        Personaje hermione = new Personaje();

        hermione.nombre = "Hermione Jean Granger";
        hermione.alias = "Señorita Perfecta";
        hermione.genero = "Femenino";
        hermione.casa = "Gryffindor";
        hermione.boggart = "Ver morir a sus amigos";
        hermione.patronus = "Nutria";

        String msg = "Nombre: "+hermione.nombre;
        msg += "\nAlias. "+hermione.alias;
        msg += "\nGenero: "+hermione.genero;
        msg += "\nCasa: "+hermione.casa;
        msg += "\nBoggart: "+hermione.boggart;
        msg += "\nPatronus: "+hermione.patronus;

        System.out.println(msg);
    }
}
