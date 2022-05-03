package practicaMultiverse.Gwen;


public class mostrarGwen {
    public static void main(String[] args) {
        Gwen gwen = new Gwen("Gwen Stacy", "16", "Rosa", "Negro", "Blanco", "Capucha");

        System.out.println(gwen.caracteristicas());
        System.out.println("Secuencia de ataque: ");
        gwen.attack();
    }
}
