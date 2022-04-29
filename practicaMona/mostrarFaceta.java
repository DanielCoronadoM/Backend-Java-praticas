package practicaMona;

public class mostrarFaceta {
    public static void main(String[] args) {
        Mona octonaut = new Octonaut("Octonaut","Octocat",5, "Astronauta", "blanco", "Explorar el espacio");
        Mona hulatocat = new Hulatocat("Hulatocat", "Octocat", 5, "Falda hawaiwana", "Verde","Ukelele", "Flor", "Bailar");
        Mona manufacturecat = new Manufacturetocat("Manufacturetocat", "Octocat", 5, "Overol", "azul", "Laptop", "Botas", "Gafas", "Casco", "Mantenimiento a lineas de produccion");
        Mona caststello = new Catstello("Octonaut","Octocat",5, "Camiseta", "Morado", "Cabello","Laptop", "Mezcladora", "Audifonos", "Mezclar musica");
        Mona labtocat = new Labtocat("Octonaut","Octocat",5, "Bata de laboratorio", "Blanca", "Botas", "Guantes", "Gafas de seguridad", "Matraz", "Probeta", "Investigacion");
        Mona octomuertos = new Octocatmuertos("Octonaut","Octocat",5, "Catrin", "Negro", "Guitarra", "Poncho", "Mascara de calavera", "Sombrero", "Representar el dia de los muertos");


        //Mostrar las facetas con la funcion 'mostrarMona()'
        System.out.println(octonaut.mostrarMona());
        System.out.println(hulatocat.mostrarMona());
        System.out.println(manufacturecat.mostrarMona());
        System.out.println(caststello.mostrarMona());
        System.out.println(labtocat.mostrarMona());
        System.out.println(octomuertos.mostrarMona());
    }
}
