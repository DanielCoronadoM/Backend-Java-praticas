package practicaHarry;

public class Dumbledore {
    public static void main(String[] args) {
        Personaje dombledore = new Personaje();

        dombledore.nombre = "Albus Percival Wulfric Brian Dumbledore";
        dombledore.alias = "Al";
        dombledore.genero = "Masculino";
        dombledore.casa = "Gryffindor";
        dombledore.boggart = "La muerte de su hermana Ariana";
        dombledore.patronus = "Fenix";

        String msg = "Nombre: "+dombledore.nombre;
        msg += "\nAlias: "+dombledore.alias;
        msg += "\nGenero: "+dombledore.genero;
        msg += "\nCasa: "+dombledore.casa;
        msg += "\nBoggart: "+dombledore.boggart;
        msg += "\nPatronus: "+dombledore.patronus;

        System.out.println(msg);
    }
}
