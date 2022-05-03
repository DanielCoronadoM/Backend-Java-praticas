package practicaMultiverse.Miles;

import practicaMultiverse.Spiderman;

public class Miles extends Spiderman implements  Miles_attack {
    private String color1, color2;
    private String carac_add;

    public Miles(String nombre, String edad, String color1, String color2, String carac_add){
        super(nombre, edad);
        this.color1 = color1;
        this.color2 = color2;
        this.carac_add = carac_add;
    }

    public String getColor1() { return color1; }
    public String getColor2() { return color2; }
    public  String getCarac_add() { return carac_add; }


    //Caracteristicas del personaje
    public String caracteristicas() {
        return  "Caracteristicas: "+
                "\nNombre: "+nombre+
                "\nEdad: "+edad+
                "\nColores: "+color1+", "+color2+", "+
                "\nCaracteristica add: "+carac_add+
                "\n";
    }



    //Metodos de Miles ¿Cómo lo hace?
    @Override
    public void escalar() {
        System.out.println("Escala y trepa paredes");
    }

    @Override
    public void punzada() {
        System.out.println("Su instinto le avisa que hay peligro");

    }

    @Override
    public void web() {
        System.out.println("Lanza su telarania");
    }

    @Override
    public void salto() {
        System.out.println("Da un salto de fe");
    }

    public void patada() {
        System.out.println("Da una patada a su oponente");
    }


    //Secuencia de ataque
    public void attack() {
        salto();
        web();
        escalar();
        punzada();
        patada();
    }
}
