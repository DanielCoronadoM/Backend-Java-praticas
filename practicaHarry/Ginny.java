package practicaHarry;

public class Ginny {
    public static void main(String[] args) {
        Personaje ginny = new Personaje();

        ginny.nombre = "Ginevra Wesley";
        ginny.alias = "Ginny / Gin";
        ginny.genero = "Femenino";
        ginny.casa = "Gryffindor";
        ginny.boggart = "Ser controlada por Voldemort";
        ginny.patronus = "Caballo";

        String msg = "Nombre: "+ginny.nombre;
        msg += "\nAlias: "+ginny.alias;
        msg += "\nGenero: "+ginny.genero;
        msg += "\nCasa: "+ginny.casa;
        msg += "\nBoggart: "+ginny.boggart;
        msg += "\nPatronus: "+ginny.patronus;

        System.out.println(msg);
    }
}
