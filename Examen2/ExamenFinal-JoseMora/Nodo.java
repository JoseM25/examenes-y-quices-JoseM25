import java.util.ArrayList;

/**
 * Write a description of class Nodo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nodo
{
    // instance variables - replace the example below with your own
    private Maquina maquina;
    private ArrayList<Nodo> siguientes;

    /**
     * Constructor for objects of class Nodo
     */
    public Nodo(Maquina laMaquinaRecibida)
    {
        maquina=laMaquinaRecibida;
        new ArrayList<Nodo>();
    }
    
    public Maquina getElemento()
    {
        return maquina;
    }
    
    public void setMaquina(Maquina unaMaquina)
    {
        maquina=unaMaquina;
    }
    
    public ArrayList<Nodo> getSiguiente()
    {
        return siguientes;
    }
    
    public void setSiguiente(ArrayList<Nodo> unSiguiente)
    {
        siguientes=unSiguiente;
    }
    
    public String toString()
    {
        String stringFinal=maquina.toString();
        
        return stringFinal;
    }
}
