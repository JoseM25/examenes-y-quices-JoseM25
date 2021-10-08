 


/**
 * Primer Tarea programada, representación del juego de mesa Boggle
 * 
 * @author José Antonio Mora, C15114 y Yasmyn Chacón, B41761
 * @version final
 */
public class Controlador{
    private final String TITULO_VENTANAS = " ";
    private final String NOMBRE_ARCHIVO_IMAGEN = " ";
    private final String MENSAJE = "Escoja una opción";
    private final String[] OPCIONES = {"Salir", "Distribuir Computadoras en laboratorio", "Creditos"}; 
    private Interfaz interfaz;
    private Aula aula;

    public Controlador(){

        interfaz= new Interfaz("Bienvenido", "Computadora.png");
        aula= new Aula(interfaz); 

    }

    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {

                case 1: 
                aula.distribuirComputadoras();
                break;

                case 2:
                aula.mostrarCreditos();
                break;
            }
        }while(opcion > 0);
    }

    public static void main(String[] parametros){
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }

}

