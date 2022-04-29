package practicaMona;

public class Hulatocat extends Mona {
    private String vestimenta;
    private String color;
    private String accesorio1;
    private String accesorio2;
    private String actividad;

    public Hulatocat(String nombre, String especie, int extremidades, String vestimenta, String color, String accesorio1, String accesorio2, String actividad) {
        super(nombre, especie, extremidades);
        this.vestimenta = vestimenta;
        this.color = color;
        this.accesorio1 = accesorio1;
        this.accesorio2 = accesorio2;
        this.actividad = actividad;
    }

    public String getVestimenta () { return vestimenta; }
    public String getColor() { return color; }
    public String getAccesorio1() { return accesorio1; }
    public String getAccesorio2() { return accesorio2; }
    public String getActividad () { return actividad; }


    public String mostrarMona() {
        return "Nombre: "+nombre+
                "\nEspecie: "+especie+
                "\nExtremidades: "+extremidades+
                "\nVestimenta: "+vestimenta+
                "\nColor: "+color+
                "\nAccesorio 1: "+accesorio1+
                "\nAccesorio 2: "+accesorio2+
                "\nActividad: "+actividad+
                "\n";
    }
}
