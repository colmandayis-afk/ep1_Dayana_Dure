package ep1dayana;

public class EjemploPersona {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Juan");
        persona.setEdad(19);

        System.out.println("=== DATOS DE LA PERSONA ===");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        System.out.println("\n=== USANDO MOSTRAR INFORMACIÓN ===");
        persona.mostrarInformacion();
    }
}