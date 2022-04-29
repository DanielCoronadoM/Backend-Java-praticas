package practicaMona;

public class Catstello extends Mona {
    private String vestimenta;
    private String color;
    private String caract_add;
    private String accesorio1;
    private String accesorio2;
    private String accesorio3;
    private String actividad;

    public Catstello(String nombre, String especie, int extremidades, String vestimenta, String color, String caract_add, String accesorio1, String accesorio2, String accesorio3, String actividad) {
        super(nombre, especie, extremidades);
        this.vestimenta = vestimenta;
        this.color = color;
        this.caract_add = caract_add;
        this.accesorio1 = accesorio1;
        this.accesorio2 = accesorio2;
        this.accesorio3 = accesorio3;
        this.actividad = actividad;
    }

    public String getVestimenta() { return vestimenta; }
    public String getColor() { return color; }
    public String getCaract_add() { return caract_add; }
    public String getAccesorio1() { return accesorio1; }
    public String getAccesorio2() { return accesorio2; }
    public String getAccesorio3() { return accesorio3; }
    public String getActividad() { return actividad; }


    public String mostrarMona() {
        return "Nombre: "+nombre+
                "\nEspecie: "+especie+
                "\nExtremidades: "+extremidades+
                "\nVestimenta: "+vestimenta+
                "\nColor: "+color+
                "\nCaracteristica adicional: "+caract_add+
                "\nAccesorio1: "+accesorio1+
                "\nAccesorio2: "+accesorio2+
                "\nAccesorio3: "+accesorio3+
                "\nActividades: "+actividad+
                "\n";
    }
}
