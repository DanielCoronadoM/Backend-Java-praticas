package practicaMona;

public class Mona {
    protected String nombre;
    protected String especie;
    protected int extremidades;

    public Mona (String nombre, String especie, int extremidades) {
        this.nombre = nombre;
        this.especie = especie;
        this.extremidades = extremidades;
    }

    public String getNombre(){ return nombre; }
    public  String getEspecie() { return especie; }
    public int getExtremidades() { return extremidades; }

    public String mostrarMona () {
        return "Nombre: "+nombre+
                "\nEspecie: "+especie+
                "\nExtremidades: "+extremidades;
    }
}
