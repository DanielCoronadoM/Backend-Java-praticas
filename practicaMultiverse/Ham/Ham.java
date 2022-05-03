package practicaMultiverse.Ham;

import practicaMultiverse.Spiderman;

public class Ham extends Spiderman extends Ham_attack {
    private String color1, color2;
    private String carac_add;
    private String acces1;

    public String Ham (String nombre, String edad, String color1,String color2, String carac_add, String acces1) {
        super(nombre, edad);
        this.color1 = color1;
        this.color2 = color2;
        this.carac_add = carac_add;
        this.acces1 = acces1;
    }

    public String getColor1() { return color1; }
    public String getColor2() { return color2; }
    public String getCarac_add() { return carac_add; }
    public String getAcces1() { return acces1; }


    //Caracteristicas del personaje
    public String caracteristicas() {
        return  "Caracteristicas: "+
                "\nNombre: "+nombre+
                "\nEdad: "+edad+
                "\nColores: "+color1+", "+color2+", "+
                "\nCaracteristica add: "+carac_add+
                "\nAccesorio: "+acces1+
                "\n";
    }


    //Metodos de Ham
    public void


}
