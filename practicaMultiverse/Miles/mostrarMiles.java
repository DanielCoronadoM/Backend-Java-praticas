package practicaMultiverse.Miles;

public class mostrarMiles {
    public static void main(String[] args) {
        Miles miles = new Miles("Miles Morales", "14", "Negro", "Rojo", "Sudadera");

        System.out.println(miles.caracteristicas());
        System.out.println("Secuencia de ataque:");
        miles.attack();
    }
}
