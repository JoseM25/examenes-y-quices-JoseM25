import java.util.ArrayList;

/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lista
{
    // instance variables - replace the example below with your own
    private Nodo primero;

    /**
     * Constructor for objects of class Lista
     */
    public Lista()
    {
        primero=null;
    }

    public Nodo getPrimero()
    {
        return primero;
    }

    public void setPrimero(Nodo primeroRecibido)
    {
        primero=primeroRecibido;
    }

    public boolean estarVacia(){
        boolean verdadero=false;
        if (primero==null)
        {
            verdadero=true;  
        }else
        {
            verdadero=false;
        }

        return verdadero;
    }

    public void agregarFinal(Maquina unaMaquina){
        Nodo nodoNuevo=new Nodo(unaMaquina);
        if(this.estarVacia()==true){
            primero=nodoNuevo;
        }else{
            Nodo nodoAuxiliar=primero;
            int indice=0;
            while(nodoAuxiliar.getSiguiente().size()!=indice){
                indice++;
                nodoAuxiliar=nodoAuxiliar.getSiguiente().get(indice);
            }
            nodoAuxiliar.setSiguiente(nodoNuevo);
        }
    }

    // public Maquina buscarMaquina(String idBuscado){
        // Nodo auxiliar=primero;
        // boolean encontrado=false;
        // Maquina elemento;
        // if(this.estarVacia()==true){
            // encontrado=false;
        // }else{
            // while(auxiliar.getSiguiente()!=null && encontrado==false)
            // {
                // if(auxiliar.getMaquina().getIdentificador().equals(idBuscado)){
                    // encontrado=true;
                // }else{
                    // auxiliar=auxiliar.getSiguiente();
                // }  
            // }

            // if(auxiliar.getMaquina().getIdentificador().equals(idBuscado)){
                // encontrado=true;
            // }else{
                // encontrado=false;
            // }
        // }

        // if(encontrado==false){
            // elemento=new Maquina(0,"cero");
        // }else{
            // maquina=auxiliar.getMaquina();
        // }
        // return maquina;
    // }

    // public boolean eliminar(String nombreBorrar)    {       
        // boolean confirmador=false;  
        // Nodo auxiliar=primero;  
        // if(this.estarVacia()==true){           
            // confirmador=false;        
        // }else if(auxiliar.getElemento().getIdentificador().equals(nombreBorrar)){
            // primero=primero.getSiguiente();
            // confirmador=true;
        // }else
            // while((auxiliar.getSiguiente()!=null)&&(confirmador==false)){
                // if((auxiliar.getSiguiente().getSiguiente()!=null)&&(auxiliar.getSiguiente().getElemento().getIdentificador().equals(nombreBorrar))){            
                // auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                // confirmador=true;        
            // }else{  
                // auxiliar=auxiliar.getSiguiente();
            // }   
        // }

        // if(confirmador==false){
            // Nodo auxiliarFinal=primero;
            // while(auxiliarFinal.getSiguiente().getSiguiente()!=null){
                // auxiliarFinal=auxiliarFinal.getSiguiente();
            // }
            // if(auxiliarFinal.getSiguiente().getElemento().getIdentificador().equals(nombreBorrar)){
                // auxiliarFinal.setSiguiente(null);
                // confirmador=true;
            // }
        // }
        // return confirmador;   
    // }
    
    public String toString(){
        String stringFinal="";
        Nodo auxiliar=primero;
        int indice=0;
        if(this.estarVacia()==true){
            stringFinal="No hay nada en la lista";
        }else{
            while(auxiliar.getSiguiente().size()!=indice){
                stringFinal=stringFinal+"\n"+auxiliar.getMaquina().getIdentificador();
                stringFinal=stringFinal+" "+auxiliar.getMaquina().getValor();
                indice++;
                auxiliar=auxiliar.getSiguiente().get(indice);
            }
            stringFinal=stringFinal+"\n"+auxiliar.getMaquina().getIdentificador();
            stringFinal=stringFinal+" "+auxiliar.getMaquina().getValor();
        }
        return stringFinal;
    }
}
