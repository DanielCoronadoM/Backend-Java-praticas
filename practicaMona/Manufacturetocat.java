package practicaMona;

public class Manufacturetocat extends Mona {
    private String vestimenta;
    private String color;
    private String accesorio1;
    private String accesorio2;
    private String accesorio3;
    private String accesorio4;
    private String actividad;

    public Manufacturetocat(String nombre, String especie, int extremidades, String vestimenta, String color, String accesorio1, String accesorio2, String accesorio3, String accesorio4, String actividad) {
        super(nombre, especie, extremidades);
        this.vestimenta = vestimenta;
        this.color = color;
        this.accesorio1 = accesorio1;
        this.accesorio2 = accesorio2;
        this.accesorio3 = accesorio3;
        this.accesorio4 = accesorio4;
        this.actividad = actividad;
    }

    public String getVestimenta() { return vestimenta; }
    public String getColor() { return color; }
    public String getAccesorio1() { return accesorio1; }
    public String getAccesorio2() { return accesorio2; }
    public String getAccesorio3() { return accesorio3; }
    public String getAccesorio4() { return accesorio4; }
    public String getActividad() { return actividad; }


    public String mostrarMona() {
        return "Nombre: "+nombre+
                "\nEspecie: "+especie+
                "\nExtremidades: "+extremidades+
                "\nVestimenta: "+vestimenta+
                "\nColor: "+color+
                "\nAccesorio1: "+accesorio1+
                "\nAccesorio2: "+accesorio2+
                "\nAccesorio3: "+accesorio3+
                "\nAccesorio4: "+accesorio4+
                "\nActividades: "+actividad+
                "\n";
    }
}
