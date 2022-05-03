package practicaMultiverse.Gwen;

import practicaMultiverse.Spiderman;

public class Gwen extends Spiderman implements Gwen_attack {
    private String color1, color2, color3;
    private String carac_add;

    public Gwen (String nombre, String edad, String color1, String color2, String color3, String carac_add) {
        super(nombre,edad);
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.carac_add = carac_add;
    }

    public String getColor1() { return color1; }
    public String getColor2() { return color2; }
    public  String getColor3() { return color3; }
    public String getCarac_add() { return carac_add; }


    //Caracteristicas del personaje
    public String caracteristicas() {
        return  "Caracteristicas: "+
                "\nNombre: "+nombre+
                "\nEdad: "+edad+
                "\nColores: "+color1+", "+color2+", "+color3+
                "\nCaracteristica add: "+carac_add+
                "\n";
    }


    //Metodos de Gwen (¿Cómo lo hace?)
    public void escalar() {
        System.out.println("Trepa y escala muros");
    }

    public void punzada() {
        System.out.println("Sabe que hay peligro");
    }

    public void web() {
        System.out.println("Lanza sus telaranias");
    }

    public void columpiarse() {
        System.out.println("Se columpia");
    }

    public void habilidad() {
        System.out.println("Inhanilita a su oponente");
    }

    public void golpe() {
        System.out.println("Golpea con una patada");
    }



    //Secuencia de ataque
    public void attack() {
        punzada();
        escalar();
        web();
        columpiarse();
        golpe();
        habilidad();
    }
}
