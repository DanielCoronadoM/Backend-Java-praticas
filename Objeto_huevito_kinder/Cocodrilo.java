package Objeto_huevito_kinder;

public class Cocodrilo {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Animal cocodrilo = new Animal();
        cocodrilo.setNombre("cocodrilo kinder");
        cocodrilo.setPatas(4);
        cocodrilo.setLongitud(6);
        cocodrilo.setPiel("escamosa");
        cocodrilo.setColor("verde");
        cocodrilo.setCola("si");

        String msg = "Un ";
        msg += cocodrilo.getNombre();
        msg += " es un animal de ";
        msg += cocodrilo.getPatas();
        msg += " patas";
        msg += " con una longitud aproximada de ";
        msg += cocodrilo.getLongitud();
        msg += " centimetros. Su piel es ";
        msg += cocodrilo.getPiel();
        msg += ", de color ";
        msg += cocodrilo.getColor();
        msg += " y ";
        msg += cocodrilo.getCola();
        msg += " tiene cola.";


        System.out.print(msg);
    }
}
