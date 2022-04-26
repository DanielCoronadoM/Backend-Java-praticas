package practicaHarry;

public class Luna {
    public static void main(String[] args) {
        Personaje luna = new Personaje();

        luna.nombre = "Luna Lovegood";
        luna.alias = "Lunatica";
        luna.genero = "Femenino";
        luna.casa = "Ravenclaw";
        luna.boggart = "Muerte de su padre";
        luna.patronus = "Liebre";

        String msg = "Nombre: "+luna.nombre;
        msg += "\nAlias: "+luna.alias;
        msg += "\nGenero: "+luna.genero;
        msg += "\nCasa: "+luna.casa;
        msg += "\nBoggart: "+luna.boggart;
        msg += "\nPatronus: "+luna.patronus;

        System.out.println(msg);
    }
}
