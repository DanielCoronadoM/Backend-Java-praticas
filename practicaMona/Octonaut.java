package practicaMona;

public class Octonaut extends Mona {
    private String vestimenta;
    private String color;
    private String actividad;

    public Octonaut(String nombre, String especie, int extremidades, String vestimenta, String color, String actividad) {
        super(nombre, especie, extremidades);
        this.vestimenta = vestimenta;
        this.color =  color;
        this.actividad = actividad;
    }

    public String getVestimenta() { return vestimenta; }
    public String getColor() { return color; }
    public String getActividad() { return actividad; }


    public String mostrarMona() {
        return "Nombre: "+nombre+
                "\nEspecie: "+especie+
                "\nExtremidades: "+extremidades+
                "\nVestimenta: "+vestimenta+
                "\nColor: "+color+
                "\nActividad: "+actividad+
                "\n";
    }
}
