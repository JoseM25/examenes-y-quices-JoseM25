import java.util.ArrayList;

/**
 *
 *
 * @Jose Antonio Mora
 * @C15114
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
        Nodo nodoAuxiliar=primero;
        if(this.estarVacia()==true){
            primero=nodoNuevo;
        }else{
            int indice=0;
            while(nodoAuxiliar.getSiguiente().get(indice)!=null){
                nodoAuxiliar.setSiguiente(nodoNuevo);
                nodoAuxiliar=nodoAuxiliar.getSiguiente().get(indice);
                indice++;
            }
        }
    }

    public Maquina buscarMaquina(String idBuscado){
        Nodo auxiliar=primero;
        boolean encontrado=false;
        Maquina maquina;
        if(this.estarVacia()==true){
            encontrado=false;
        }else{
            int indice=0;
            while(auxiliar.getSiguiente().get(indice)!=null && encontrado==false)
            {
                if(auxiliar.getMaquina().getIdentificador().equals(idBuscado)){
                    encontrado=true;
                }else{
                    auxiliar=auxiliar.getSiguiente().get(indice);
                }  
            }

            if(auxiliar.getMaquina().getIdentificador().equals(idBuscado)){
                encontrado=true;
            }else{
                encontrado=false;
            }
        }

        if(encontrado==false){
            maquina=new Maquina(0,"cero");
        }else{
            maquina=auxiliar.getMaquina();
        }
        return maquina;
    }
    
    public int costosRecursivos(){
        
        
        
    }

    
    public String toString(){
        String stringFinal="";
        Nodo auxiliar=primero;
        int indice=0;
        if(this.estarVacia()==true){
            stringFinal="No hay nada en la lista";
        }else{
            while(auxiliar.getSiguiente().size()!=indice-1){
                stringFinal=stringFinal+"\n"+auxiliar.getMaquina().getIdentificador();
                stringFinal=stringFinal+" "+auxiliar.getMaquina().getValor();
                auxiliar=auxiliar.getSiguiente().get(indice);
                indice++;
            }
            stringFinal=stringFinal+"\n"+auxiliar.getMaquina().getIdentificador();
            stringFinal=stringFinal+" "+auxiliar.getMaquina().getValor();
        }
        return stringFinal;
    }
}
